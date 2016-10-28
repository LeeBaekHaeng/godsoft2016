select
    ', ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTNAUTHORROLERELATE' /* 테이블명 */
order by
    all_tab_cols.COLUMN_ID
;

select
    COMTNAUTHORROLERELATE.*
from COMTNAUTHORROLERELATE /* 권한롤관계 */
;

select
    rownum as rn
/* 권한롤관계 */
    , COMTNAUTHORROLERELATE.*
/* 권한정보 */
    , COMTNAUTHORINFO.*
/* 롤정보 */
    , COMTNROLEINFO.*
from COMTNAUTHORROLERELATE /* 권한롤관계 */
left outer join COMTNAUTHORINFO /* 권한정보 */ on COMTNAUTHORINFO.AUTHOR_CODE = COMTNAUTHORROLERELATE.AUTHOR_CODE
left outer join COMTNROLEINFO /* 롤정보 */ on COMTNROLEINFO.ROLE_CODE = COMTNAUTHORROLERELATE.ROLE_CODE
where 1 = 1
--    and COMTNAUTHORROLERELATE.AUTHOR_CODE = 'ROLE_USER'
    and COMTNAUTHORROLERELATE.AUTHOR_CODE = 'ROLE_USER_GROUP_0007' /* 원목생산업자 */
;
