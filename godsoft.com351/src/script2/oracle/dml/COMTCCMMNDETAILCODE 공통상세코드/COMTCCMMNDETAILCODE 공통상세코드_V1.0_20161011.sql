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
    and ALL_TAB_COLS.TABLE_NAME = 'COMTCCMMNDETAILCODE' /* ������ڵ� */
order by
    ALL_TAB_COLS.COLUMN_ID
;

select
    *
from COMTCCMMNDETAILCODE /* ������ڵ� */
;

select
    COMTCCMMNDETAILCODE.CODE_ID /* ������ڵ�.�ڵ�ID */
    , COMTCCMMNDETAILCODE.CODE /* ������ڵ�.�ڵ� */
    , COMTCCMMNDETAILCODE.CODE_NM /* ������ڵ�.�ڵ�� */
    , COMTCCMMNDETAILCODE.CODE_DC /* ������ڵ�.�ڵ弳�� */
    , COMTCCMMNDETAILCODE.USE_AT /* ������ڵ�.��뿩�� */
    , COMTCCMMNDETAILCODE.FRST_REGIST_PNTTM /* ������ڵ�.���ʵ�Ͻ��� */
    , COMTCCMMNDETAILCODE.FRST_REGISTER_ID /* ������ڵ�.���ʵ����ID */
    , COMTCCMMNDETAILCODE.LAST_UPDT_PNTTM /* ������ڵ�.������������ */
    , COMTCCMMNDETAILCODE.LAST_UPDUSR_ID /* ������ڵ�.����������ID */
from COMTCCMMNDETAILCODE /* ������ڵ� */
where 1 = 1
    and COMTCCMMNDETAILCODE.USE_AT = 'Y' /* ������ڵ�.��뿩�� */
--    and COMTCCMMNDETAILCODE.CODE_ID = 'COM001' /* ������ڵ�.�ڵ�ID */
--    and COMTCCMMNDETAILCODE.FRST_REGISTER_ID = 'SYSTEM2' /* ������ڵ�.���ʵ����ID */
--    and COMTCCMMNDETAILCODE.CODE_ID in (
--        'COM001'
--        , 'COM002'
--    ) /* ������ڵ�.�ڵ�ID */
order by
    COMTCCMMNDETAILCODE.CODE_ID /* ������ڵ�.�ڵ�ID */
    , COMTCCMMNDETAILCODE.CODE /* ������ڵ�.�ڵ� */
;

select * from COMTCCMMNCODE;

delete from COMTCCMMNDETAILCODE /* ������ڵ� */
where 1 = 1
    and COMTCCMMNDETAILCODE.CODE_ID = 'COM001' /* ������ڵ�.�ڵ�ID */
    and COMTCCMMNDETAILCODE.CODE = '01' /* ������ڵ�.�ڵ� */
    and COMTCCMMNDETAILCODE.FRST_REGISTER_ID = 'SYSTEM2' /* ������ڵ�.���ʵ����ID */
;

select sysdate from dual
;

select
    lpad(nvl(max(CODE), 0) + 1, 2, 0) /* �ڵ� */
from COMTCCMMNDETAILCODE /* ������ڵ� */
where 1 = 1
    and COMTCCMMNDETAILCODE.CODE_ID = 'COM001' /* ������ڵ�.�ڵ�ID */
    and COMTCCMMNDETAILCODE.FRST_REGISTER_ID = 'SYSTEM2' /* ������ڵ�.���ʵ����ID */
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
values ('GOD001', '01', '�����ڵ�', '�����ڵ�', 'Y', sysdate);

select
    COMTCCMMNDETAILCODE.CODE_ID /* ������ڵ�.�ڵ�ID */
    , count(*) as CNT
from COMTCCMMNDETAILCODE /* ������ڵ� */
where 1 = 1
    and COMTCCMMNDETAILCODE.USE_AT = 'Y' /* ������ڵ�.��뿩�� */
group by
    COMTCCMMNDETAILCODE.CODE_ID /* ������ڵ�.�ڵ�ID */
order by
    COMTCCMMNDETAILCODE.CODE_ID /* ������ڵ�.�ڵ�ID */
;

delete from COMTCCMMNDETAILCODE /* ������ڵ� */
where 1 = 1
    and FRST_REGISTER_ID = 'SYSTEM2'
;

select
/*+ index(CMMN_DETAIL_CODE COMTCCMMNDETAILCODE_PK) */
    rownum as RN
    , CMMN_DETAIL_CODE.CODE_ID /* ������ڵ�.�ڵ�ID */
    , CMMN_DETAIL_CODE.CODE /* ������ڵ�.�ڵ� */
    , CMMN_DETAIL_CODE.CODE_NM /* ������ڵ�.�ڵ�� */
    , CMMN_DETAIL_CODE.CODE_DC /* ������ڵ�.�ڵ弳�� */
    , CMMN_DETAIL_CODE.USE_AT /* ������ڵ�.��뿩�� */
    , CMMN_DETAIL_CODE.FRST_REGIST_PNTTM /* ������ڵ�.���ʵ�Ͻ��� */
    , CMMN_DETAIL_CODE.FRST_REGISTER_ID /* ������ڵ�.���ʵ����ID */
    , CMMN_DETAIL_CODE.LAST_UPDT_PNTTM /* ������ڵ�.������������ */
    , CMMN_DETAIL_CODE.LAST_UPDUSR_ID /* ������ڵ�.����������ID */
from COMTCCMMNDETAILCODE CMMN_DETAIL_CODE /* ������ڵ� */
where 1 = 1
    and CMMN_DETAIL_CODE.USE_AT = 'Y' /* ������ڵ�.��뿩�� */
order by
    CMMN_DETAIL_CODE.CODE_ID /* ������ڵ�.�ڵ�ID */
    , CMMN_DETAIL_CODE.CODE_DC /* ������ڵ�.�ڵ弳�� */
;
