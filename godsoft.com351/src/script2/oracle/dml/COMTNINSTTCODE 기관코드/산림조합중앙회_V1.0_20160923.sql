/*
산림조합중앙회 기관코드
*/
SELECT
    LEVEL AS useAt
    , instt_code AS code
    , lowest_instt_nm AS codeNm
    , upper_instt_code AS codeDc
FROM comtninsttcode /* 기관코드 */
WHERE 1 = 1
    AND abl_ennc = '0' /* 기관코드.폐지유무 */
START WITH instt_code = 'B400001' /* 기관코드 = 산림조합중앙회 */
CONNECT BY PRIOR instt_code  = upper_instt_code /* 기관코드 = 상위기관코드 */
ORDER SIBLINGS BY odr, ord /* 차수, 서열 */
;
