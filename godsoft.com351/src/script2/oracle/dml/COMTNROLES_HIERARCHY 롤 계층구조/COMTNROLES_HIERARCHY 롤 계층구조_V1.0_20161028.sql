select
    COMTNROLES_HIERARCHY.*
from COMTNROLES_HIERARCHY /* ·Ñ °èÃþ±¸Á¶ */
;

/*
sqlHierarchicalRoles
*/
SELECT
    rownum as rn
    , a.CHLDRN_ROLE child
    , a.PARNTS_ROLE parent
FROM COMTNROLES_HIERARCHY a
LEFT JOIN COMTNROLES_HIERARCHY b on (a.CHLDRN_ROLE = b.PARNTS_ROLE)
;
