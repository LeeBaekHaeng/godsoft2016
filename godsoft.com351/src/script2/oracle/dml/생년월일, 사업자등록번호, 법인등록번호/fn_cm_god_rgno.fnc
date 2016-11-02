CREATE OR REPLACE FUNCTION fn_cm_god_rgno (
    in_01 IN VARCHAR
    , in_02 IN VARCHAR
) RETURN VARCHAR IS
tmpVar VARCHAR(4000);
/******************************************************************************
   NAME:       fn_cm_god_rgno
   PURPOSE:    ��Ϲ�ȣ

   REVISIONS:
   Ver        Date        Author           Description
   ---------  ----------  ---------------  ------------------------------------
   1.0        2016-11-02   LeeBaekHaeng       1. Created this function.

   NOTES:

   Automatically available Auto Replace Keywords:
      Object Name:     fn_cm_god_rgno
      Sysdate:         2016-11-02
      Date and Time:   2016-11-02, ���� 6:13:57, and 2016-11-02 ���� 6:13:57
      Username:        LeeBaekHaeng (set in TOAD Options, Procedure Editor)
      Table Name:       (set in the "New PL/SQL Object" dialog)

�������, ����ڵ�Ϲ�ȣ, ���ε�Ϲ�ȣ

����ڵ�Ϲ�ȣ
123-12-12345

���� ����ȣ
123456
���� ��Ϲ�ȣ
123456-1234567

******************************************************************************/
BEGIN
   tmpVar := null;

select
    case
        when in_01 = '01' then /* ������� */
            substr(regexp_replace(in_02, '^([0-9]{6})-?([0-9]{7})$$', '\1-\2'), 1, 6) || '-*******'
        when in_01 = '02' then /* ����ڵ�Ϲ�ȣ */
            regexp_replace(in_02, '^([0-9]{3})-?([0-9]{2})-?([0-9]{5})$$', '\1-\2-\3')
        when in_01 = '03' then /* ���ε�Ϲ�ȣ, �ֹε�Ϲ�ȣ */
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
