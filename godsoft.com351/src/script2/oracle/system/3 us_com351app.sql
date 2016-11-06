/*
������(��APP��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dcom351app INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_icom351app INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tcom351app INCLUDING CONTENTS AND DATAFILES;

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dcom351app DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351app01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351app02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_icom351app DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351app01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351app02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tcom351app TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351app01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351app02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
DROP USER us_com351app CASCADE;

/*
����� ����
*/
CREATE USER us_com351app
IDENTIFIED BY us_com351app
DEFAULT TABLESPACE ts_dcom351app
TEMPORARY TABLESPACE ts_tcom351app
;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_com351app;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_com351app;
