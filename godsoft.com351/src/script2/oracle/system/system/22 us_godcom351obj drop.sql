/*
������Ʈ��: god

godcom351obj �ٲٱ�

Object������(��OBJ��)
*/

/*
���̺����̽� ����
*/
DROP TABLESPACE ts_dgodcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
�ε��������̽� ����
*/
DROP TABLESPACE ts_igodcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
���۷��������̽� ����
*/
DROP TABLESPACE ts_tgodcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
����� ����
*/
DROP USER us_godcom351obj CASCADE;

/*
���� �� ���� ����
*/
--REVOKE CONNECT FROM us_godcom351obj;
--REVOKE RESOURCE FROM us_godcom351obj;
--REVOKE DBA FROM us_godcom351obj;
