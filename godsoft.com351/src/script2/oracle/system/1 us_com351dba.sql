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
���̺����̽� ����
*/
CREATE TABLESPACE ts_dcom351dba DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351dba01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351dba02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_icom351dba DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351dba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351dba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tcom351dba TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351dba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351dba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
DROP USER us_com351dba CASCADE;

/*
����� ����
*/
CREATE USER us_com351dba
IDENTIFIED BY us_com351dba
DEFAULT TABLESPACE ts_dcom351dba
TEMPORARY TABLESPACE ts_tcom351dba
;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_com351dba;
--REVOKE RESOURCE FROM us_com351dba;
--REVOKE DBA FROM us_com351dba;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_com351dba;
GRANT RESOURCE TO us_com351dba;
GRANT DBA TO us_com351dba;
