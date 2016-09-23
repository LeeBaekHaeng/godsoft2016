select
    '    , ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTNINSTTCODE' /* ���̺�� */
order by
    all_tab_cols.COLUMN_ID
;

select
    COMTNINSTTCODE.*
from COMTNINSTTCODE /* ����ڵ� */
;

select
    COMTNINSTTCODE.INSTT_CODE /* ����ڵ�.����ڵ� */
    , COMTNINSTTCODE.ALL_INSTT_NM /* ����ڵ�.��ü����� */
    , COMTNINSTTCODE.LOWEST_INSTT_NM /* ����ڵ�.����������� */
    , COMTNINSTTCODE.INSTT_ABRV_NM /* ����ڵ�.������� */
    , COMTNINSTTCODE.ODR /* ����ڵ�.���� */
    , COMTNINSTTCODE.ORD /* ����ڵ�.���� */
    , COMTNINSTTCODE.INSTT_ODR /* ����ڵ�.������� */
    , COMTNINSTTCODE.UPPER_INSTT_CODE /* ����ڵ�.��������ڵ� */
    , COMTNINSTTCODE.BEST_INSTT_CODE /* ����ڵ�.�ֻ�������ڵ� */
    , COMTNINSTTCODE.REPRSNT_INSTT_CODE /* ����ڵ�.��ǥ����ڵ� */
    , COMTNINSTTCODE.INSTT_TY_LCLAS /* ����ڵ�.���������з� */
    , COMTNINSTTCODE.INSTT_TY_MLSFC /* ����ڵ�.��������ߺз� */
    , COMTNINSTTCODE.INSTT_TY_SCLAS /* ����ڵ�.��������Һз� */
    , COMTNINSTTCODE.TELNO /* ����ڵ�.��ȭ��ȣ */
    , COMTNINSTTCODE.FXNUM /* ����ڵ�.�ѽ���ȣ */
    , COMTNINSTTCODE.CREAT_DE /* ����ڵ�.������ */
    , COMTNINSTTCODE.ABL_DE /* ����ڵ�.������ */
    , COMTNINSTTCODE.ABL_ENNC /* ����ڵ�.�������� */
    , COMTNINSTTCODE.CHANGE_DE /* ����ڵ�.������ */
    , COMTNINSTTCODE.CHANGE_TIME /* ����ڵ�.����ð� */
    , COMTNINSTTCODE.BSIS_DE /* ����ڵ�.������ */
    , COMTNINSTTCODE.SORT_ORDR /* ����ڵ�.���ļ��� */
    , COMTNINSTTCODE.FRST_REGISTER_ID /* ����ڵ�.���ʵ����ID */
    , COMTNINSTTCODE.FRST_REGIST_PNTTM /* ����ڵ�.���ʵ�Ͻ��� */
    , COMTNINSTTCODE.LAST_UPDUSR_ID /* ����ڵ�.����������ID */
    , COMTNINSTTCODE.LAST_UPDT_PNTTM /* ����ڵ�.������������ */
from COMTNINSTTCODE /* ����ڵ� */
;
