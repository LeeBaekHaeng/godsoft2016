/*
������Ʈ��: god

godobj �ٲٱ�

D:\app\godsoft\oradata\orcl-god �ٲٱ�

Object������(��OBJ��)
*/

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dgodobj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodobj01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodobj02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_igodobj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodobj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodobj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tgodobj TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodobj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodobj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
CREATE USER us_godobj
IDENTIFIED BY us_godobj
DEFAULT TABLESPACE ts_dgodobj
TEMPORARY TABLESPACE ts_tgodobj
;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_godobj;
GRANT RESOURCE TO us_godobj;
GRANT DBA TO us_godobj;
