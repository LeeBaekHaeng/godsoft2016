/* 행정코드 */

drop synonym TEST.ADMINIST_CODE;

create or replace synonym TEST.ADMINIST_CODE for TEST.COMTCADMINISTCODE;

select
    rownum as RN
    , 'drop synonym GOD_' || ALL_TAB_COMMENTS.OWNER || '.' || ALL_TAB_COMMENTS.TABLE_NAME || ';' as DROP_SYNONYM
    , 'drop synonym GOD_' || ALL_TAB_COMMENTS.OWNER || '.' || ALL_TAB_COMMENTS.TABLE_NAME || '; /* ' || ALL_TAB_COMMENTS.COMMENTS || ' */' as DROP_SYNONYM_01
    , 'create synonym '
    || ALL_TAB_COMMENTS.OWNER
    || '.'
    || 'GOD_' || ALL_TAB_COMMENTS.TABLE_NAME
    || ' for '
    || ALL_TAB_COMMENTS.OWNER
    || '.'
    || ALL_TAB_COMMENTS.TABLE_NAME
    || ';'
    as CREATE_SYNONYM
    , 'create synonym or replace '
    || ALL_TAB_COMMENTS.OWNER
    || '.'
    || 'GOD_' || ALL_TAB_COMMENTS.TABLE_NAME
    || ' for '
    || ALL_TAB_COMMENTS.OWNER
    || '.'
    || ALL_TAB_COMMENTS.TABLE_NAME
    || ';'
    as CREATE_OR_REPLACE_SYNONYM
    , ALL_TAB_COMMENTS.*
from ALL_TAB_COMMENTS
where 1 = 1
    and ALL_TAB_COMMENTS.OWNER = 'TEST'
    and ALL_TAB_COMMENTS.TABLE_TYPE= 'TABLE'
order by
    ALL_TAB_COMMENTS.TABLE_NAME
;
