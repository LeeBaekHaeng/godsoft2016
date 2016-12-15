select
    COMTNTMPLATINFO.* /* ���ø�.* */
from COMTNTMPLATINFO /* ���ø� */
;

select
    COMTNTMPLATINFO.TMPLAT_ID /* ���ø�ID */
    , COMTNTMPLATINFO.TMPLAT_NM /* ���ø��� */
    , COMTNTMPLATINFO.TMPLAT_COURS /* ���ø���� */
    , COMTNTMPLATINFO.USE_AT /* ��뿩�� */
    , COMTNTMPLATINFO.TMPLAT_SE_CODE /* ���ø������ڵ� */
    , (select CODE_NM from COMTCCMMNDETAILCODE where CODE_ID = 'COM005' and CODE = COMTNTMPLATINFO.TMPLAT_SE_CODE) as TMPLAT_SE_NM
    , COMTNTMPLATINFO.FRST_REGISTER_ID /* ���ʵ����ID */
    , COMTNTMPLATINFO.FRST_REGIST_PNTTM /* ���ʵ�Ͻ��� */
    , COMTNTMPLATINFO.LAST_UPDUSR_ID /* ����������ID */
    , COMTNTMPLATINFO.LAST_UPDT_PNTTM /* ������������ */
from COMTNTMPLATINFO /* ���ø� */
;

select
    sysdate
    , to_char(sysdate, 'yyyymmddhh24mi') || '01'
    , to_date(to_char(sysdate, 'yyyymmddhh24mi') || '02', 'yyyymmddhh24miss')
from dual
;
