select
--    /*+ index(COMTNFILEDETAIL COMTNFILEDETAIL_PK) */
    /*+ index_desc(COMTNFILEDETAIL COMTNFILEDETAIL_PK) */
    *
from COMTNFILEDETAIL /* 파일상세정보 */
where 1 = 1
--    and ATCH_FILE_ID in (
--        ''
----        , 'FILE_000000000000201'
----        , 'FILE_000000000000211'
--        , 'FILE_000000000000221'
--    )
--    and ATCH_FILE_ID = 'FILE_000000000000201'
--    and (
--        FILE_SN = 0
--        or FILE_SN > 0
--    )
--    and FILE_SN is not null
--    and FILE_SN > 0
;

select
    ATCH_FILE_ID
    , count(*) as CNT
from COMTNFILEDETAIL /* 파일상세정보 */
where 1 = 1
group by
    ATCH_FILE_ID
order by
    CNT desc
;

select
    min(FILE_SN)
    , max(FILE_SN)
from COMTNFILEDETAIL /* 파일상세정보 */
;

select * from all_tab_cols where 1 = 1
    and OWNER = 'TEST'
    and COLUMN_NAME = 'ATCH_FILE_ID'
order by
    TABLE_NAME
;

select * from COMTHEMAILDSPTCHMANAGE /* 메일발신관리 */
;
