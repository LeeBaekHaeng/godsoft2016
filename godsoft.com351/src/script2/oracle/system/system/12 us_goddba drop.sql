/*
������Ʈ��: god

goddba �ٲٱ�

DBA(��DBA��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dgoddba INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_igoddba INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tgoddba INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_goddba CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_goddba;
--REVOKE RESOURCE FROM us_goddba;
--REVOKE DBA FROM us_goddba;
