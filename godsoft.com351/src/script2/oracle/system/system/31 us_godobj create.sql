/*
프로젝트명: god

godobj 바꾸기

D:\app\godsoft\oradata\orcl-god 바꾸기

Object관리자(“OBJ”)
*/

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dgodobj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodobj01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodobj02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_igodobj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodobj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodobj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tgodobj TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodobj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodobj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 생성
*/
CREATE USER us_godobj
IDENTIFIED BY us_godobj
DEFAULT TABLESPACE ts_dgodobj
TEMPORARY TABLESPACE ts_tgodobj
;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_godobj;
GRANT RESOURCE TO us_godobj;
GRANT DBA TO us_godobj;
