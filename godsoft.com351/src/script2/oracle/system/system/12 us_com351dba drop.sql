/*
DBA(“DBA”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dcom351dba INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_icom351dba INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tcom351dba INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_com351dba CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_com351dba;
--REVOKE RESOURCE FROM us_com351dba;
--REVOKE DBA FROM us_com351dba;
