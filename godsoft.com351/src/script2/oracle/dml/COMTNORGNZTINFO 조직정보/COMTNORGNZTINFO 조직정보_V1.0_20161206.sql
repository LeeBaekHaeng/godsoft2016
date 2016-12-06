select
    /*+ index(ORGNZT_INFO COMTNORGNZTINFO_PK) */
    ORGNZT_INFO.*
from COMTNORGNZTINFO ORGNZT_INFO /* 조직정보 */
;
