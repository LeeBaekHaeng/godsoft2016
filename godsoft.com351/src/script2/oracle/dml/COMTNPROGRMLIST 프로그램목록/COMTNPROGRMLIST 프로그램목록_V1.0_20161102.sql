select
    /*+ index(COMTNPROGRMLIST COMTNPROGRMLIST_PK) */
    *
from COMTNPROGRMLIST /* ���α׷���� */
;

insert into COMTNPROGRMLIST (
    PROGRM_FILE_NM /* ���α׷����.���α׷����ϸ� */
    , PROGRM_STRE_PATH /* ���α׷����.���α׷������� */
    , PROGRM_KOREAN_NM /* ���α׷����.���α׷��ѱ۸� */
    , PROGRM_DC /* ���α׷����.���α׷����� */
    , URL /* ���α׷����.URL */
) values (
    '' /* ���α׷����.���α׷����ϸ� */
    , '' /* ���α׷����.���α׷������� */
    , '' /* ���α׷����.���α׷��ѱ۸� */
    , '' /* ���α׷����.���α׷����� */
    , '' /* ���α׷����.URL */
)
;
