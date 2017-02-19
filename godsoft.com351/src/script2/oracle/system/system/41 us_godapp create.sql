/*
������Ʈ��: god

godapp �ٲٱ�

D:\app\godsoft\oradata\orcl-god �ٲٱ�

������(��APP��)
*/

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dgodapp DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodapp01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodapp02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_igodapp DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodapp01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodapp02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tgodapp TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodapp01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodapp02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
CREATE USER us_godapp
IDENTIFIED BY us_godapp
DEFAULT TABLESPACE ts_dgodapp
TEMPORARY TABLESPACE ts_tgodapp
;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_godapp;
GRANT RESOURCE TO us_godapp;
GRANT DBA TO us_godapp;
