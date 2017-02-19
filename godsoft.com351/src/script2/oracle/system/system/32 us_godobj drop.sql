/*
프로젝트명: god

godobj 바꾸기

Object관리자(“OBJ”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dgodobj INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_igodobj INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tgodobj INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_godobj CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_godobj;
--REVOKE RESOURCE FROM us_godobj;
--REVOKE DBA FROM us_godobj;
