select
    *
from COMTCCMMNCODE /* �����ڵ� */
where 1 = 1
--    and CODE_ID not like 'COM%'
    and FRST_REGISTER_ID = 'SYSTEM2'
;

insert into COMTCCMMNCODE (CODE_ID, CODE_ID_NM, CODE_ID_DC, USE_AT, CL_CODE, FRST_REGIST_PNTTM)
values ('GOD001', '�����ڵ�', '�����ڵ�', 'Y', 'EFC', sysdate);

delete from COMTCCMMNCODE /* �����ڵ� */
where 1 = 1
--    and CODE_ID not like 'COM%'
    and FRST_REGISTER_ID = 'SYSTEM2'
;
