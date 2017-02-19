/*
프로젝트명: god

goddba 바꾸기

DBA(“DBA”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dgoddba INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_igoddba INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tgoddba INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_goddba CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_goddba;
--REVOKE RESOURCE FROM us_goddba;
--REVOKE DBA FROM us_goddba;
