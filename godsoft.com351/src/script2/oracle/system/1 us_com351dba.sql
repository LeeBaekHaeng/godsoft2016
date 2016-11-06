/*
DBA(“DBA”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dcom351dba INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_icom351dba INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tcom351dba INCLUDING CONTENTS AND DATAFILES;

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dcom351dba DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351dba01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351dba02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_icom351dba DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351dba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351dba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tcom351dba TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351dba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351dba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 삭제
*/
DROP USER us_com351dba CASCADE;

/*
사용자 생성
*/
CREATE USER us_com351dba
IDENTIFIED BY us_com351dba
DEFAULT TABLESPACE ts_dcom351dba
TEMPORARY TABLESPACE ts_tcom351dba
;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_com351dba;
--REVOKE RESOURCE FROM us_com351dba;
--REVOKE DBA FROM us_com351dba;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_com351dba;
GRANT RESOURCE TO us_com351dba;
GRANT DBA TO us_com351dba;
