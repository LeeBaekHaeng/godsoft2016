select
    '    , ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTNINSTTCODE' /* 테이블명 */
order by
    all_tab_cols.COLUMN_ID
;

select
    COMTNINSTTCODE.*
from COMTNINSTTCODE /* 기관코드 */
;

select
    COMTNINSTTCODE.INSTT_CODE /* 기관코드.기관코드 */
    , COMTNINSTTCODE.ALL_INSTT_NM /* 기관코드.전체기관명 */
    , COMTNINSTTCODE.LOWEST_INSTT_NM /* 기관코드.최하위기관명 */
    , COMTNINSTTCODE.INSTT_ABRV_NM /* 기관코드.기관약어명 */
    , COMTNINSTTCODE.ODR /* 기관코드.차수 */
    , COMTNINSTTCODE.ORD /* 기관코드.서열 */
    , COMTNINSTTCODE.INSTT_ODR /* 기관코드.기관차수 */
    , COMTNINSTTCODE.UPPER_INSTT_CODE /* 기관코드.상위기관코드 */
    , COMTNINSTTCODE.BEST_INSTT_CODE /* 기관코드.최상위기관코드 */
    , COMTNINSTTCODE.REPRSNT_INSTT_CODE /* 기관코드.대표기관코드 */
    , COMTNINSTTCODE.INSTT_TY_LCLAS /* 기관코드.기관유형대분류 */
    , COMTNINSTTCODE.INSTT_TY_MLSFC /* 기관코드.기관유형중분류 */
    , COMTNINSTTCODE.INSTT_TY_SCLAS /* 기관코드.기관유형소분류 */
    , COMTNINSTTCODE.TELNO /* 기관코드.전화번호 */
    , COMTNINSTTCODE.FXNUM /* 기관코드.팩스번호 */
    , COMTNINSTTCODE.CREAT_DE /* 기관코드.생성일 */
    , COMTNINSTTCODE.ABL_DE /* 기관코드.폐지일 */
    , COMTNINSTTCODE.ABL_ENNC /* 기관코드.폐지유무 */
    , COMTNINSTTCODE.CHANGE_DE /* 기관코드.변경일 */
    , COMTNINSTTCODE.CHANGE_TIME /* 기관코드.변경시간 */
    , COMTNINSTTCODE.BSIS_DE /* 기관코드.기초일 */
    , COMTNINSTTCODE.SORT_ORDR /* 기관코드.정렬순서 */
    , COMTNINSTTCODE.FRST_REGISTER_ID /* 기관코드.최초등록자ID */
    , COMTNINSTTCODE.FRST_REGIST_PNTTM /* 기관코드.최초등록시점 */
    , COMTNINSTTCODE.LAST_UPDUSR_ID /* 기관코드.최종수정자ID */
    , COMTNINSTTCODE.LAST_UPDT_PNTTM /* 기관코드.최종수정시점 */
from COMTNINSTTCODE /* 기관코드 */
;
