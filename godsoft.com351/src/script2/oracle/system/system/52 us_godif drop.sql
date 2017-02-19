/*
프로젝트명: god

godif 바꾸기

외부 인터페이스 (“IF”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dgodif INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_igodif INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tgodif INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_godif CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_godif;
--REVOKE RESOURCE FROM us_godif;
--REVOKE DBA FROM us_godif;
