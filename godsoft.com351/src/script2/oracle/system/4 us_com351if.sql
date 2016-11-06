/*
�ܺ� �������̽� (��IF��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dcom351if INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_icom351if INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tcom351if INCLUDING CONTENTS AND DATAFILES;

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dcom351if DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351if01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351if02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_icom351if DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351if01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351if02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tcom351if TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351if01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351if02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
DROP USER us_com351if CASCADE;

/*
����� ����
*/
CREATE USER us_com351if
IDENTIFIED BY us_com351if
DEFAULT TABLESPACE ts_dcom351if
TEMPORARY TABLESPACE ts_tcom351if
;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_com351if;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_com351if;
