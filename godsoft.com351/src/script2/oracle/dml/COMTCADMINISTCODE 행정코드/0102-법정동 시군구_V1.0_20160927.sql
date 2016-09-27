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


�������ڵ�
�õ���
�ñ�����
���鵿��
��(��)��
������
������*
*/

select
    ', ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTCADMINISTCODE' /* ���̺�� */
order by
    all_tab_cols.COLUMN_ID
;

select
    *
from COMTCADMINISTCODE /* �����ڵ� */
where 1 = 1
;

select
    COMTCADMINISTCODE.ADMINIST_ZONE_SE /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) as CTPRVN_CODE /* �����ڵ�.���������ڵ� �õ��ڵ� */
    , (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') as CTPRVN_NM /* �����ڵ�.���������ڵ� �õ��� */ 
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 3, 3) as SIGNGU_CODE /* �����ڵ�.���������ڵ� �ñ����ڵ� */
    , (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') as SIGNGU_NM /* �����ڵ�.���������ڵ� �ñ����� */
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 6, 3) as EMD_CODE /* �����ڵ�.���������ڵ� ���鵿�ڵ� */
    , (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 8) || '00') as EMD_NM /* �����ڵ�.���������ڵ� ���鵿�� */
    , substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 9) as LI_CODE /* �����ڵ�.���������ڵ� ���ڵ� */
    , (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ' || (select replace(a.ADMINIST_ZONE_NM, (select a.ADMINIST_ZONE_NM from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 8) || '00') || ' ') from COMTCADMINISTCODE a where a.ADMINIST_ZONE_SE = COMTCADMINISTCODE.ADMINIST_ZONE_SE and a.ADMINIST_ZONE_CODE = COMTCADMINISTCODE.ADMINIST_ZONE_CODE) as LI_NM /* �����ڵ�.���������ڵ� ���� */
    , COMTCADMINISTCODE.USE_AT /* �����ڵ�.��뿩�� */
    , COMTCADMINISTCODE.ADMINIST_ZONE_NM /* �����ڵ�.���������� */
    , COMTCADMINISTCODE.UPPER_ADMINIST_ZONE_CODE /* �����ڵ�.�������������ڵ� */
    , COMTCADMINISTCODE.CREAT_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.ABL_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.FRST_REGIST_PNTTM /* �����ڵ�.���ʵ�Ͻ��� */
    , COMTCADMINISTCODE.FRST_REGISTER_ID /* �����ڵ�.���ʵ����ID */
    , COMTCADMINISTCODE.LAST_UPDT_PNTTM /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.LAST_UPDUSR_ID /* �����ڵ�.����������ID */
from COMTCADMINISTCODE /* �����ڵ� */
where 1 = 1
    and COMTCADMINISTCODE.ADMINIST_ZONE_SE = '1' /* �����ڵ�.������������ = ������ */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' /* �����ڵ�.���������ڵ� �õ� 2 */
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_____00000' /* �����ڵ�.���������ڵ� �ñ��� 3 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_______000' /* �����ڵ�.���������ڵ� ���鵿 3 */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' /* �����ڵ�.���������ڵ� �� 2 */
    and COMTCADMINISTCODE.USE_AT = 'Y' /* �����ڵ�.��뿩�� */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_NM like '%��' /* �����ڵ�.���������� */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_NM like '%�ε�%' /* �����ڵ�.���������� */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '30%' /* �����ڵ�.���������ڵ� �õ� ���� */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE != '30' || '00000000' /* �����ڵ�.���������ڵ� �õ� ���� */
--
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '43' || '%' /* �����ڵ�.���������ڵ� �õ� ��û�ϵ� */
    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE != '43' || '00000000' /* �����ڵ�.���������ڵ� �õ� ��û�ϵ� */
order by
--    COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
    COMTCADMINISTCODE.ADMINIST_ZONE_NM /* �����ڵ�.���������� */
;

select
    count(*) as cnt
from COMTCADMINISTCODE /* �����ڵ� */
;
