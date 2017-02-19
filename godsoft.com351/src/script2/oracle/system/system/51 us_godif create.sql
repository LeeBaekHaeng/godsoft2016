/*
프로젝트명: god

godif 바꾸기

D:\app\godsoft\oradata\orcl-god 바꾸기

외부 인터페이스 (“IF”)
*/

/*
테이블스페이스 생성
*/
CREATE TABLESPACE ts_dgodif DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodif01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodif02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
인덱스스페이스 생성
*/
CREATE TABLESPACE ts_igodif DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodif01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodif02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
템퍼러리스페이스 생성
*/
CREATE TEMPORARY TABLESPACE ts_tgodif TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodif01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodif02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
사용자 생성
*/
CREATE USER us_godif
IDENTIFIED BY us_godif
DEFAULT TABLESPACE ts_dgodif
TEMPORARY TABLESPACE ts_tgodif
;

/*
역할 및 권한 생성
*/
GRANT CONNECT TO us_godif;
GRANT RESOURCE TO us_godif;
GRANT DBA TO us_godif;
