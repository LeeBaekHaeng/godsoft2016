@echo off

@rem Shell Name : today.bat                                         	
@rem Description : today
@rem Modification Information                                                				
@rem                                                                    
@rem 수정일                      수정자                   수정내용
@rem -------      --------     ---------------------------
@rem 2016.11.05    이백행                   최초 생성
@rem
@rem author 갓소프트 이백행
@rem since 2016. 11. 05
@rem version 1.0
@rem see
@rem
@rem Copyright (C) 2016 by 갓소프트  All right reserved.

cls

set god_date=%date%
set god_yyyy=%god_date:~0,4%
set god_mm=%god_date:~5,2%
set god_dd=%god_date:~8,2%
set god_yyyymmdd=%god_yyyy%%god_mm%%god_dd%

echo god_date=%god_date%
echo god_yyyy=%god_yyyy%
echo god_mm=%god_mm%
echo god_dd=%god_dd%
echo god_yyyymmdd=%god_yyyymmdd%

set god_time=%TIME: =0%
set god_hh=%god_time:~0,2%
set god_mm=%god_time:~3,2%
set god_ss=%god_time:~6,2%
set god_hhmmss=%god_hh%%god_mm%%god_ss%

echo god_time=%god_time%
echo god_hh=%god_hh%
echo god_mm=%god_mm%
echo god_ss=%god_ss%
echo god_hhmmss=%god_hhmmss%

set god_yyyymmddhhmmss=%god_yyyymmdd%%god_hhmmss%

echo god_yyyymmddhhmmss=%god_yyyymmddhhmmss%

set god_yyyymmddhhmmss_a1=%god_date%_%god_hh%-%god_mm%-%god_ss%

echo god_yyyymmddhhmmss_a1=%god_yyyymmddhhmmss_a1%
