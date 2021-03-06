select
    rownum as rn
--    , ALL_TAB_COLS.*
    , ALL_TAB_COLS.TABLE_NAME
    , ALL_TAB_COMMENTS.COMMENTS
    , ALL_TAB_COLS.COLUMN_NAME
    , ALL_COL_COMMENTS.COMMENTS
    , ALL_TAB_COLS.DATA_TYPE
    , ALL_TAB_COLS.DATA_LENGTH
    , ALL_TAB_COLS.NULLABLE
    , ALL_TAB_COLS.COLUMN_ID
    , lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) as CAMEL_CASE
    , initcap(lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1))) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) as PASCAL_CASE
    /* insert */
    , '    , ' || ALL_TAB_COLS.COLUMN_NAME || ' /* ' || ALL_COL_COMMENTS.COMMENTS || ' */' as INSERT1
    , '    , #' || lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || '# /* ' || ALL_COL_COMMENTS.COMMENTS || ' */' as INSERT1_IBATIS
    , '/** ' || ALL_TAB_COLS.TABLE_NAME || '.' || ALL_TAB_COLS.COLUMN_NAME || ', ' || ALL_TAB_COMMENTS.COMMENTS || '.' || ALL_COL_COMMENTS.COMMENTS || ' */ private String ' || lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || ';' as INSERT1_PRIVATE
    , 'vo.set' || initcap(lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1))) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || '(' || decode(ALL_TAB_COLS.DATA_TYPE, 'NUMBER', '0', '"' || ALL_COL_COMMENTS.COMMENTS || '"') || '); // ' || ALL_COL_COMMENTS.COMMENTS as INSERT1_SET
    /* select */
    , '    , ' || ALL_TAB_COLS.TABLE_NAME || '.' || ALL_TAB_COLS.COLUMN_NAME || ' /* ' || ALL_TAB_COMMENTS.COMMENTS || '.' || ALL_COL_COMMENTS.COMMENTS || ' */' as select1
/* sqlMap */
    , '<result property="' || lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || '" column="' || ALL_TAB_COLS.COLUMN_NAME || '" />' as resultMap
from ALL_TAB_COLS
left outer join ALL_TAB_COMMENTS on ALL_TAB_COMMENTS.OWNER = ALL_TAB_COLS.OWNER and ALL_TAB_COMMENTS.TABLE_NAME = ALL_TAB_COLS.TABLE_NAME
left outer join ALL_COL_COMMENTS on ALL_COL_COMMENTS.OWNER = ALL_TAB_COLS.OWNER and ALL_COL_COMMENTS.TABLE_NAME = ALL_TAB_COLS.TABLE_NAME and ALL_COL_COMMENTS.COLUMN_NAME = ALL_TAB_COLS.COLUMN_NAME
where 1 = 1
    and ALL_TAB_COLS.OWNER = 'TEST'
    and ALL_TAB_COLS.TABLE_NAME = 'COMTCCMMNDETAILCODE' /* 공통상세코드 */
order by
    ALL_TAB_COLS.COLUMN_ID
;

select
    *
from COMTCCMMNDETAILCODE /* 공통상세코드 */
;

select
    COMTCCMMNDETAILCODE.CODE_ID /* 공통상세코드.코드ID */
    , COMTCCMMNDETAILCODE.CODE /* 공통상세코드.코드 */
    , COMTCCMMNDETAILCODE.CODE_NM /* 공통상세코드.코드명 */
    , COMTCCMMNDETAILCODE.CODE_DC /* 공통상세코드.코드설명 */
    , COMTCCMMNDETAILCODE.USE_AT /* 공통상세코드.사용여부 */
    , COMTCCMMNDETAILCODE.FRST_REGIST_PNTTM /* 공통상세코드.최초등록시점 */
    , COMTCCMMNDETAILCODE.FRST_REGISTER_ID /* 공통상세코드.최초등록자ID */
    , COMTCCMMNDETAILCODE.LAST_UPDT_PNTTM /* 공통상세코드.최종수정시점 */
    , COMTCCMMNDETAILCODE.LAST_UPDUSR_ID /* 공통상세코드.최종수정자ID */
from COMTCCMMNDETAILCODE /* 공통상세코드 */
where 1 = 1
    and COMTCCMMNDETAILCODE.USE_AT = 'Y' /* 공통상세코드.사용여부 */
--    and COMTCCMMNDETAILCODE.CODE_ID = 'COM001' /* 공통상세코드.코드ID */
--    and COMTCCMMNDETAILCODE.FRST_REGISTER_ID = 'SYSTEM2' /* 공통상세코드.최초등록자ID */
--    and COMTCCMMNDETAILCODE.CODE_ID in (
--        'COM001'
--        , 'COM002'
--    ) /* 공통상세코드.코드ID */
order by
    COMTCCMMNDETAILCODE.CODE_ID /* 공통상세코드.코드ID */
    , COMTCCMMNDETAILCODE.CODE /* 공통상세코드.코드 */
;

select * from COMTCCMMNCODE;

delete from COMTCCMMNDETAILCODE /* 공통상세코드 */
where 1 = 1
    and COMTCCMMNDETAILCODE.CODE_ID = 'COM001' /* 공통상세코드.코드ID */
    and COMTCCMMNDETAILCODE.CODE = '01' /* 공통상세코드.코드 */
    and COMTCCMMNDETAILCODE.FRST_REGISTER_ID = 'SYSTEM2' /* 공통상세코드.최초등록자ID */
;

select sysdate from dual
;

select
    lpad(nvl(max(CODE), 0) + 1, 2, 0) /* 코드 */
from COMTCCMMNDETAILCODE /* 공통상세코드 */
where 1 = 1
    and COMTCCMMNDETAILCODE.CODE_ID = 'COM001' /* 공통상세코드.코드ID */
    and COMTCCMMNDETAILCODE.FRST_REGISTER_ID = 'SYSTEM2' /* 공통상세코드.최초등록자ID */
;

select
    *
from COMTCCMMNDETAILCODE COM_TC_CMMN_DETAIL_CODE
;

select
/*+ index(CMMN_DETAIL_CODE COMTCCMMNDETAILCODE_PK) */
    *
from COMTCCMMNDETAILCODE CMMN_DETAIL_CODE
where 1 = 1
    and CODE_ID = 'COM001'
;

update COMTCCMMNDETAILCODE set CODE_DC = null
where 1 = 1
    and CODE_ID = 'COM001'
;

insert into COMTCCMMNDETAILCODE (CODE_ID, CODE, CODE_NM, CODE_DC, USE_AT, FRST_REGIST_PNTTM)
values ('GOD001', '01', '구분코드', '구분코드', 'Y', sysdate);

select
    COMTCCMMNDETAILCODE.CODE_ID /* 공통상세코드.코드ID */
    , count(*) as CNT
from COMTCCMMNDETAILCODE /* 공통상세코드 */
where 1 = 1
    and COMTCCMMNDETAILCODE.USE_AT = 'Y' /* 공통상세코드.사용여부 */
group by
    COMTCCMMNDETAILCODE.CODE_ID /* 공통상세코드.코드ID */
order by
    COMTCCMMNDETAILCODE.CODE_ID /* 공통상세코드.코드ID */
;

delete from COMTCCMMNDETAILCODE /* 공통상세코드 */
where 1 = 1
    and FRST_REGISTER_ID = 'SYSTEM2'
;

select
/*+ index(CMMN_DETAIL_CODE COMTCCMMNDETAILCODE_PK) */
    rownum as RN
    , CMMN_DETAIL_CODE.CODE_ID /* 공통상세코드.코드ID */
    , CMMN_DETAIL_CODE.CODE /* 공통상세코드.코드 */
    , CMMN_DETAIL_CODE.CODE_NM /* 공통상세코드.코드명 */
    , CMMN_DETAIL_CODE.CODE_DC /* 공통상세코드.코드설명 */
    , CMMN_DETAIL_CODE.USE_AT /* 공통상세코드.사용여부 */
    , CMMN_DETAIL_CODE.FRST_REGIST_PNTTM /* 공통상세코드.최초등록시점 */
    , CMMN_DETAIL_CODE.FRST_REGISTER_ID /* 공통상세코드.최초등록자ID */
    , CMMN_DETAIL_CODE.LAST_UPDT_PNTTM /* 공통상세코드.최종수정시점 */
    , CMMN_DETAIL_CODE.LAST_UPDUSR_ID /* 공통상세코드.최종수정자ID */
from COMTCCMMNDETAILCODE CMMN_DETAIL_CODE /* 공통상세코드 */
where 1 = 1
    and CMMN_DETAIL_CODE.USE_AT = 'Y' /* 공통상세코드.사용여부 */
order by
    CMMN_DETAIL_CODE.CODE_ID /* 공통상세코드.코드ID */
    , CMMN_DETAIL_CODE.CODE_DC /* 공통상세코드.코드설명 */
;
