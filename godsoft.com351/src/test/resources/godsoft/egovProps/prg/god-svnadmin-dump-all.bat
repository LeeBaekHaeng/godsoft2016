@echo off

@rem Shell Name : god-svnadmin-dump-all.bat                                         	
@rem Description : svn 덤프 전체
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

set REPOS_PATH_SOURCE=D:\Repositories\
set REPOS_PATH_DEST=D:\Repositories-dump\

set REPOS_PATH=eGovFrameDev-2.7.1-32bit
call god-svnadmin-dump.bat

set REPOS_PATH=eGovFrameDev-3.1.0-32bit
call god-svnadmin-dump.bat

set REPOS_PATH=eGovFrameDev-3.1.0-64bit
call god-svnadmin-dump.bat

set REPOS_PATH=eGovFrameDev-3.2.0-32bit
call god-svnadmin-dump.bat

set REPOS_PATH=godsoft2016
call god-svnadmin-dump.bat

set REPOS_PATH=godsoft2016-test
call god-svnadmin-dump.bat

set REPOS_PATH=kosii-study2015
call god-svnadmin-dump.bat
