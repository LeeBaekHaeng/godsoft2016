/*
생년월일, 사업자등록번호, 법인등록번호

사업자등록번호
123-12-12345

법인 등기번호
123456
법인 등록번호
123456-1234567
*/

select
    A1
    , A2
    , B1
    , B2
    , case
        when A1 = '01' then substr(regexp_replace(B1, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2'), 1, 6) || '-*******'
        when A1 = '02' then regexp_replace(B1, '^([0-9]{3})-?([0-9]{2})-?([0-9]{5})$$', '\1-\2-\3')
        when A1 = '03' then regexp_replace(B1, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2')
        else B1
    end as B1_01
    , case
        when A1 = '01' then substr(regexp_replace(B2, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2'), 1, 6) || '-*******'
        when A1 = '02' then regexp_replace(B2, '^([0-9]{3})-?([0-9]{2})-?([0-9]{5})$$', '\1-\2-\3')
        when A1 = '03' then regexp_replace(B2, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2')
        else B2
    end as B2_01
    , fn_cm_god_rgno(A1, B1) as B1_02
    , fn_cm_god_rgno(A1, B2) as B2_02
from (
    select
        '01' as A1
        , '주민등록번호' as A2
        , '1234561234567' as B1
        , '123456-1234567' as B2
    from dual
    union all
    select
        '02' as A1
        , '사업자등록번호' as A2
        , '1231212345' as B1
        , '123-12-12345' as B2
    from dual
    union all
    select
        '03' as A1
        , '법인등록번호' as A2
        , '1234561234567' as B1
        , '123456-1234567' as B2
    from dual
    union all
    select
        '04' as A1
        , '법인등록번호' as A2
        , '1234561234567' as B1
        , '123456-1234567' as B2
    from dual
    union all
    select
        '03' as A1
        , '주민등록번호' as A2
        , '1234561234567' as B1
        , '123456-1234567' as B2
    from dual
)
;
