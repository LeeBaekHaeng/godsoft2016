/*
프로젝트명: god

godbak 바꾸기

D:\app\godsoft\oradata\orcl-god 바꾸기

백업
*/

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dgodbak DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodbak01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodbak02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_igodbak DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodbak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodbak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tgodbak TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodbak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodbak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 생성
*/
CREATE USER us_godbak
IDENTIFIED BY us_godbak
DEFAULT TABLESPACE ts_dgodbak
TEMPORARY TABLESPACE ts_tgodbak
;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_godbak;
GRANT RESOURCE TO us_godbak;
GRANT DBA TO us_godbak;
