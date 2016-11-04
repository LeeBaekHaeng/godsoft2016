select
/*+ index(COMTNEMPLYRINFO COMTNEMPLYRINFO_PK) */
    *
from COMTNEMPLYRINFO /* 업무사용자정보 */
where 1 = 1
    and exists (
        select
            1
        from COMTNEMPLYRSCRTYESTBS /* 사용자보안설정 */
        where 1 = 1
            and SCRTY_DTRMN_TRGET_ID = ESNTL_ID
        group by
            SCRTY_DTRMN_TRGET_ID
        having count(*) > 1
    )
;

select
    *
from COMTNEMPLYRINFO /* 업무사용자정보 */
left outer join COMTNEMPLYRSCRTYESTBS /* 사용자보안설정 */ on COMTNEMPLYRSCRTYESTBS.SCRTY_DTRMN_TRGET_ID = COMTNEMPLYRINFO.ESNTL_ID
;

select * from COMTNEMPLYRSCRTYESTBS /* 사용자보안설정 */
;

select
    SCRTY_DTRMN_TRGET_ID
    , count(*) as CNT
    , count(AUTHOR_CODE) as CNT_AUTHOR_CODE
from COMTNEMPLYRSCRTYESTBS /* 사용자보안설정 */
group by
    SCRTY_DTRMN_TRGET_ID
order by
    CNT desc
;
