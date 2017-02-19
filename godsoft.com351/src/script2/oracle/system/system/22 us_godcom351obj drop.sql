/*
프로젝트명: god

godcom351obj 바꾸기

Object관리자(“OBJ”)
*/

/*
테이블스페이스 삭제
*/
DROP TABLESPACE ts_dgodcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
인덱스스페이스 삭제
*/
DROP TABLESPACE ts_igodcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
템퍼러리스페이스 삭제
*/
DROP TABLESPACE ts_tgodcom351obj INCLUDING CONTENTS AND DATAFILES;

/*
사용자 삭제
*/
DROP USER us_godcom351obj CASCADE;

/*
역할 및 권한 삭제
*/
--REVOKE CONNECT FROM us_godcom351obj;
--REVOKE RESOURCE FROM us_godcom351obj;
--REVOKE DBA FROM us_godcom351obj;
