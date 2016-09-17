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


법정동코드
시도명
시군구명
읍면동명
리(里)명
생성일
말소일*
*/

select
    ', ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTCADMINISTCODE' /* 테이블명 */
order by
    all_tab_cols.COLUMN_ID
;

select
    *
from COMTCADMINISTCODE /* 행정코드 */
where 1 = 1
;

select
    COMTCADMINISTCODE.ADMINIST_ZONE_SE /* 행정코드.행정구역구분 */
    , COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* 행정코드.행정구역코드 */
    , COMTCADMINISTCODE.USE_AT /* 행정코드.사용여부 */
    , COMTCADMINISTCODE.ADMINIST_ZONE_NM /* 행정코드.행정구역명 */
    , COMTCADMINISTCODE.UPPER_ADMINIST_ZONE_CODE /* 행정코드.상위행정구역코드 */
    , COMTCADMINISTCODE.CREAT_DE /* 행정코드.생성일 */
    , COMTCADMINISTCODE.ABL_DE /* 행정코드.폐지일 */
    , COMTCADMINISTCODE.FRST_REGIST_PNTTM /* 행정코드.최초등록시점 */
    , COMTCADMINISTCODE.FRST_REGISTER_ID /* 행정코드.최초등록자ID */
    , COMTCADMINISTCODE.LAST_UPDT_PNTTM /* 행정코드.최종수정시점 */
    , COMTCADMINISTCODE.LAST_UPDUSR_ID /* 행정코드.최종수정자ID */
from COMTCADMINISTCODE /* 행정코드 */
where 1 = 1
    and COMTCADMINISTCODE.ADMINIST_ZONE_SE = '1' /* 행정코드.행정구역구분 = 법정동 */
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' /* 행정코드.행정구역코드 시도 2 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '____000000' /* 행정코드.행정구역코드 시군구 3 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_______000' /* 행정코드.행정구역코드 읍면동 3 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' /* 행정코드.행정구역코드 리 2*/
    and COMTCADMINISTCODE.USE_AT = 'Y' /* 행정코드.사용여부 */
order by
    COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* 행정코드.행정구역코드 */
;

select
    count(*) as cnt
from COMTCADMINISTCODE /* 행정코드 */
;
