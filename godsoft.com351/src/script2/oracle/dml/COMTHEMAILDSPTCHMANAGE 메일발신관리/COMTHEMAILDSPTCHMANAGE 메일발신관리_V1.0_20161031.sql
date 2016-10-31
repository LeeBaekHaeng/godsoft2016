select
    ', ' || all_tab_cols.table_name || '.' || all_tab_cols.column_name || ' /* ' || all_tab_comments.comments || '.' || all_col_comments.comments || ' */'
from all_tab_cols
left outer join all_tab_comments on all_tab_comments.owner = all_tab_cols.owner and all_tab_comments.table_name = all_tab_cols.table_name
left outer join all_col_comments on all_col_comments.owner = all_tab_cols.owner and all_col_comments.table_name = all_tab_cols.table_name and all_col_comments.column_name = all_tab_cols.column_name
where 1 = 1
    and all_tab_cols.owner = 'TEST'
    and all_tab_cols.table_name = 'COMTHEMAILDSPTCHMANAGE' /* 테이블명 */
order by
    all_tab_cols.COLUMN_ID
;

select
    ROWNUM as RN
    , COMTHEMAILDSPTCHMANAGE.MSSAGE_ID /* 메일발신관리.메시지ID */
    , COMTHEMAILDSPTCHMANAGE.EMAIL_CN /* 메일발신관리.이메일내용 */
    , COMTHEMAILDSPTCHMANAGE.SNDR /* 메일발신관리.발신자 */
    , COMTHEMAILDSPTCHMANAGE.RCVER /* 메일발신관리.수신자 */
    , COMTHEMAILDSPTCHMANAGE.SJ /* 메일발신관리.제목 */
    , COMTHEMAILDSPTCHMANAGE.SNDNG_RESULT_CODE /* 메일발신관리.발송결과코드 */
    , COMTHEMAILDSPTCHMANAGE.DSPTCH_DT /* 메일발신관리.발신일시 */
    , COMTHEMAILDSPTCHMANAGE.ATCH_FILE_ID /* 메일발신관리.첨부파일ID */
--    , COMTHEMAILDSPTCHMANAGE.*
from COMTHEMAILDSPTCHMANAGE /* 메일발신관리 */
;
