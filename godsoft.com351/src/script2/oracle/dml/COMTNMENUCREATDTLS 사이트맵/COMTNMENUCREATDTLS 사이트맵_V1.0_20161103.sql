select
    ROWNUM as ROWNUM_01
    , COMTNSITEMAP.MAPNG_CREAT_ID /* ����Ʈ��.���λ���ID */
    , COMTNSITEMAP.CREATR_ID /* ����Ʈ��.������ID */
    , COMTNSITEMAP.MAPNG_FILE_NM /* ����Ʈ��.�������ϸ� */
    , COMTNSITEMAP.MAPNG_FILE_PATH /* ����Ʈ��.�������ϰ�� */
from COMTNSITEMAP /* ����Ʈ�� */
;
