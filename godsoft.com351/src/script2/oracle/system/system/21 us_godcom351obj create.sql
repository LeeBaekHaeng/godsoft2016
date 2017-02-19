/*
������Ʈ��: god

godcom351obj �ٲٱ�

D:\app\godsoft\oradata\orcl-god �ٲٱ�

Object������(��OBJ��)
*/

/*
���̺����̽� ����
*/
CREATE TABLESPACE ts_dgodcom351obj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_dgodcom351obj01.dbf' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_dgodcom351obj02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/
CREATE TABLESPACE ts_igodcom351obj DATAFILE 
'D:\app\godsoft\oradata\orcl-god\ts_igodcom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_igodcom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/
CREATE TEMPORARY TABLESPACE ts_tgodcom351obj TEMPFILE 
'D:\app\godsoft\oradata\orcl-god\ts_tgodcom351obj01.DBF' SIZE 1G AUTOEXTEND OFF
, 'D:\app\godsoft\oradata\orcl-god\ts_tgodcom351obj02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
����� ����
*/
CREATE USER us_godcom351obj
IDENTIFIED BY us_godcom351obj
DEFAULT TABLESPACE ts_dgodcom351obj
TEMPORARY TABLESPACE ts_tgodcom351obj
;

/*
���� �� ���� ����
*/
GRANT CONNECT TO us_godcom351obj;
GRANT RESOURCE TO us_godcom351obj;
GRANT DBA TO us_godcom351obj;
