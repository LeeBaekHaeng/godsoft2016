select
    ROWNUM as ROWNUM_01
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , prior COMTNMENUINFO.MENU_NO as PRIOR_MENU_NO
    , prior COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , connect_by_root COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , connect_by_root COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , connect_by_isleaf as ISLEAF
    , replace(sys_connect_by_path(COMTNMENUINFO.MENU_NM, ' > '), ' > root', '홈') as PATH_MENU_NM
    , replace(sys_connect_by_path(
        case
            when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' or COMTNMENUCREATDTLS.MENU_NO is null then
                COMTNMENUINFO.MENU_NM
            else
                '<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>'
        end
        , ' > '
    ), ' > root', '홈') as PATH_01
/* 메뉴정보 */
    , COMTNMENUINFO.MENU_NM
    , COMTNMENUINFO.PROGRM_FILE_NM
    , COMTNMENUINFO.MENU_NO
    , substr(COMTNMENUINFO.MENU_NO, 1, 1) as MENU_NO_01
    , substr(COMTNMENUINFO.MENU_NO, 1, 3) as MENU_NO_02
    , COMTNMENUINFO.PROGRM_FILE_NM as COMTNMENUINFO_PROGRM_FILE_NM
    , COMTNMENUINFO.MENU_NO as COMTNMENUINFO_MENU_NO
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
