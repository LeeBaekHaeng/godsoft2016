select
    /*+ index(ORGNZT_INFO COMTNORGNZTINFO_PK) */
    ORGNZT_INFO.*
from COMTNORGNZTINFO ORGNZT_INFO /* �������� */
;
