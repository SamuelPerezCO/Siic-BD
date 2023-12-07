--script esquema de siic

connect system/123

show con_name

ALTER SESSION SET CONTAINER=CDB$ROOT;
ALTER DATABASE OPEN;

DROP TABLESPACE ts_siic INCLUDING CONTENTS and DATAFILES;
    
CREATE TABLESPACE ts_siic LOGGING
DATAFILE 'C:\CBDI-1\DF_siic.dbf' size 1M
extent management local segment space management auto; 
 
alter session set "_ORACLE_SCRIPT"=true; 
 
drop user admi_siic cascade;
    
CREATE user admi_siic profile default 
identified by 123
default tablespace ts_siic 
temporary tablespace temp 
account unlock;     

--privilegios
grant connect, resource,dba to admi_siic; 

connect admi_siic/123

show user