/*
�޴�����
http://www.egovframe.go.kr/wiki/doku.php?id=egovframework:com:v2:sym:%EB%A9%94%EB%89%B4%EA%B4%80%EB%A6%AC

�޴��ϰ� �������
batchmenubind_�޴�����.xls
http://www.egovframe.go.kr/wiki/lib/exe/fetch.php?media=egovframework:com:v2:sym:batchmenubind_%EB%A9%94%EB%89%B4%EC%83%98%ED%94%8C.xls

1091. �޴���������Ʈ

https://docs.oracle.com/cd/B19306_01/server.102/b14200/queries003.htm

Hierarchical Queries

���� ����
*/

select
    ROWNUM as ROWNUM_01
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , CONNECT_BY_ISLEAF as ISLEAF
    , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > �ý���', 'Ȩ') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.PROGRM_FILE_NM, ' > ') as PATH_PROGRM_FILE_NM
    , COMTNMENUINFO.*
from COMTNMENUINFO /* �޴����� */
start with 1 = 1
--    and COMTNMENUINFO.MENU_NO = 0 /* �޴�����.�޴���ȣ */
    and COMTNMENUINFO.MENU_NO = 1 /* �޴�����.�޴���ȣ */
connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* �޴�����.�޴���ȣ = �޴�����.�����޴���ȣ */
order siblings by
    COMTNMENUINFO.MENU_ORDR /* �޴�����.�޴����� */
;

select
    ROWNUM as ROWNUM_01
    , LEVEL_01
    , PRIOR_MENU_NO
    , MENU_NM_01
    , PRIOR_MENU_NM
    , ROOT_MENU_NO
    , ROOT_MENU_NM
    , ISLEAF
    , PATH_MENU_NM
    , PATH_PROGRM_FILE_NM
/* �޴����� */
    , COMTNMENUINFO.MENU_NM
    , COMTNMENUINFO.PROGRM_FILE_NM
    , COMTNMENUINFO.MENU_NO
    , COMTNMENUINFO.UPPER_MENU_NO
    , COMTNMENUINFO.MENU_ORDR
    , COMTNMENUINFO.MENU_DC
    , COMTNMENUINFO.RELATE_IMAGE_PATH
    , COMTNMENUINFO.RELATE_IMAGE_NM
/* ���α׷���� */
    , COMTNPROGRMLIST.PROGRM_STRE_PATH
    , COMTNPROGRMLIST.PROGRM_KOREAN_NM
    , COMTNPROGRMLIST.PROGRM_DC
    , COMTNPROGRMLIST.URL
from (
    select
        ROWNUM as ROWNUM_01
        , LEVEL as LEVEL_01
        , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
        , PRIOR COMTNMENUINFO.MENU_NO as PRIOR_MENU_NO
        , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
        , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
        , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
        , CONNECT_BY_ISLEAF as ISLEAF
        , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > �ý���', 'Ȩ') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.PROGRM_FILE_NM, ' > ') as PATH_PROGRM_FILE_NM
        , COMTNMENUINFO.*
    from COMTNMENUINFO /* �޴����� */
    start with 1 = 1
--        and COMTNMENUINFO.MENU_NO = 0 /* �޴�����.�޴���ȣ */
        and COMTNMENUINFO.MENU_NO = 1 /* �޴�����.�޴���ȣ */
    connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* �޴�����.�޴���ȣ = �޴�����.�����޴���ȣ */
    order siblings by
        COMTNMENUINFO.MENU_ORDR /* �޴�����.�޴����� */
) COMTNMENUINFO
left outer join COMTNPROGRMLIST on COMTNPROGRMLIST.PROGRM_FILE_NM = COMTNMENUINFO.PROGRM_FILE_NM /* ���α׷����ϸ� */
;

select
    ROWNUM as ROWNUM_01
--    , SYS_CONNECT_BY_PATH('<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>', ' > ') as PATH
    , SYS_CONNECT_BY_PATH(
        case
            when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' then
                COMTNMENUINFO.MENU_NM
            else
                '<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>'
        end
    , ' > ') as PATH
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , CONNECT_BY_ISLEAF as ISLEAF
    , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > �ý���', 'Ȩ') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.PROGRM_FILE_NM, ' > ') as PATH_PROGRM_FILE_NM
    , SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > ') as PATH_URL
    , COMTNMENUINFO.*
from COMTNMENUINFO /* �޴����� */
left outer join COMTNPROGRMLIST on COMTNPROGRMLIST.PROGRM_FILE_NM = COMTNMENUINFO.PROGRM_FILE_NM /* ���α׷����ϸ� */
start with 1 = 1
    and COMTNMENUINFO.MENU_NO = 0 /* �޴�����.�޴���ȣ */
--    and COMTNMENUINFO.MENU_NO = 1 /* �޴�����.�޴���ȣ */
connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* �޴�����.�޴���ȣ = �޴�����.�����޴���ȣ */
order siblings by
    COMTNMENUINFO.MENU_ORDR /* �޴�����.�޴����� */
;

select
    ROWNUM as ROWNUM_01
    , LEVEL as LEVEL_01
    , lpad(' ', 4 * (level - 1)) || COMTNMENUINFO.MENU_NM as MENU_NM_01
    , PRIOR COMTNMENUINFO.MENU_NM as PRIOR_MENU_NM
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NO as ROOT_MENU_NO
    , CONNECT_BY_ROOT COMTNMENUINFO.MENU_NM as ROOT_MENU_NM
    , CONNECT_BY_ISLEAF as ISLEAF
    , replace(SYS_CONNECT_BY_PATH(COMTNMENUINFO.MENU_NM, ' > '), ' > root', 'Ȩ') as PATH_MENU_NM
    , SYS_CONNECT_BY_PATH(
        case
            when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' or COMTNMENUCREATDTLS.MENU_NO is null then
                COMTNMENUINFO.MENU_NM
            else
                '<a href="' || COMTNPROGRMLIST.URL || '">' || COMTNMENUINFO.MENU_NM || '</a>'
        end
        , ' > '
    ) as PATH_01
/* �޴����� */
    , COMTNMENUINFO.MENU_NM
    , COMTNMENUINFO.PROGRM_FILE_NM
    , COMTNMENUINFO.MENU_NO
--    , COMTNMENUINFO.PROGRM_FILE_NM as COMTNMENUINFO_PROGRM_FILE_NM
--    , COMTNMENUINFO.MENU_NO as COMTNMENUINFO_MENU_NO
    , COMTNMENUINFO.UPPER_MENU_NO
    , COMTNMENUINFO.MENU_ORDR
    , COMTNMENUINFO.MENU_DC
    , COMTNMENUINFO.RELATE_IMAGE_PATH
    , COMTNMENUINFO.RELATE_IMAGE_NM
/* ���α׷���� */
    , COMTNPROGRMLIST.PROGRM_FILE_NM as COMTNPROGRMLIST_PROGRM_FILE_NM
    , COMTNPROGRMLIST.PROGRM_STRE_PATH
    , COMTNPROGRMLIST.PROGRM_KOREAN_NM
    , COMTNPROGRMLIST.PROGRM_DC
    , COMTNPROGRMLIST.URL
    , case
        when COMTNMENUINFO.PROGRM_FILE_NM = 'dir' or COMTNMENUCREATDTLS.MENU_NO is null then
            null
        else
            COMTNPROGRMLIST.URL
    end
    as URL_01
/* �޴��������� */
    , COMTNMENUCREATDTLS.MENU_NO as COMTNMENUCREATDTLS_MENU_NO /* �޴���������.�޴���ȣ */
    , COMTNMENUCREATDTLS.AUTHOR_CODE /* �޴���������.�����ڵ� */
    , COMTNMENUCREATDTLS.MAPNG_CREAT_ID /* �޴���������.���λ���ID */
from COMTNMENUINFO /* �޴����� */
left outer join COMTNPROGRMLIST on COMTNPROGRMLIST.PROGRM_FILE_NM = COMTNMENUINFO.PROGRM_FILE_NM /* ���α׷����ϸ� */
left outer join COMTNMENUCREATDTLS /* �޴��������� */ on COMTNMENUCREATDTLS.MENU_NO = COMTNMENUINFO.MENU_NO /* �޴���������.�޴���ȣ */
    and COMTNMENUCREATDTLS.AUTHOR_CODE = 'ROLE_USER' /* �޴���������.�����ڵ� */
start with 1 = 1
    and COMTNMENUINFO.MENU_NO = 0 /* �޴�����.�޴���ȣ */
connect by nocycle prior COMTNMENUINFO.MENU_NO = COMTNMENUINFO.UPPER_MENU_NO /* �޴�����.�޴���ȣ = �޴�����.�����޴���ȣ */
order siblings by
    COMTNMENUINFO.MENU_ORDR /* �޴�����.�޴����� */
;
