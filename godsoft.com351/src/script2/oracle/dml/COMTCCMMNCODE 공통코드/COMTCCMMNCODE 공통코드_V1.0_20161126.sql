select
    *
from COMTCCMMNCODE /* 공통코드 */
;

insert into COMTCCMMNCODE (CODE_ID, CODE_ID_NM, CODE_ID_DC, USE_AT, CL_CODE, FRST_REGIST_PNTTM)
values ('GOD001', '구분코드', '구분코드', 'Y', 'EFC', sysdate);
