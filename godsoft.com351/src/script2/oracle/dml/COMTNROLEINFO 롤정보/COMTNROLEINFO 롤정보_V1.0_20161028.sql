select
    COMTNROLEINFO.*
from COMTNROLEINFO /* 롤정보 */
;

select
/*+ index(COM_TN_ROLE_INFO COMTNROLEINFO_PK) */
    COM_TN_ROLE_INFO.*
from COMTNROLEINFO COM_TN_ROLE_INFO /* 롤정보 */
;
