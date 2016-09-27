/*
COM_TC_ADMINIST_CODE
com_tc_administ_code
ComTcAdministCode
comTcAdministCode

sidoCd
func_sgg();

sggCd
func_umd();

umdCd
func_ri();

riCd


过沥悼内靛
矫档疙
矫焙备疙
谰搁悼疙
府(嘴)疙
积己老
富家老*
*/

select
    ', ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTCADMINISTCODE' /* 抛捞喉疙 */
order by
    all_tab_cols.COLUMN_ID
;

select
    *
from COMTCADMINISTCODE /* 青沥内靛 */
where 1 = 1
;

select
    COMTCADMINISTCODE.ADMINIST_ZONE_SE /* 青沥内靛.青沥备开备盒 */
    , COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* 青沥内靛.青沥备开内靛 */
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) as CTPRVN_CODE /* 青沥内靛.青沥备开内靛 矫档内靛 */
    , (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') as CTPRVN_NM /* 青沥内靛.青沥备开内靛 矫档疙 */ 
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 3, 3) as SIGNGU_CODE /* 青沥内靛.青沥备开内靛 矫焙备内靛 */
    , (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') as SIGNGU_NM /* 青沥内靛.青沥备开内靛 矫焙备疙 */
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 6, 3) as EMD_CODE /* 青沥内靛.青沥备开内靛 谰搁悼内靛 */
    , (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 8) || '00') as EMD_NM /* 青沥内靛.青沥备开内靛 谰搁悼疙 */
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 9) as LI_CODE /* 青沥内靛.青沥备开内靛 府内靛 */
    , (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 8) || '00') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = COMTCADMINISTCODE.ADMINIST_ZONE_CODE) as LI_NM /* 青沥内靛.青沥备开内靛 府疙 */
    , COMTCADMINISTCODE.USE_AT /* 青沥内靛.荤侩咯何 */
    , COMTCADMINISTCODE.ADMINIST_ZONE_NM /* 青沥内靛.青沥备开疙 */
    , COMTCADMINISTCODE.UPPER_ADMINIST_ZONE_CODE /* 青沥内靛.惑困青沥备开内靛 */
    , COMTCADMINISTCODE.CREAT_DE /* 青沥内靛.积己老 */
    , COMTCADMINISTCODE.ABL_DE /* 青沥内靛.企瘤老 */
    , COMTCADMINISTCODE.FRST_REGIST_PNTTM /* 青沥内靛.弥檬殿废矫痢 */
    , COMTCADMINISTCODE.FRST_REGISTER_ID /* 青沥内靛.弥檬殿废磊ID */
    , COMTCADMINISTCODE.LAST_UPDT_PNTTM /* 青沥内靛.弥辆荐沥矫痢 */
    , COMTCADMINISTCODE.LAST_UPDUSR_ID /* 青沥内靛.弥辆荐沥磊ID */
from COMTCADMINISTCODE /* 青沥内靛 */
where 1 = 1
    and COMTCADMINISTCODE.ADMINIST_ZONE_SE = '1' /* 青沥内靛.青沥备开备盒 = 过沥悼 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' /* 青沥内靛.青沥备开内靛 矫档 2 */
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_____00000' /* 青沥内靛.青沥备开内靛 矫焙备 3 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_______000' /* 青沥内靛.青沥备开内靛 谰搁悼 3 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' /* 青沥内靛.青沥备开内靛 府 2 */
    and COMTCADMINISTCODE.USE_AT = 'Y' /* 青沥内靛.荤侩咯何 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_NM like '%府' /* 青沥内靛.青沥备开疙 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_NM like '%牢悼%' /* 青沥内靛.青沥备开疙 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '30%' /* 青沥内靛.青沥备开内靛 矫档 措傈 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE != '30' || '00000000' /* 青沥内靛.青沥备开内靛 矫档 措傈 */
--
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '43' || '%' /* 青沥内靛.青沥备开内靛 矫档 面没合档 */
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE != '43' || '00000000' /* 青沥内靛.青沥备开内靛 矫档 面没合档 */
order by
--    COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* 青沥内靛.青沥备开内靛 */
    COMTCADMINISTCODE.ADMINIST_ZONE_NM /* 青沥内靛.青沥备开疙 */
;

select
    count(*) as cnt
from COMTCADMINISTCODE /* 青沥内靛 */
;
