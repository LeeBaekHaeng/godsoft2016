select
    COMTNTMPLATINFO.* /* 템플릿.* */
from COMTNTMPLATINFO /* 템플릿 */
;

select
    COMTNTMPLATINFO.TMPLAT_ID /* 템플릿ID */
    , COMTNTMPLATINFO.TMPLAT_NM /* 템플릿명 */
    , COMTNTMPLATINFO.TMPLAT_COURS /* 템플릿경로 */
    , COMTNTMPLATINFO.USE_AT /* 사용여부 */
    , COMTNTMPLATINFO.TMPLAT_SE_CODE /* 템플릿구분코드 */
    , (select CODE_NM from COMTCCMMNDETAILCODE where CODE_ID = 'COM005' and CODE = COMTNTMPLATINFO.TMPLAT_SE_CODE) as TMPLAT_SE_NM
    , COMTNTMPLATINFO.FRST_REGISTER_ID /* 최초등록자ID */
    , COMTNTMPLATINFO.FRST_REGIST_PNTTM /* 최초등록시점 */
    , COMTNTMPLATINFO.LAST_UPDUSR_ID /* 최종수정자ID */
    , COMTNTMPLATINFO.LAST_UPDT_PNTTM /* 최종수정시점 */
from COMTNTMPLATINFO /* 템플릿 */
;

select
    sysdate
    , to_char(sysdate, 'yyyymmddhh24mi') || '01'
    , to_date(to_char(sysdate, 'yyyymmddhh24mi') || '02', 'yyyymmddhh24miss')
from dual
;
