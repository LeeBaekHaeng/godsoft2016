select
    *
from COMTCCMMNCODE /* 공통코드 */
where 1 = 1
--    and CODE_ID not like 'COM%'
    and FRST_REGISTER_ID = 'SYSTEM2'
;

insert into COMTCCMMNCODE (CODE_ID, CODE_ID_NM, CODE_ID_DC, USE_AT, CL_CODE, FRST_REGIST_PNTTM)
values ('GOD001', '구분코드', '구분코드', 'Y', 'EFC', sysdate);

delete from COMTCCMMNCODE /* 공통코드 */
where 1 = 1
--    and CODE_ID not like 'COM%'
    and FRST_REGISTER_ID = 'SYSTEM2'
;
