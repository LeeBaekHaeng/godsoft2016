/*
개발자(“APP”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dcom351app INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_icom351app INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tcom351app INCLUDING CONTENTS AND DATAFILES;

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dcom351app DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351app01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351app02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_icom351app DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351app01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351app02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tcom351app TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351app01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351app02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 삭제
*/
DROP USER us_com351app CASCADE;

/*
사용자 생성
*/
CREATE USER us_com351app
IDENTIFIED BY us_com351app
DEFAULT TABLESPACE ts_dcom351app
TEMPORARY TABLESPACE ts_tcom351app
;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_com351app;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_com351app;
