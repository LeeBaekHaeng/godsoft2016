/*
������Ʈ��: god

godbak �ٲٱ�

D:\app\godsoft\oradata\orcl-god �ٲٱ�

���
*/

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dgodbak DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodbak01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodbak02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_igodbak DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodbak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodbak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tgodbak TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodbak01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodbak02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
CREATE USER us_godbak
IDENTIFIED BY us_godbak
DEFAULT TABLESPACE ts_dgodbak
TEMPORARY TABLESPACE ts_tgodbak
;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_godbak;
GRANT RESOURCE TO us_godbak;
GRANT DBA TO us_godbak;
