select
    ROWNUM as ROWNUM_01
    , COMTNSITEMAP.MAPNG_CREAT_ID /* 사이트맵.매핑생성ID */
    , COMTNSITEMAP.CREATR_ID /* 사이트맵.생성자ID */
    , COMTNSITEMAP.MAPNG_FILE_NM /* 사이트맵.매핑파일명 */
    , COMTNSITEMAP.MAPNG_FILE_PATH /* 사이트맵.매핑파일경로 */
from COMTNSITEMAP /* 사이트맵 */
;
