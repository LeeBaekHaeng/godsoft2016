select
    ALL_TABLES.OWNER 
    , ALL_TABLES.TABLE_NAME
    , ALL_TAB_COMMENTS.COMMENTS as TABLE_COMMENT
    , lower(substr(replace(initcap(ALL_TABLES.TABLE_NAME), '_'), 1, 1)) || substr(replace(initcap(ALL_TABLES.TABLE_NAME), '_'), 2) as TABLE_CAMEL_CASE
    , initcap(lower(substr(replace(initcap(ALL_TABLES.TABLE_NAME), '_'), 1, 1))) || substr(replace(initcap(ALL_TABLES.TABLE_NAME), '_'), 2) as TABLE_PASCAL_CASE
    , ALL_TABLES.*
from ALL_TABLES
left outer join ALL_TAB_COMMENTS on ALL_TAB_COMMENTS.OWNER = ALL_TABLES.OWNER and ALL_TAB_COMMENTS.TABLE_NAME = ALL_TABLES.TABLE_NAME
where 1 = 1
    and ALL_TABLES.OWNER = 'TEST'
order by
    ALL_TABLES.TABLE_NAME
;
