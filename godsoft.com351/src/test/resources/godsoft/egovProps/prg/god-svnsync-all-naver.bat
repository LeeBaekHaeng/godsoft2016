@echo off

@rem Shell Name : god-svnsync-all-naver.bat                                         	
@rem Description : �������� Subversion ����� ����ϱ� ���̹�
@rem Modification Information                                                				
@rem                                                                    
@rem ������                      ������                   ��������
@rem -------      --------     ---------------------------
@rem 2016.11.05    �̹���                   ���� ����
@rem
@rem author ������Ʈ �̹���
@rem since 2016. 11. 05
@rem version 1.0
@rem see
@rem
@rem Copyright (C) 2016 by �̹���  All right reserved.

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

rem 2015�� �ѱ���������� ���͵�
set REPOS_PATH=D:\Repositories-sync\kosii-study2015_%god_yyyymmddhhmmss_a1%
set SOURCE_URL=https://dev.naver.com/svn/kosii-study2015
call god-svnsync.bat

rem ������Ʈ
set REPOS_PATH=D:\Repositories-sync\godsoft_%god_yyyymmddhhmmss_a1%
set SOURCE_URL=https://dev.naver.com/svn/godsoft
call god-svnsync.bat

rem ������Ʈ ����������Ʈ
set REPOS_PATH=D:\Repositories-sync\godsoft-com_%god_yyyymmddhhmmss_a1%
set SOURCE_URL=https://dev.naver.com/svn/godsoft-com
call god-svnsync.bat

rem ���������� �����ҽ� ������/����� ��/�� 
set REPOS_PATH=D:\Repositories-sync\daejeonnews_%god_yyyymmddhhmmss_a1%
set SOURCE_URL=https://dev.naver.com/svn/daejeonnews
call god-svnsync.bat
