select
/*+ index(COMTNEMPLYRINFO COMTNEMPLYRINFO_PK) */
    *
from COMTNEMPLYRINFO /* ������������� */
where 1 = 1
    and exists (
        select
            1
        from COMTNEMPLYRSCRTYESTBS /* ����ں��ȼ��� */
        where 1 = 1
            and SCRTY_DTRMN_TRGET_ID = ESNTL_ID
        group by
            SCRTY_DTRMN_TRGET_ID
        having count(*) > 1
    )
;

select
    *
from COMTNEMPLYRINFO /* ������������� */
left outer join COMTNEMPLYRSCRTYESTBS /* ����ں��ȼ��� */ on COMTNEMPLYRSCRTYESTBS.SCRTY_DTRMN_TRGET_ID = COMTNEMPLYRINFO.ESNTL_ID
;

select * from COMTNEMPLYRSCRTYESTBS /* ����ں��ȼ��� */
;

select
    SCRTY_DTRMN_TRGET_ID
    , count(*) as CNT
    , count(AUTHOR_CODE) as CNT_AUTHOR_CODE
from COMTNEMPLYRSCRTYESTBS /* ����ں��ȼ��� */
group by
    SCRTY_DTRMN_TRGET_ID
order by
    CNT desc
;
