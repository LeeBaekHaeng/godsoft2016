/*
Object관리자 백업(“OBJ_BAK”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dcom351bak INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_icom351bak INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tcom351bak INCLUDING CONTENTS AND DATAFILES;

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dcom351bak DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351bak01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351bak02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_icom351bak DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351bak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351bak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tcom351bak TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351bak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351bak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 삭제
*/
DROP USER us_com351bak CASCADE;

/*
사용자 생성
*/
CREATE USER us_com351bak
IDENTIFIED BY us_com351bak
DEFAULT TABLESPACE ts_dcom351bak
TEMPORARY TABLESPACE ts_tcom351bak
;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_com351bak;
--REVOKE RESOURCE FROM us_com351bak;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_com351bak;
GRANT RESOURCE TO us_com351bak;
