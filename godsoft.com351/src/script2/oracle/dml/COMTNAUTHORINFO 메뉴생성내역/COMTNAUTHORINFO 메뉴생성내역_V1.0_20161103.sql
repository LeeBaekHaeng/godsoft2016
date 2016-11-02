select
    ROWNUM as ROWNUM_01
    , COMTNMENUCREATDTLS.MENU_NO /* 메뉴생성내역.메뉴번호 */
    , COMTNMENUCREATDTLS.AUTHOR_CODE /* 메뉴생성내역.권한코드 */
    , COMTNMENUCREATDTLS.MAPNG_CREAT_ID /* 메뉴생성내역.매핑생성ID */
from COMTNMENUCREATDTLS /* 메뉴생성내역 */
where 1 = 1
    and COMTNMENUCREATDTLS.AUTHOR_CODE = 'ROLE_USER' /* 메뉴생성내역.권한코드 */
;
