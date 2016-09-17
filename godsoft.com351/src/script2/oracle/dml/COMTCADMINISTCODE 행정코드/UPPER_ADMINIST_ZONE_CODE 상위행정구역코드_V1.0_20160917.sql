select
    COMTCADMINISTCODE.ADMINIST_ZONE_SE /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
    , COMTCADMINISTCODE.USE_AT /* �����ڵ�.��뿩�� */
    , COMTCADMINISTCODE.ADMINIST_ZONE_NM /* �����ڵ�.���������� */
    , COMTCADMINISTCODE.UPPER_ADMINIST_ZONE_CODE /* �����ڵ�.�������������ڵ� */
--    , decode(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, '__00000000', COMTCADMINISTCODE.ADMINIST_ZONE_CODE) as UPPER_ADMINIST_ZONE_CODE_01 /* �����ڵ�.���������ڵ� */
    , case when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' then '0000000000'
    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_____00000' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000'
    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '________00' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 8) || '00'
--    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1)
    else COMTCADMINISTCODE.ADMINIST_ZONE_CODE
    end as UPPER_ADMINIST_ZONE_CODE_01 /* �����ڵ�.���������ڵ� */
    , COMTCADMINISTCODE.CREAT_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.ABL_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.FRST_REGIST_PNTTM /* �����ڵ�.���ʵ�Ͻ��� */
    , COMTCADMINISTCODE.FRST_REGISTER_ID /* �����ڵ�.���ʵ����ID */
    , COMTCADMINISTCODE.LAST_UPDT_PNTTM /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.LAST_UPDUSR_ID /* �����ڵ�.����������ID */
from COMTCADMINISTCODE /* �����ڵ� */
where 1 = 1
--    and COMTCADMINISTCODE.ADMINIST_ZONE_SE = '1' /* �����ڵ�.������������ = ������ */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' /* �����ڵ�.���������ڵ� �õ� 2 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '____000000' /* �����ڵ�.���������ڵ� �ñ��� 3 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_______000' /* �����ڵ�.���������ڵ� ���鵿 3 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' /* �����ڵ�.���������ڵ� �� 2*/
--    and COMTCADMINISTCODE.USE_AT = 'Y' /* �����ڵ�.��뿩�� */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '11___00000' /* �����ڵ�.���������ڵ� �õ� 2 */
    and UPPER_ADMINIST_ZONE_CODE = '1100000000'
order by
    COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
;

select
    a.UPPER_ADMINIST_ZONE_CODE_01
    , (select COMTCADMINISTCODE.ADMINIST_ZONE_NM from COMTCADMINISTCODE where COMTCADMINISTCODE.ADMINIST_ZONE_SE = a.ADMINIST_ZONE_SE and COMTCADMINISTCODE.ADMINIST_ZONE_CODE = a.UPPER_ADMINIST_ZONE_CODE_01) as UPPER_ADMINIST_ZONE_NM_01
    , a.*
from (
select
    COMTCADMINISTCODE.ADMINIST_ZONE_SE /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
    , COMTCADMINISTCODE.USE_AT /* �����ڵ�.��뿩�� */
    , COMTCADMINISTCODE.ADMINIST_ZONE_NM /* �����ڵ�.���������� */
    , COMTCADMINISTCODE.UPPER_ADMINIST_ZONE_CODE /* �����ڵ�.�������������ڵ� */
--    , decode(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, '__00000000', COMTCADMINISTCODE.ADMINIST_ZONE_CODE) as UPPER_ADMINIST_ZONE_CODE_01 /* �����ڵ�.���������ڵ� */
    , case when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' then '0000000000'
    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_____00000' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000'
    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '________00' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 5) || '00000'
--    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1)
    else COMTCADMINISTCODE.ADMINIST_ZONE_CODE
    end as UPPER_ADMINIST_ZONE_CODE_01 /* �����ڵ�.���������ڵ� */
    , COMTCADMINISTCODE.CREAT_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.ABL_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.FRST_REGIST_PNTTM /* �����ڵ�.���ʵ�Ͻ��� */
    , COMTCADMINISTCODE.FRST_REGISTER_ID /* �����ڵ�.���ʵ����ID */
    , COMTCADMINISTCODE.LAST_UPDT_PNTTM /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.LAST_UPDUSR_ID /* �����ڵ�.����������ID */
from COMTCADMINISTCODE /* �����ڵ� */
where 1 = 1
    and COMTCADMINISTCODE.ADMINIST_ZONE_SE = '1' /* �����ڵ�.������������ = ������ */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' /* �����ڵ�.���������ڵ� �õ� 2 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '____000000' /* �����ڵ�.���������ڵ� �ñ��� 3 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_______000' /* �����ڵ�.���������ڵ� ���鵿 3 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' /* �����ڵ�.���������ڵ� �� 2*/
    and COMTCADMINISTCODE.USE_AT = 'Y' /* �����ڵ�.��뿩�� */
--order by
--    COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
) a
where 1= 1
--    and a.UPPER_ADMINIST_ZONE_CODE_01 = '0000000000'
--    and a.UPPER_ADMINIST_ZONE_CODE_01 like '11___00000'
--    and a.UPPER_ADMINIST_ZONE_CODE_01 = '1100000000'
--    and a.UPPER_ADMINIST_ZONE_CODE_01 like '_____00000'
order by
    a.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
;

select
    level
    , connect_by_root ADMINIST_ZONE_CODE
    , connect_by_root UPPER_ADMINIST_ZONE_CODE_01
    , connect_by_isleaf
    , sys_connect_by_path(ADMINIST_ZONE_CODE, '/')
    , sys_connect_by_path(UPPER_ADMINIST_ZONE_CODE_01, '/')
    , a.*
from (
select
    COMTCADMINISTCODE.ADMINIST_ZONE_SE /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
    , COMTCADMINISTCODE.USE_AT /* �����ڵ�.��뿩�� */
    , COMTCADMINISTCODE.ADMINIST_ZONE_NM /* �����ڵ�.���������� */
    , COMTCADMINISTCODE.UPPER_ADMINIST_ZONE_CODE /* �����ڵ�.�������������ڵ� */
--    , decode(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, '__00000000', COMTCADMINISTCODE.ADMINIST_ZONE_CODE) as UPPER_ADMINIST_ZONE_CODE_01 /* �����ڵ�.���������ڵ� */
    , case when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' then '0000000000'
    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_____00000' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 2) || '00000000'
    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '________00' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1, 8) || '00'
--    when COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' then substr(COMTCADMINISTCODE.ADMINIST_ZONE_CODE, 1)
    else COMTCADMINISTCODE.ADMINIST_ZONE_CODE
    end as UPPER_ADMINIST_ZONE_CODE_01 /* �����ڵ�.���������ڵ� */
    , COMTCADMINISTCODE.CREAT_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.ABL_DE /* �����ڵ�.������ */
    , COMTCADMINISTCODE.FRST_REGIST_PNTTM /* �����ڵ�.���ʵ�Ͻ��� */
    , COMTCADMINISTCODE.FRST_REGISTER_ID /* �����ڵ�.���ʵ����ID */
    , COMTCADMINISTCODE.LAST_UPDT_PNTTM /* �����ڵ�.������������ */
    , COMTCADMINISTCODE.LAST_UPDUSR_ID /* �����ڵ�.����������ID */
from COMTCADMINISTCODE /* �����ڵ� */
where 1 = 1
--    and COMTCADMINISTCODE.ADMINIST_ZONE_SE = '1' /* �����ڵ�.������������ = ������ */
--    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__00000000' /* �����ڵ�.���������ڵ� �õ� 2 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '____000000' /* �����ڵ�.���������ڵ� �ñ��� 3 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '_______000' /* �����ڵ�.���������ڵ� ���鵿 3 */
----    and COMTCADMINISTCODE.ADMINIST_ZONE_CODE like '__________' /* �����ڵ�.���������ڵ� �� 2*/
--    and COMTCADMINISTCODE.USE_AT = 'Y' /* �����ڵ�.��뿩�� */
--order by
--    COMTCADMINISTCODE.ADMINIST_ZONE_CODE /* �����ڵ�.���������ڵ� */
) a
START WITH UPPER_ADMINIST_ZONE_CODE = '0000000000'
--START WITH UPPER_ADMINIST_ZONE_CODE_01 = '0000000000'
--START WITH UPPER_ADMINIST_ZONE_CODE_01 = '1100000000'
--START WITH UPPER_ADMINIST_ZONE_CODE = '1100000000'
--START WITH ADMINIST_ZONE_CODE = '1100000000'
--START WITH UPPER_ADMINIST_ZONE_CODE is null
--CONNECT BY PRIOR UPPER_ADMINIST_ZONE_CODE_01 = ADMINIST_ZONE_CODE
--CONNECT BY PRIOR UPPER_ADMINIST_ZONE_CODE = ADMINIST_ZONE_CODE
CONNECT BY PRIOR ADMINIST_ZONE_CODE = UPPER_ADMINIST_ZONE_CODE
--CONNECT BY NOCYCLE PRIOR UPPER_ADMINIST_ZONE_CODE_01 = ADMINIST_ZONE_CODE
ORDER SIBLINGS BY
    ADMINIST_ZONE_CODE
;
