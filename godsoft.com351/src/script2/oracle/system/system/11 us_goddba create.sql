/*
������Ʈ��: god

goddba �ٲٱ�

D:\app\godsoft\oradata\orcl-god �ٲٱ�

DBA(��DBA��)
*/

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dgoddba DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgoddba01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgoddba02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_igoddba DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igoddba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igoddba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tgoddba TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgoddba01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgoddba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
CREATE USER us_goddba
IDENTIFIED BY us_goddba
DEFAULT TABLESPACE ts_dgoddba
TEMPORARY TABLESPACE ts_tgoddba
;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_goddba;
GRANT RESOURCE TO us_goddba;
GRANT DBA TO us_goddba;
