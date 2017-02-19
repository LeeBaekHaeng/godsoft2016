/*
������Ʈ��: god

godif �ٲٱ�

D:\app\godsoft\oradata\orcl-god �ٲٱ�

�ܺ� �������̽� (��IF��)
*/

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dgodif DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodif01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodif02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_igodif DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodif01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodif02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tgodif TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodif01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodif02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
CREATE USER us_godif
IDENTIFIED BY us_godif
DEFAULT TABLESPACE ts_dgodif
TEMPORARY TABLESPACE ts_tgodif
;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_godif;
GRANT RESOURCE TO us_godif;
GRANT DBA TO us_godif;
