CREATE OR REPLACE FUNCTION fn_cm_god_rgno (
    in_01 IN VARCHAR
    , in_02 IN VARCHAR
) RETURN VARCHAR IS
tmpVar VARCHAR(4000);
/******************************************************************************
   NAME:       fn_cm_god_rgno
   PURPOSE:    등록번호

   REVISIONS:
   Ver        Date        Author           Description
   ---------  ----------  ---------------  ------------------------------------
   1.0        2016-11-02   LeeBaekHaeng       1. Created this function.

   NOTES:

   Automatically available Auto Replace Keywords:
      Object Name:     fn_cm_god_rgno
      Sysdate:         2016-11-02
      Date and Time:   2016-11-02, 오후 6:13:57, and 2016-11-02 오후 6:13:57
      Username:        LeeBaekHaeng (set in TOAD Options, Procedure Editor)
      Table Name:       (set in the "New PL/SQL Object" dialog)

생년월일, 사업자등록번호, 법인등록번호

사업자등록번호
123-12-12345

법인 등기번호
123456
법인 등록번호
123456-1234567

******************************************************************************/
BEGIN
   tmpVar := null;

select
    case
        when in_01 = '01' then /* 생년월일 */
            substr(regexp_replace(in_02, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2'), 1, 6) || '-*******'
        when in_01 = '02' then /* 사업자등록번호 */
            regexp_replace(in_02, '^([0-9]{3})-?([0-9]{2})-?([0-9]{5})$$', '\1-\2-\3')
        when in_01 = '03' then /* 법인등록번호, 주민등록번호 */
            regexp_replace(in_02, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2')
        else
            in_02
    end
    into tmpVar
from dual
;

   RETURN tmpVar;
   EXCEPTION
     WHEN NO_DATA_FOUND THEN
       NULL;
     WHEN OTHERS THEN
       -- Consider logging the error and then re-raise
       RAISE;
END fn_cm_god_rgno;



/
