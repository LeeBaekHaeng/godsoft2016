delete from COMTNTMPLATINFO /* ���ø� */
where 1 = 1
    and COMTNTMPLATINFO.TMPLAT_ID like 'TMPLAT_BOARD_00000%' /* ���ø�ID */
;

commit;
