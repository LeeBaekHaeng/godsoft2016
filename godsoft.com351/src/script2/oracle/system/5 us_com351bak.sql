/*
Object������ ���(��OBJ_BAK��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dcom351bak INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_icom351bak INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tcom351bak INCLUDING CONTENTS AND DATAFILES;

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dcom351bak DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351bak01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351bak02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_icom351bak DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351bak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351bak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tcom351bak TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351bak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351bak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
DROP USER us_com351bak CASCADE;

/*
����� ����
*/
CREATE USER us_com351bak
IDENTIFIED BY us_com351bak
DEFAULT TABLESPACE ts_dcom351bak
TEMPORARY TABLESPACE ts_tcom351bak
;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_com351bak;
--REVOKE RESOURCE FROM us_com351bak;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_com351bak;
GRANT RESOURCE TO us_com351bak;
