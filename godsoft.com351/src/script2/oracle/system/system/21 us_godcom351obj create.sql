/*
프로젝트명: god

godcom351obj 바꾸기

D:\app\godsoft\oradata\orcl-god 바꾸기

Object관리자(“OBJ”)
*/

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dgodcom351obj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodcom351obj01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodcom351obj02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_igodcom351obj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodcom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodcom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tgodcom351obj TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodcom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodcom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 생성
*/
CREATE USER us_godcom351obj
IDENTIFIED BY us_godcom351obj
DEFAULT TABLESPACE ts_dgodcom351obj
TEMPORARY TABLESPACE ts_tgodcom351obj
;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_godcom351obj;
GRANT RESOURCE TO us_godcom351obj;
GRANT DBA TO us_godcom351obj;
