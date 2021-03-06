/*
기관코드: 국토교통부
*/

select
    COMTNINSTTCODE.INSTT_CODE as CODE /* 기관코드. */
    , COMTNINSTTCODE.ALL_INSTT_NM as CODE_NM /* 기관코드. */
    , COMTNINSTTCODE.LOWEST_INSTT_NM /* 기관코드.최하위기관명 */
    , COMTNINSTTCODE.INSTT_ABRV_NM /* 기관코드. */
    , COMTNINSTTCODE.ODR /* 기관코드.차수 */
    , COMTNINSTTCODE.ORD /* 기관코드. */
    , COMTNINSTTCODE.INSTT_ODR /* 기관코드. */
    , COMTNINSTTCODE.UPPER_INSTT_CODE as CODE_DC /* 기관코드.상위기관코드 */
    , COMTNINSTTCODE.BEST_INSTT_CODE /* 기관코드. */
    , COMTNINSTTCODE.REPRSNT_INSTT_CODE /* 기관코드. */
    , COMTNINSTTCODE.INSTT_TY_LCLAS /* 기관코드. */
    , COMTNINSTTCODE.INSTT_TY_MLSFC /* 기관코드. */
    , COMTNINSTTCODE.INSTT_TY_SCLAS /* 기관코드. */
    , COMTNINSTTCODE.TELNO /* 기관코드. */
    , COMTNINSTTCODE.FXNUM /* 기관코드. */
    , COMTNINSTTCODE.CREAT_DE /* 기관코드. */
    , COMTNINSTTCODE.ABL_DE /* 기관코드. */
    , COMTNINSTTCODE.ABL_ENNC /* 기관코드. */
    , COMTNINSTTCODE.CHANGE_DE /* 기관코드. */
    , COMTNINSTTCODE.CHANGE_TIME /* 기관코드. */
    , COMTNINSTTCODE.BSIS_DE /* 기관코드. */
    , COMTNINSTTCODE.SORT_ORDR /* 기관코드. */
    , COMTNINSTTCODE.FRST_REGISTER_ID /* 기관코드. */
    , COMTNINSTTCODE.FRST_REGIST_PNTTM /* 기관코드. */
    , COMTNINSTTCODE.LAST_UPDUSR_ID /* 기관코드. */
    , COMTNINSTTCODE.LAST_UPDT_PNTTM /* 기관코드. */
from COMTNINSTTCODE /* 기관코드 */
where 1 = 1
    and COMTNINSTTCODE.ABL_ENNC = '0' /* 기관코드.폐지유무 */
    and COMTNINSTTCODE.INSTT_ODR in ('1', '2') /* 기관코드.기관차수 */
    and COMTNINSTTCODE.INSTT_TY_LCLAS = '01' /* 기관코드.기관유형대분류 */
    and COMTNINSTTCODE.INSTT_TY_MLSFC = '08' /* 기관코드.기관유형중분류 */
    and COMTNINSTTCODE.INSTT_TY_SCLAS = '01' /* 기관코드.기관유형소분류 */
start with 1 = 1
    and COMTNINSTTCODE.INSTT_CODE = '1613000' /* 기관코드.기관코드 = 국토교통부 */
connect by prior COMTNINSTTCODE.INSTT_CODE = COMTNINSTTCODE.UPPER_INSTT_CODE /* 기관코드.기관코드 = 기관코드.상위기관코드 */
order siblings by COMTNINSTTCODE.ORD /* 기관코드.서열 */
;
