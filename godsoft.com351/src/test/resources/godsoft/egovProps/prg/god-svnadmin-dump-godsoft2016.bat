@echo off

@rem Shell Name : god-svnadmin-dump-godsoft2016.bat                                         	
@rem Description : svn 덤프
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
@rem Copyright (C) 2016 by 이백행  All right reserved.

cls

rem today

set god_date=%date%
set god_yyyy=%god_date:~0,4%
set god_mm=%god_date:~5,2%
set god_dd=%god_date:~8,2%
set god_yyyymmdd=%god_yyyy%%god_mm%%god_dd%

set god_time=%TIME: =0%
set god_hh=%god_time:~0,2%
set god_mm=%god_time:~3,2%
set god_ss=%god_time:~6,2%
set god_hhmmss=%god_hh%%god_mm%%god_ss%

set god_yyyymmddhhmmss=%god_yyyymmdd%%god_hhmmss%
set god_yyyymmddhhmmss_a1=%god_date%_%god_hh%-%god_mm%-%god_ss%

rem today

set REPOS_PATH_01=D:\Repositories\
set REPOS_PATH_02=D:\Repositories-dump\

set REPOS_PATH_A1=eGovFrameDev-2.7.1-32bit
set REPOS_PATH_A2=eGovFrameDev-3.1.0-32bit
set REPOS_PATH_A3=eGovFrameDev-3.1.0-64bit
set REPOS_PATH_A4=eGovFrameDev-3.2.0-32bit
set REPOS_PATH_A5=godsoft2016
set REPOS_PATH_A6=godsoft2016-test
set REPOS_PATH_A7=kosii-study2015

rem REPOS_PATH
set REPOS_PATH_01_A1=%REPOS_PATH_01%%REPOS_PATH_A1%
set REPOS_PATH_02_A1=%REPOS_PATH_02%%REPOS_PATH_A1%_%god_yyyymmddhhmmss_a1%.dump

set REPOS_PATH_01_A2=%REPOS_PATH_01%%REPOS_PATH_A2%
set REPOS_PATH_02_A2=%REPOS_PATH_02%%REPOS_PATH_A2%_%god_yyyymmddhhmmss_a1%.dump

set REPOS_PATH_01_A3=%REPOS_PATH_01%%REPOS_PATH_A3%
set REPOS_PATH_02_A3=%REPOS_PATH_02%%REPOS_PATH_A3%_%god_yyyymmddhhmmss_a1%.dump

set REPOS_PATH_01_A4=%REPOS_PATH_01%%REPOS_PATH_A4%
set REPOS_PATH_02_A4=%REPOS_PATH_02%%REPOS_PATH_A4%_%god_yyyymmddhhmmss_a1%.dump

set REPOS_PATH_01_A5=%REPOS_PATH_01%%REPOS_PATH_A5%
set REPOS_PATH_02_A5=%REPOS_PATH_02%%REPOS_PATH_A5%_%god_yyyymmddhhmmss_a1%.dump

set REPOS_PATH_01_A6=%REPOS_PATH_01%%REPOS_PATH_A6%
set REPOS_PATH_02_A6=%REPOS_PATH_02%%REPOS_PATH_A6%_%god_yyyymmddhhmmss_a1%.dump

set REPOS_PATH_01_A7=%REPOS_PATH_01%%REPOS_PATH_A7%
set REPOS_PATH_02_A7=%REPOS_PATH_02%%REPOS_PATH_A7%_%god_yyyymmddhhmmss_a1%.dump

rem svnadmin dump
svnadmin dump %REPOS_PATH_01_A1% > %REPOS_PATH_02_A1%

svnadmin dump %REPOS_PATH_01_A2% > %REPOS_PATH_02_A2%

svnadmin dump %REPOS_PATH_01_A3% > %REPOS_PATH_02_A3%

svnadmin dump %REPOS_PATH_01_A4% > %REPOS_PATH_02_A4%

svnadmin dump %REPOS_PATH_01_A5% > %REPOS_PATH_02_A5%

svnadmin dump %REPOS_PATH_01_A6% > %REPOS_PATH_02_A6%

svnadmin dump %REPOS_PATH_01_A7% > %REPOS_PATH_02_A7%

rem echo
echo REPOS_PATH_01_A1=%REPOS_PATH_01_A1%
echo REPOS_PATH_02_A1=%REPOS_PATH_02_A1%

echo REPOS_PATH_01_A2=%REPOS_PATH_01_A2%
echo REPOS_PATH_02_A2=%REPOS_PATH_02_A2%

echo REPOS_PATH_01_A3=%REPOS_PATH_01_A3%
echo REPOS_PATH_02_A3=%REPOS_PATH_02_A3%

echo REPOS_PATH_01_A4=%REPOS_PATH_01_A4%
echo REPOS_PATH_02_A4=%REPOS_PATH_02_A4%

echo REPOS_PATH_01_A5=%REPOS_PATH_01_A5%
echo REPOS_PATH_02_A5=%REPOS_PATH_02_A5%

echo REPOS_PATH_01_A6=%REPOS_PATH_01_A6%
echo REPOS_PATH_02_A6=%REPOS_PATH_02_A6%

echo REPOS_PATH_01_A7=%REPOS_PATH_01_A7%
echo REPOS_PATH_02_A7=%REPOS_PATH_02_A7%
