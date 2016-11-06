/*
Object������(��OBJ��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_icom351obj INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dcom351obj DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351obj01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351obj02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_icom351obj DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tcom351obj TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
DROP USER us_com351obj CASCADE;

/*
����� ����
*/
CREATE USER us_com351obj
IDENTIFIED BY us_com351obj
DEFAULT TABLESPACE ts_dcom351obj
TEMPORARY TABLESPACE ts_tcom351obj
;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_com351obj;
--REVOKE RESOURCE FROM us_com351obj;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_com351obj;
GRANT RESOURCE TO us_com351obj;
