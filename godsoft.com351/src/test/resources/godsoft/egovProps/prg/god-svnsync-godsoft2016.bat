@echo off

@rem Shell Name : svnsync.bat                                         	
@rem Description : 원격지의 Subversion 저장소 백업하기
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

set REPOS_PATH="D:\Repositories-sync\kosii-study2015_%god_yyyymmddhhmmss_a1%"
set TYPE_NUL="%REPOS_PATH%\hooks\pre-revprop-change.cmd"

set MIRROR_URL=file:///%REPOS_PATH%
set SOURCE_URL=https://dev.naver.com/svn/kosii-study2015

set DEST_URL=%MIRROR_URL%

rem 1. 빈 저장소 만들기
rem svnadmin help create
echo REPOS_PATH=%REPOS_PATH%
svnadmin create %REPOS_PATH%

rem 2. 빈 파일 생성
echo TYPE_NUL=%TYPE_NUL%
type nul > %TYPE_NUL%

rem 3. 저장소 초기화
cd %homepath%

echo SOURCE_URL=%SOURCE_URL%

rem https://www.visualsvn.com/support/svnbook/ref/svnsync/c/init/
svnsync init %MIRROR_URL% %SOURCE_URL%

rem 4. 저장소 동기화
rem svnsync sync --source-username= --source-password= --sync-username= --sync-password= %MIRROR_URL%

rem https://www.visualsvn.com/support/svnbook/ref/svnsync/c/sync/
rem svnsync sync %DEST_URL% %SOURCE_URL%
svnsync sync %DEST_URL%
