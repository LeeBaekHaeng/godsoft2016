/*
외부 인터페이스 (“IF”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dcom351if INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_icom351if INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tcom351if INCLUDING CONTENTS AND DATAFILES;

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dcom351if DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351if01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_dcom351if02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_icom351if DATAFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351if01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_icom351if02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tcom351if TEMPFILE 
'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351if01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\LeeBaekHaeng\oradata\orcl-com351\ts_tcom351if02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 삭제
*/
DROP USER us_com351if CASCADE;

/*
사용자 생성
*/
CREATE USER us_com351if
IDENTIFIED BY us_com351if
DEFAULT TABLESPACE ts_dcom351if
TEMPORARY TABLESPACE ts_tcom351if
;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_com351if;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_com351if;
