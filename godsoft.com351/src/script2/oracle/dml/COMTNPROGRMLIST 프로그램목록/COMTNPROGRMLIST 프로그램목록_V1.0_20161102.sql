select
    /*+ index(COMTNPROGRMLIST COMTNPROGRMLIST_PK) */
    *
from COMTNPROGRMLIST /* 프로그램목록 */
;

insert into COMTNPROGRMLIST (
    PROGRM_FILE_NM /* 프로그램목록.프로그램파일명 */
    , PROGRM_STRE_PATH /* 프로그램목록.프로그램저장경로 */
    , PROGRM_KOREAN_NM /* 프로그램목록.프로그램한글명 */
    , PROGRM_DC /* 프로그램목록.프로그램설명 */
    , URL /* 프로그램목록.URL */
) values (
    '' /* 프로그램목록.프로그램파일명 */
    , '' /* 프로그램목록.프로그램저장경로 */
    , '' /* 프로그램목록.프로그램한글명 */
    , '' /* 프로그램목록.프로그램설명 */
    , '' /* 프로그램목록.URL */
)
;
