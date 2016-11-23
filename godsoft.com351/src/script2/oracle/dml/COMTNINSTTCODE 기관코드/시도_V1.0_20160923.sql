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
    , 'update COMTNINSTTCODE set INSTT_ABRV_NM = ''' || LOWEST_INSTT_NM || ''' where INSTT_CODE = ''' || INSTT_CODE || ''';' as UPDATE_01
from COMTNINSTTCODE /* ����ڵ� */
where 1 = 1
    and COMTNINSTTCODE.ABL_ENNC = '0' /* ����ڵ�.�������� */
    and COMTNINSTTCODE.ODR = '1' /* ����ڵ�.���� */
    and COMTNINSTTCODE.INSTT_TY_LCLAS = '02' /* ����ڵ�.���������з� = ��ġ�������� */
--order by COMTNINSTTCODE.ORD /* ����ڵ�.���� */
order by decode(COMTNINSTTCODE.INSTT_CODE, '5690000', '077', COMTNINSTTCODE.ORD) /* ����ڵ�.���� */
;

update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6110000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '�λ�' where INSTT_CODE = '6260000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '�뱸' where INSTT_CODE = '6270000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '��õ' where INSTT_CODE = '6280000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6290000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6300000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '���' where INSTT_CODE = '6310000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '���' where INSTT_CODE = '6410000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6420000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '���' where INSTT_CODE = '6430000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '�泲' where INSTT_CODE = '6440000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6450000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6460000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '���' where INSTT_CODE = '6470000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '�泲' where INSTT_CODE = '6480000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '6500000';
update COMTNINSTTCODE set INSTT_ABRV_NM = '����' where INSTT_CODE = '5690000';
