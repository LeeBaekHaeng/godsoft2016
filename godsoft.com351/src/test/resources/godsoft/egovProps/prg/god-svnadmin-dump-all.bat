@echo off

@rem Shell Name : god-svnadmin-dump-all.bat                                         	
@rem Description : svn ���� ��ü
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
