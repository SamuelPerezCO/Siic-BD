--drops de las secuencias
DROP SEQUENCE incremento_en_roles;
DROP SEQUENCE incremento_en_perfiles;
DROP SEQUENCE incremento_en_permisos;
DROP SEQUENCE incremento_en_clases;
DROP SEQUENCE incremento_en_presentaciones;
DROP SEQUENCE incremento_en_usuarios;
DROP SEQUENCE incremento_en_preCla;

--drops de los trigger
DROP TRIGGER TRG_IN_roles;
DROP TRIGGER TRG_IN_perfiles;
DROP TRIGGER TRG_IN_permisos;
DROP TRIGGER TRG_IN_clases;
DROP TRIGGER TRG_IN_presentaciones;
DROP TRIGGER TRG_IN_usuarios;
DROP TRIGGER TRG_IN_preCla;


-- secuencias para las tablas
-- secuencia en roles
CREATE SEQUENCE incremento_en_roles
	START WITH 1
	INCREMENT BY 1;
	


--secuencia en perfiles
CREATE SEQUENCE incremento_en_perfiles
	START WITH 1
	INCREMENT BY 1;	
	
--secuencia en permisos
CREATE SEQUENCE incremento_en_permisos
	START WITH 1
	INCREMENT BY 1;
	
--secuencia en clases
CREATE SEQUENCE incremento_en_clases
	START WITH 1
	INCREMENT BY 1;
	
--secuencia en presentaciones
CREATE SEQUENCE incremento_en_presentaciones
	START WITH 1
	INCREMENT BY 1;
	
--secuencia en usuarios
CREATE SEQUENCE incremento_en_usuarios
	START WITH 1
	INCREMENT BY 1;
	
--secuencia en presentaciones_clases
CREATE SEQUENCE incremento_en_preCla
	START WITH 1
	INCREMENT BY 1;
	
	

-- Triggers para los incrementos en las tablas
-- trigger de roles
CREATE OR REPLACE TRIGGER TRG_IN_roles
	BEFORE INSERT ON roles
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_roles.NEXTVAL INTO :NEW.id_rol FROM dual;
	END;
	

-- trigger de perfiles
CREATE OR REPLACE TRIGGER TRG_IN_perfiles
	BEFORE INSERT ON perfiles
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_perfiles.NEXTVAL INTO :NEW.id_perfil FROM dual;
	END;	

-- trigger de permisos
CREATE OR REPLACE TRIGGER TRG_IN_permisos
	BEFORE INSERT ON permisos
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_permisos.NEXTVAL INTO :NEW.id_permiso FROM dual;
	END;
	
-- trigger de clases
CREATE OR REPLACE TRIGGER TRG_IN_clases
	BEFORE INSERT ON clases
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_clases.NEXTVAL INTO :NEW.id_clase FROM dual;
	END;
	
-- trigger de presentaciones
CREATE OR REPLACE TRIGGER TRG_IN_presentaciones
	BEFORE INSERT ON presentaciones
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_presentaciones.NEXTVAL INTO :NEW.id_presentacion FROM dual;
	END;
	
-- trigger de usuarios
CREATE OR REPLACE TRIGGER TRG_IN_usuarios
	BEFORE INSERT ON usuarios
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_usuarios.NEXTVAL INTO :NEW.id_usuario FROM dual;
	END;
	
-- trigger de roles
CREATE OR REPLACE TRIGGER TRG_IN_preCla
	BEFORE INSERT ON presentaciones_clases
	FOR EACH ROW
	BEGIN
		SELECT incremento_en_preCla.NEXTVAL INTO :NEW.id_pres_cla FROM dual;
	END;