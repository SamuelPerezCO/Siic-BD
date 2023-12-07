-- tablas

DROP TABLE presentaciones_clases;
DROP TABLE clases;
DROP TABLE presentaciones;
DROP TABLE perfiles;
DROP TABLE roles;
DROP TABLE permisos;
DROP TABLE usuarios;
DROP TABLE asistencias;


CREATE TABLE clases
(id_clase						NUMBER(2),
 link_grabacion					VARCHAR2(100),
 clase_descripcion				VARCHAR2(100))
 TABLESPACE ts_siic;
--201 

CREATE TABLE presentaciones
(id_presentacion				NUMBER(2),
 link_powerpoint				VARCHAR2(100),
 presen_descripcion				VARCHAR2(100))
 TABLESPACE ts_siic;
 --201
 
CREATE TABLE presentaciones_clases
(id_pres_cla					NUMBER(2),
 codigo_clase					NUMBER(2),
 codigo_pres					NUMBER(2))
 TABLESPACE ts_siic;
  --3
  
CREATE TABLE usuarios
(id_usuario						NUMBER(2),
 contrasenia					VARCHAR(18),
 us_nombre						VARCHAR2(70),
 us_apellido					VARCHAR2(50),
 us_SegApellido					VARCHAR2(50),
 correo							VARCHAR2(70),
 codigo_perfil					NUMBER(2))
 TABLESPACE ts_siic;
 --281
 
CREATE TABLE perfiles
(id_perfil						NUMBER(2),
 descripcion_perfil				VARCHAR2(30),
 codigo_rol						NUMBER(1),
 codigo_permiso					NUMBER(1))
 TABLESPACE ts_siic;
 
CREATE TABLE roles
(id_rol							NUMBER(1),
 nombre_rol						VARCHAR2(15))
 TABLESPACE ts_siic;
 --16
 
CREATE TABLE permisos
(id_permiso						NUMBER(1),
 detalle_permiso				VARCHAR2(20))
 TABLESPACE ts_siic;
--21

CREATE TABLE asistencias
(dia							NUMBER(2),
 mes							NUMBER(2),
 anio							NUMBER(2),
 codigo_clase_asistencia		NUMBER(2),
 id_usuario_asistencia			NUMBER(2))
 TABLESPACE ts_siic;
 --74
 
 PURGE TABLESPACE ts_siic;
 
 --un registro completo utiliza 797 bytes
 --se define un TS de 1M, ya que este tamaño
 --con la prospeccion de crecimiento al año realizada
 --<<como se muestra en el diccionario de datos>>
 --Se utilizaran 86714 bytes.