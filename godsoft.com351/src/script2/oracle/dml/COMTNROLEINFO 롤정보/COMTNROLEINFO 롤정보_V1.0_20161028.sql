select
    COMTNROLEINFO.*
from COMTNROLEINFO /* ������ */
;

select
/*+ index(COM_TN_ROLE_INFO COMTNROLEINFO_PK) */
    COM_TN_ROLE_INFO.*
from COMTNROLEINFO COM_TN_ROLE_INFO /* ������ */
;
