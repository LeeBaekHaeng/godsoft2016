/*
�긲�����߾�ȸ ����ڵ�
*/
SELECT
    LEVEL AS useAt
    , instt_code AS code
    , lowest_instt_nm AS codeNm
    , upper_instt_code AS codeDc
FROM comtninsttcode /* ����ڵ� */
WHERE 1 = 1
    AND abl_ennc = '0' /* ����ڵ�.�������� */
START WITH instt_code = 'B400001' /* ����ڵ� = �긲�����߾�ȸ */
CONNECT BY PRIOR instt_code  = upper_instt_code /* ����ڵ� = ��������ڵ� */
ORDER SIBLINGS BY odr, ord /* ����, ���� */
;
