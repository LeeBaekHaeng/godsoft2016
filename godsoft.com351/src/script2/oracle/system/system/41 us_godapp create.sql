/*
프로젝트명: god

godapp 바꾸기

D:\app\godsoft\oradata\orcl-god 바꾸기

개발자(“APP”)
*/

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dgodapp DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodapp01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodapp02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_igodapp DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodapp01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodapp02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tgodapp TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodapp01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodapp02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 생성
*/
CREATE USER us_godapp
IDENTIFIED BY us_godapp
DEFAULT TABLESPACE ts_dgodapp
TEMPORARY TABLESPACE ts_tgodapp
;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_godapp;
GRANT RESOURCE TO us_godapp;
GRANT DBA TO us_godapp;
