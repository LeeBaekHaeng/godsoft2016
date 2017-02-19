/*
프로젝트명: god

goddba 바꾸기

D:\app\godsoft\oradata\orcl-god 바꾸기

DBA(“DBA”)
*/

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dgoddba DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgoddba01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgoddba02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_igoddba DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igoddba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igoddba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tgoddba TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgoddba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgoddba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 생성
*/
CREATE USER us_goddba
IDENTIFIED BY us_goddba
DEFAULT TABLESPACE ts_dgoddba
TEMPORARY TABLESPACE ts_tgoddba
;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_goddba;
GRANT RESOURCE TO us_goddba;
GRANT DBA TO us_goddba;
