/*
syscat
*/

select
    ROWNUM as ROWNUM_01
/* VO */
    , case
        when DATA_TYPE = 'NUMBER' then
            '/** ' || TABLE_NAME || '.' || COLUMN_NAME || ', ' || TABLE_COMMENT || '.' || COLUMN_COMMENT || ' */ private Integer ' || lower(substr(replace(initcap(COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(COLUMN_NAME), '_'), 2) || ';'
        else
            '/** ' || TABLE_NAME || '.' || COLUMN_NAME || ', ' || TABLE_COMMENT || '.' || COLUMN_COMMENT || ' */ private String ' || lower(substr(replace(initcap(COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(COLUMN_NAME), '_'), 2) || ';'
    end as VO_PRIVATE
--    , 'vo.set' || initcap(lower(substr(replace(initcap(COLUMN_NAME), '_'), 1, 1))) || substr(replace(initcap(COLUMN_NAME), '_'), 2) || '(' || decode(DATA_TYPE, 'NUMBER', '0', '"' || COLUMN_COMMENT || '"') || '); // ' || COLUMN_COMMENT as INSERT_SET
/* select */
    , '    , ' || TABLE_NAME || '.' || COLUMN_NAME || ' /* ' || TABLE_COMMENT || '.' || COLUMN_COMMENT || ' */' as SELECT_01
    , TABLE_NAME
    , TABLE_COMMENT
    , COLUMN_NAME
    , COLUMN_COMMENT
    , DATA_TYPE
    , DATA_LENGTH
    , NULLABLE
    , COLUMN_ID
    , CAMEL_CASE
    , PASCAL_CASE
from (
    select
        ROWNUM as ROWNUM_01
        , ALL_TAB_COLUMNS.TABLE_NAME
        , ALL_TAB_COMMENTS.COMMENTS as TABLE_COMMENT
        , ALL_TAB_COLUMNS.COLUMN_NAME
        , ALL_COL_COMMENTS.COMMENTS as COLUMN_COMMENT
        , ALL_TAB_COLUMNS.DATA_TYPE
        , ALL_TAB_COLUMNS.DATA_LENGTH
        , ALL_TAB_COLUMNS.NULLABLE
        , ALL_TAB_COLUMNS.COLUMN_ID
        , lower(substr(replace(initcap(ALL_TAB_COLUMNS.COLUMN_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TAB_COLUMNS.COLUMN_NAME), '_'), 2) as CAMEL_CASE
        , initcap(lower(substr(replace(initcap(ALL_TAB_COLUMNS.COLUMN_NAME), '_'), 1, 1))) || substr(replace(initcap(ALL_TAB_COLUMNS.COLUMN_NAME), '_'), 2) as PASCAL_CASE
    from ALL_TAB_COLUMNS
    left outer join ALL_TAB_COMMENTS on ALL_TAB_COMMENTS.OWNER = ALL_TAB_COLUMNS.OWNER and ALL_TAB_COMMENTS.TABLE_NAME = ALL_TAB_COLUMNS.TABLE_NAME
    left outer join ALL_COL_COMMENTS on ALL_COL_COMMENTS.OWNER = ALL_TAB_COLUMNS.OWNER and ALL_COL_COMMENTS.TABLE_NAME = ALL_TAB_COLUMNS.TABLE_NAME and ALL_COL_COMMENTS.COLUMN_NAME = ALL_TAB_COLUMNS.COLUMN_NAME
    where 1 = 1
        and ALL_TAB_COLUMNS.OWNER = 'TEST'
        and ALL_TAB_COLUMNS.TABLE_NAME = 'COMTCADMINISTCODERECPTNLOG' /* 행정코드수신로그 */
    order by
        ALL_TAB_COLUMNS.COLUMN_ID
)
;
