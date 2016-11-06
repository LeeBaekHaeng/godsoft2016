/*
Object관리자(“OBJ”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_icom351obj INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dcom351obj DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351obj01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351obj02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_icom351obj DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tcom351obj TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 삭제
*/
DROP USER us_com351obj CASCADE;

/*
사용자 생성
*/
CREATE USER us_com351obj
IDENTIFIED BY us_com351obj
DEFAULT TABLESPACE ts_dcom351obj
TEMPORARY TABLESPACE ts_tcom351obj
;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_com351obj;
--REVOKE RESOURCE FROM us_com351obj;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_com351obj;
GRANT RESOURCE TO us_com351obj;
