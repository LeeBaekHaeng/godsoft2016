/*
���̺����̽� ����
*/

CREATE TABLESPACE ts_dcom351dba DATAFILE 
	'D:\app\LeeBaekHaeng\oradata\orcl2\ts_dcom351dba01.dbf' SIZE 1G AUTOEXTEND OFF
	, 'D:\app\LeeBaekHaeng\oradata\orcl2\ts_dcom351dba02.dbf' SIZE 1G AUTOEXTEND OFF
;

/*
�ε��������̽� ����
*/

CREATE TABLESPACE ts_icom351dba DATAFILE 
	'D:\app\LeeBaekHaeng\oradata\orcl2\ts_icom351dba01.DBF' SIZE 1G AUTOEXTEND OFF
	, 'D:\app\LeeBaekHaeng\oradata\orcl2\ts_icom351dba02.DBF' SIZE 1G AUTOEXTEND OFF
;

/*
���۷��������̽� ����
*/

CREATE TEMPORARY TABLESPACE ts_tcom351dba TEMPFILE 
	'D:\app\LeeBaekHaeng\oradata\orcl2\ts_tcom351dba01.DBF' SIZE 1G AUTOEXTEND OFF
	, 'D:\app\LeeBaekHaeng\oradata\orcl2\ts_tcom351dba02.DBF' SIZE 1G AUTOEXTEND OFF
;
