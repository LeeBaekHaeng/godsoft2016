/*
������Ʈ��: god

godapp �ٲٱ�

������(��APP��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dgodapp INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_igodapp INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tgodapp INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_godapp CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_godapp;
--REVOKE RESOURCE FROM us_godapp;
--REVOKE DBA FROM us_godapp;
