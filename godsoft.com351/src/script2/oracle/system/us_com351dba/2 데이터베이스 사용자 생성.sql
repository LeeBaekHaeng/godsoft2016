/*
����� ����
*/

CREATE USER us_com351dbadba
	IDENTIFIED BY us_com351dbadba
	DEFAULT TABLESPACE ts_dcom351dba01
	TEMPORARY TABLESPACE ts_tcom351dba01
;


/*
���� �� ���� ����
*/

GRANT CONNECT TO us_com351dbadba;
GRANT RESOURCE TO us_com351dbadba;
GRANT DBA TO us_com351dbadba;
