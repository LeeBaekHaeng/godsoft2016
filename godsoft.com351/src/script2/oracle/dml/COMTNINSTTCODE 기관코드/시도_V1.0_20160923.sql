/*
기관코드: 시도
*/

select
    COMTNINSTTCODE.INSTT_CODE as CODE /* 기관코드. */
    , COMTNINSTTCODE.ALL_INSTT_NM as CODE_NM /* 기관코드. */
    , COMTNINSTTCODE.LOWEST_INSTT_NM /* 기관코드.최하위기관명 */
    , COMTNINSTTCODE.INSTT_ABRV_NM /* 기관코드. */
    , COMTNINSTTCODE.ODR /* 기관코드. */
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
    , 'update COMTNINSTTCODE set INSTT_ABRV_NM = ''' || LOWEST_INSTT_NM || ''' where INSTT_CODE = ''' || INSTT_CODE || ''';' as UPDATE_01
from COMTNINSTTCODE /* 기관코드 */
where 1 = 1
    and COMTNINSTTCODE.ABL_ENNC = '0' /* 기관코드.폐지유무 */
    and COMTNINSTTCODE.ODR = '1' /* 기관코드.차수 */
    and COMTNINSTTCODE.INSTT_TY_LCLAS = '02' /* 기관코드.기관유형대분류 = 자치행정조직 */
--order by COMTNINSTTCODE.ORD /* 기관코드.서열 */
order by decode(COMTNINSTTCODE.INSTT_CODE, '5690000', '077', COMTNINSTTCODE.ORD) /* 기관코드.서열 */
;

update COMTNINSTTCODE set INSTT_ABRV_NM = '서울' where INSTT_CODE = '6110000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '부산' where INSTT_CODE = '6260000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '대구' where INSTT_CODE = '6270000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '인천' where INSTT_CODE = '6280000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '광주' where INSTT_CODE = '6290000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '대전' where INSTT_CODE = '6300000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '울산' where INSTT_CODE = '6310000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '경기' where INSTT_CODE = '6410000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '강원' where INSTT_CODE = '6420000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '충북' where INSTT_CODE = '6430000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '충남' where INSTT_CODE = '6440000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '전북' where INSTT_CODE = '6450000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '전남' where INSTT_CODE = '6460000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '경북' where INSTT_CODE = '6470000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '경남' where INSTT_CODE = '6480000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '제주' where INSTT_CODE = '6500000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '세종' where INSTT_CODE = '5690000';
