/*
������Ʈ��: god

godbak �ٲٱ�

���
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dgodbak INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_igodbak INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tgodbak INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_godbak CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_godbak;
--REVOKE RESOURCE FROM us_godbak;
--REVOKE DBA FROM us_godbak;
