select
    ROWNUM as ROWNUM_01
    , COMTNMENUCREATDTLS.MENU_NO /* �޴���������.�޴���ȣ */
    , COMTNMENUCREATDTLS.AUTHOR_CODE /* �޴���������.�����ڵ� */
    , COMTNMENUCREATDTLS.MAPNG_CREAT_ID /* �޴���������.���λ���ID */
from COMTNMENUCREATDTLS /* �޴��������� */
where 1 = 1
    and COMTNMENUCREATDTLS.AUTHOR_CODE = 'ROLE_USER' /* �޴���������.�����ڵ� */
;
