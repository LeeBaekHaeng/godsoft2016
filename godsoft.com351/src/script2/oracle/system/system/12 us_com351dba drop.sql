/*
DBA(��DBA��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dcom351dba INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_icom351dba INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tcom351dba INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_com351dba CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_com351dba;
--REVOKE RESOURCE FROM us_com351dba;
--REVOKE DBA FROM us_com351dba;
