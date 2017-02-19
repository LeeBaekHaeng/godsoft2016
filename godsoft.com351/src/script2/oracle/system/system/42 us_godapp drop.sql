/*
프로젝트명: god

godapp 바꾸기

개발자(“APP”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dgodapp INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_igodapp INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tgodapp INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_godapp CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_godapp;
--REVOKE RESOURCE FROM us_godapp;
--REVOKE DBA FROM us_godapp;
