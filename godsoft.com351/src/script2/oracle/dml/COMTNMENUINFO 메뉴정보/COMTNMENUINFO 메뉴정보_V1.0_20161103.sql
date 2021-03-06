/*
메뉴관리
http://www.egovframe.go.kr/wiki/doku.php?id=egovframework:com:v2:sym:%EB%A9%94%EB%89%B4%EA%B4%80%EB%A6%AC

메뉴일괄 엑셀양식
batchmenubind_메뉴샘플.xls
http://www.egovframe.go.kr/wiki/lib/exe/fetch.php?media=egovframework:com:v2:sym:batchmenubind_%EB%A9%94%EB%89%B4%EC%83%98%ED%94%8C.xls

1091. 메뉴관리리스트

https://docs.oracle.com/cd/B19306_01/server.102/b14200/queries003.htm

Hierarchical Queries

계층 쿼리
*/

select
    ROWNUM as ROWNUM_01
    , (
        select count(*)
        from COMTNMENUINFO Z1 /* 메뉴정보 */
        where Z1.UPPER_MENU_NO = COMTNMENUINFO.UPPER_MENU_NO
    ) as CHILD_CNT
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , PRIOR COMTNMENUINFO.MENU_NO as PRIOR_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , CONNECT_BY_ISLEAF as ISLEAF
    , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > 시스템', '홈') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.PROGRM_FILE_NM, ' > ') as PATH_PROGRM_FILE_NM
    , substr(COMTNMENUINFO.MENU_NO, 0, 1) as MENU_NO_01
    , substr(COMTNMENUINFO.MENU_NO, 0, 3) as MENU_NO_02
    , substr(COMTNMENUINFO.MENU_NO, 0, 5) as MENU_NO_03
    , COMTNMENUINFO.*
from COMTNMENUINFO /* 메뉴정보 */
start with 1 = 1
--    and COMTNMENUINFO.MENU_NO = 0 /* 메뉴정보.메뉴번호 */
    and COMTNMENUINFO.MENU_NO = 1 /* 메뉴정보.메뉴번호 */
connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* 메뉴정보.메뉴번호 = 메뉴정보.상위메뉴번호 */
order siblings by
    COMTNMENUINFO.MENU_ORDR /* 메뉴정보.메뉴순서 */
;

select
    ROWNUM as ROWNUM_01
    , LEVEL_01
    , PRIOR_MENU_NO
    , MENU_NM_01
    , PRIOR_MENU_NM
    , ROOT_MENU_NO
    , ROOT_MENU_NM
    , ISLEAF
    , PATH_MENU_NM
    , PATH_PROGRM_FILE_NM
/* 메뉴정보 */
    , COMTNMENUINFO.MENU_NM
    , COMTNMENUINFO.PROGRM_FILE_NM
    , COMTNMENUINFO.MENU_NO
    , COMTNMENUINFO.UPPER_MENU_NO
    , COMTNMENUINFO.MENU_ORDR
    , COMTNMENUINFO.MENU_DC
    , COMTNMENUINFO.RELATE_IMAGE_PATH
    , COMTNMENUINFO.RELATE_IMAGE_NM
/* 프로그램목록 */
    , COMTNPROGRMLIST.PROGRM_STRE_PATH
    , COMTNPROGRMLIST.PROGRM_KOREAN_NM
    , COMTNPROGRMLIST.PROGRM_DC
    , COMTNPROGRMLIST.URL
from (
    select
        ROWNUM as ROWNUM_01
        , LEVEL as LEVEL_01
        , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
        , PRIOR COMTNMENUINFO.MENU_NO as PRIOR_MENU_NO
        , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
        , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
        , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
        , CONNECT_BY_ISLEAF as ISLEAF
        , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > 시스템', '홈') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.PROGRM_FILE_NM, ' > ') as PATH_PROGRM_FILE_NM
        , COMTNMENUINFO.*
    from COMTNMENUINFO /* 메뉴정보 */
    start with 1 = 1
--        and COMTNMENUINFO.MENU_NO = 0 /* 메뉴정보.메뉴번호 */
        and COMTNMENUINFO.MENU_NO = 1 /* 메뉴정보.메뉴번호 */
    connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* 메뉴정보.메뉴번호 = 메뉴정보.상위메뉴번호 */
    order siblings by
        COMTNMENUINFO.MENU_ORDR /* 메뉴정보.메뉴순서 */
) COMTNMENUINFO
left outer join COMTNPROGRMLIST on COMTNPROGRMLIST.PROGRM_FILE_NM = COMTNMENUINFO.PROGRM_FILE_NM /* 프로그램파일명 */
;

select
    ROWNUM as ROWNUM_01
--    , SYS_CONNECT_BY_PATH('<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>', ' > ') as PATH
    , SYS_CONNECT_BY_PATH(
        case
            when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' then
                COMTNMENUINFO.MENU_NM
            else
                '<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>'
        end
    , ' > ') as PATH
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , CONNECT_BY_ISLEAF as ISLEAF
    , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > 시스템', '홈') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.PROGRM_FILE_NM, ' > ') as PATH_PROGRM_FILE_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > ') as PATH_URL
    , COMTNMENUINFO.*
from COMTNMENUINFO /* 메뉴정보 */
left outer join COMTNPROGRMLIST on COMTNPROGRMLIST.PROGRM_FILE_NM = COMTNMENUINFO.PROGRM_FILE_NM /* 프로그램파일명 */
start with 1 = 1
    and COMTNMENUINFO.MENU_NO = 0 /* 메뉴정보.메뉴번호 */
--    and COMTNMENUINFO.MENU_NO = 1 /* 메뉴정보.메뉴번호 */
connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* 메뉴정보.메뉴번호 = 메뉴정보.상위메뉴번호 */
order siblings by
    COMTNMENUINFO.MENU_ORDR /* 메뉴정보.메뉴순서 */
;

select
    ROWNUM as ROWNUM_01
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , CONNECT_BY_ISLEAF as ISLEAF
    , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > root', '홈') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(
        case
            when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' or COMTNMENUCREATDTLS.MENU_NO is null then
                COMTNMENUINFO.MENU_NM
            else
                '<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>'
        end
        , ' > '
    ) as PATH_01
/* 메뉴정보 */
    , COMTNMENUINFO.MENU_NM
    , COMTNMENUINFO.PROGRM_FILE_NM
    , COMTNMENUINFO.MENU_NO
    , substr(COMTNMENUINFO.MENU_NO, 0, 1) as MENU_NO_01
    , substr(COMTNMENUINFO.MENU_NO, 0, 3) as MENU_NO_02
    , substr(COMTNMENUINFO.MENU_NO, 0, 5) as MENU_NO_03
--    , COMTNMENUINFO.PROGRM_FILE_NM as COMTNMENUINFO_PROGRM_FILE_NM
--    , COMTNMENUINFO.MENU_NO as COMTNMENUINFO_MENU_NO
    , COMTNMENUINFO.UPPER_MENU_NO
    , COMTNMENUINFO.MENU_ORDR
    , COMTNMENUINFO.MENU_DC
    , COMTNMENUINFO.RELATE_IMAGE_PATH
    , COMTNMENUINFO.RELATE_IMAGE_NM
    , (
        select count(*)
        from COMTNMENUINFO Z1 /* 메뉴정보 */
        where Z1.UPPER_MENU_NO = COMTNMENUINFO.UPPER_MENU_NO
    ) as CHILD_CNT
/* 프로그램목록 */
    , COMTNPROGRMLIST.PROGRM_FILE_NM as COMTNPROGRMLIST_PROGRM_FILE_NM
    , COMTNPROGRMLIST.PROGRM_STRE_PATH
    , COMTNPROGRMLIST.PROGRM_KOREAN_NM
    , COMTNPROGRMLIST.PROGRM_DC
    , COMTNPROGRMLIST.URL
    , case
        when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' or COMTNMENUCREATDTLS.MENU_NO is null then
            null
        else
            COMTNPROGRMLIST.URL
    end
    as URL_01
/* 메뉴생성내역 */
    , COMTNMENUCREATDTLS.MENU_NO as COMTNMENUCREATDTLS_MENU_NO /* 메뉴생성내역.메뉴번호 */
    , COMTNMENUCREATDTLS.AUTHOR_CODE /* 메뉴생성내역.권한코드 */
    , COMTNMENUCREATDTLS.MAPNG_CREAT_ID /* 메뉴생성내역.매핑생성ID */
from COMTNMENUINFO /* 메뉴정보 */
left outer join COMTNPROGRMLIST on COMTNPROGRMLIST.PROGRM_FILE_NM = COMTNMENUINFO.PROGRM_FILE_NM /* 프로그램파일명 */
left outer join COMTNMENUCREATDTLS /* 메뉴생성내역 */ on COMTNMENUCREATDTLS.MENU_NO = COMTNMENUINFO.MENU_NO /* 메뉴생성내역.메뉴번호 */
    and COMTNMENUCREATDTLS.AUTHOR_CODE = 'ROLE_USER' /* 메뉴생성내역.권한코드 */
start with 1 = 1
    and COMTNMENUINFO.MENU_NO = 0 /* 메뉴정보.메뉴번호 */
connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* 메뉴정보.메뉴번호 = 메뉴정보.상위메뉴번호 */
order siblings by
    COMTNMENUINFO.MENU_ORDR /* 메뉴정보.메뉴순서 */
;

/*
count
*/
select
    *
from COMTNMENUINFO /* 메뉴정보 */
where 1 = 1
    and UPPER_MENU_NO = 100
;
