/*
������Ʈ��: god

godif �ٲٱ�

�ܺ� �������̽� (��IF��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dgodif INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_igodif INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tgodif INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_godif CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_godif;
--REVOKE RESOURCE FROM us_godif;
--REVOKE DBA FROM us_godif;
