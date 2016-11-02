select
    ROWNUM as ROWNUM_01
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
    , '    , ' || ALL_TAB_COLS.COLUMN_NAME || ' /* ' || ALL_COL_COMMENTS.COMMENTS || ' */' as INSERT_01
    , '    , #' || lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || '# /* ' || ALL_COL_COMMENTS.COMMENTS || ' */' as INSERT_IBATIS
    , '/** ' || ALL_TAB_COLS.TABLE_NAME || '.' || ALL_TAB_COLS.COLUMN_NAME || ', ' || ALL_TAB_COMMENTS.COMMENTS || '.' || ALL_COL_COMMENTS.COMMENTS || ' */ private String ' || lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || ';' as INSERT_PRIVATE
    , 'vo.set' || initcap(lower(substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 1, 1))) || substr(replace(initcap(ALL_TAB_COLS.COLUMN_NAME), '_'), 2) || '(' || decode(ALL_TAB_COLS.DATA_TYPE, 'NUMBER', '0', '"' || ALL_COL_COMMENTS.COMMENTS || '"') || '); // ' || ALL_COL_COMMENTS.COMMENTS as INSERT_SET
/* select */
    , '    , ' || ALL_TAB_COLS.TABLE_NAME || '.' || ALL_TAB_COLS.COLUMN_NAME || ' /* ' || ALL_TAB_COMMENTS.COMMENTS || '.' || ALL_COL_COMMENTS.COMMENTS || ' */' as SELECT_01
from ALL_TAB_COLS
left outer join ALL_TAB_COMMENTS on ALL_TAB_COMMENTS.OWNER = ALL_TAB_COLS.OWNER and ALL_TAB_COMMENTS.TABLE_NAME = ALL_TAB_COLS.TABLE_NAME
left outer join ALL_COL_COMMENTS on ALL_COL_COMMENTS.OWNER = ALL_TAB_COLS.OWNER and ALL_COL_COMMENTS.TABLE_NAME = ALL_TAB_COLS.TABLE_NAME and ALL_COL_COMMENTS.COLUMN_NAME = ALL_TAB_COLS.COLUMN_NAME
where 1 = 1
    and ALL_TAB_COLS.OWNER = 'TEST'
--    and ALL_TAB_COLS.TABLE_NAME = 'COMTCCMMNDETAILCODE' /* 공통상세코드 */
--    and ALL_TAB_COLS.TABLE_NAME = 'COMTNMENUCREATDTLS' /* 메뉴생성내역 */
    and ALL_TAB_COLS.TABLE_NAME = 'COMTNSITEMAP' /* 사이트맵 */
order by
    ALL_TAB_COLS.COLUMN_ID
;

