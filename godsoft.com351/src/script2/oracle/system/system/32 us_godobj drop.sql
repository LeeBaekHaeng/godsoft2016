/*
������Ʈ��: god

godobj �ٲٱ�

Object������(��OBJ��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dgodobj INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_igodobj INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tgodobj INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_godobj CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_godobj;
--REVOKE RESOURCE FROM us_godobj;
--REVOKE DBA FROM us_godobj;
