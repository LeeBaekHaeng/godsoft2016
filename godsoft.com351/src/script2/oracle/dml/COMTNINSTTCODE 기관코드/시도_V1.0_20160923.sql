/*
����ڵ�: �õ�
*/

select
    COMTNINSTTCODE.INSTT_CODE as CODE /* ����ڵ�. */
    , COMTNINSTTCODE.ALL_INSTT_NM as CODE_NM /* ����ڵ�. */
    , COMTNINSTTCODE.LOWEST_INSTT_NM /* ����ڵ�.����������� */
    , COMTNINSTTCODE.INSTT_ABRV_NM /* ����ڵ�. */
    , COMTNINSTTCODE.ODR /* ����ڵ�. */
    , COMTNINSTTCODE.ORD /* ����ڵ�. */
    , COMTNINSTTCODE.INSTT_ODR /* ����ڵ�. */
    , COMTNINSTTCODE.UPPER_INSTT_CODE as CODE_DC /* ����ڵ�.��������ڵ� */
    , COMTNINSTTCODE.BEST_INSTT_CODE /* ����ڵ�. */
    , COMTNINSTTCODE.REPRSNT_INSTT_CODE /* ����ڵ�. */
    , COMTNINSTTCODE.INSTT_TY_LCLAS /* ����ڵ�. */
    , COMTNINSTTCODE.INSTT_TY_MLSFC /* ����ڵ�. */
    , COMTNINSTTCODE.INSTT_TY_SCLAS /* ����ڵ�. */
    , COMTNINSTTCODE.TELNO /* ����ڵ�. */
    , COMTNINSTTCODE.FXNUM /* ����ڵ�. */
    , COMTNINSTTCODE.CREAT_DE /* ����ڵ�. */
    , COMTNINSTTCODE.ABL_DE /* ����ڵ�. */
    , COMTNINSTTCODE.ABL_ENNC /* ����ڵ�. */
    , COMTNINSTTCODE.CHANGE_DE /* ����ڵ�. */
    , COMTNINSTTCODE.CHANGE_TIME /* ����ڵ�. */
    , COMTNINSTTCODE.BSIS_DE /* ����ڵ�. */
    , COMTNINSTTCODE.SORT_ORDR /* ����ڵ�. */
    , COMTNINSTTCODE.FRST_REGISTER_ID /* ����ڵ�. */
    , COMTNINSTTCODE.FRST_REGIST_PNTTM /* ����ڵ�. */
    , COMTNINSTTCODE.LAST_UPDUSR_ID /* ����ڵ�. */
    , COMTNINSTTCODE.LAST_UPDT_PNTTM /* ����ڵ�. */
from COMTNINSTTCODE /* ����ڵ� */
where 1 = 1
    and COMTNINSTTCODE.ABL_ENNC = '0' /* ����ڵ�.�������� */
    and COMTNINSTTCODE.ODR = '1' /* ����ڵ�.���� */
    and COMTNINSTTCODE.INSTT_TY_LCLAS = '02' /* ����ڵ�.���������з� = ��ġ�������� */
order by COMTNINSTTCODE.ORD /* ����ڵ�.���� */
;
