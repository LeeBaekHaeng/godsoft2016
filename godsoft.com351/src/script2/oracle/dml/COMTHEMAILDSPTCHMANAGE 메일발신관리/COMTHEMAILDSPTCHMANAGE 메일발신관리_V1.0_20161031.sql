select
    ', ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTHEMAILDSPTCHMANAGE' /* ���̺�� */
order by
    all_tab_cols.COLUMN_ID
;

select
    ROWNUM as RN
    , COMTHEMAILDSPTCHMANAGE.MSSAGE_ID /* ���Ϲ߽Ű���.�޽���ID */
    , COMTHEMAILDSPTCHMANAGE.EMAIL_CN /* ���Ϲ߽Ű���.�̸��ϳ��� */
    , COMTHEMAILDSPTCHMANAGE.SNDR /* ���Ϲ߽Ű���.�߽��� */
    , COMTHEMAILDSPTCHMANAGE.RCVER /* ���Ϲ߽Ű���.������ */
    , COMTHEMAILDSPTCHMANAGE.SJ /* ���Ϲ߽Ű���.���� */
    , COMTHEMAILDSPTCHMANAGE.SNDNG_RESULT_CODE /* ���Ϲ߽Ű���.�߼۰���ڵ� */
    , COMTHEMAILDSPTCHMANAGE.DSPTCH_DT /* ���Ϲ߽Ű���.�߽��Ͻ� */
    , COMTHEMAILDSPTCHMANAGE.ATCH_FILE_ID /* ���Ϲ߽Ű���.÷������ID */
--    , COMTHEMAILDSPTCHMANAGE.*
from COMTHEMAILDSPTCHMANAGE /* ���Ϲ߽Ű��� */
;
