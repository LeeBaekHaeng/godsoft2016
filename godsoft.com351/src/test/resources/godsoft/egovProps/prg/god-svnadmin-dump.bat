@echo off

@rem Shell Name : god-svnadmin-dump.bat                                         	
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

rem set REPOS_PATH_SOURCE="D:\Repositories\"
rem set REPOS_PATH_DEST="D:\Repositories-dump\"

rem set REPOS_PATH="eGovFrameDev-2.7.1-32bit"

echo REPOS_PATH_SOURCE=%REPOS_PATH_SOURCE%
echo REPOS_PATH_DEST=%REPOS_PATH_DEST%
echo REPOS_PATH=%REPOS_PATH%

REM if not "%REPOS_PATH%" == "" (
	REM echo %REPOS_PATH% 미존재
	REM set REPOS_PATH=eGovFrameDev-2.7.1-32bit
REM ) else (
	REM echo %REPOS_PATH% 존재
REM )

REM echo REPOS_PATH=%REPOS_PATH%

rem REPOS_PATH
set REPOS_PATH_SOURCE_01="%REPOS_PATH_SOURCE%%REPOS_PATH%"
set REPOS_PATH_DEST_02="%REPOS_PATH_DEST%%REPOS_PATH%_%god_yyyymmddhhmmss_a1%.dump"

rem svnadmin help dump
svnadmin dump %REPOS_PATH_SOURCE_01% > %REPOS_PATH_DEST_02%

rem echo
echo REPOS_PATH_SOURCE_01=%REPOS_PATH_SOURCE_01%
echo REPOS_PATH_DEST_02=%REPOS_PATH_DEST_02%
