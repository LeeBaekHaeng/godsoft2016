/*
프로젝트명: god

godbak 바꾸기

백업
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dgodbak INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_igodbak INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tgodbak INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_godbak CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_godbak;
--REVOKE RESOURCE FROM us_godbak;
--REVOKE DBA FROM us_godbak;
