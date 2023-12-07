--constraints



--reglas para presentaciones

ALTER TABlE presentaciones ADD CONSTRAINT pk_ID_presentacion
	PRIMARY KEY(id_presentacion);

ALTER TABlE presentaciones ADD CONSTRAINT NN_powerpoint_PRESENTACIONES
	CHECK(link_powerpoint IS NOT NULL);

ALTER TABLE presentaciones ADD CONSTRAINT NN_descripcion_PRESENTACIONES
	CHECK(presen_descripcion IS NOT NULL);




--reglas para clases

ALTER TABlE clases ADD CONSTRAINT pk_ID_clase
	PRIMARY KEY(id_clase);

ALTER TABlE clases ADD CONSTRAINT NN_grabacion_CLASES
	CHECK(link_grabacion IS NOT NULL);
	
ALTER TABLE clases ADD CONSTRAINT NN_descripcion_CLASES
	CHECK(clase_descripcion IS NOT NULL);



--reglas para permisos

ALTER TABLE permisos ADD CONSTRAINT pk_id_permiso
	PRIMARY KEY(id_permiso);
	
ALTER TABlE permisos ADD CONSTRAINT NN_detalle_permiso
	CHECK(detalle_permiso IS NOT NULL);	



--reglas para roles

ALTER TABlE roles ADD CONSTRAINT pk_rol 
	PRIMARY KEY(id_rol);

ALTER TABlE roles ADD CONSTRAINT NN_nombre_rol_ROLES
	CHECK(nombre_rol IS NOT NULL);


--reglas para perfiles

ALTER TABLE perfiles ADD CONSTRAINT pk_perfil
	PRIMARY KEY(id_perfil);
	
ALTER TABlE perfiles ADD CONSTRAINT NN_descripcion_perfil
	CHECK(descripcion_perfil IS NOT NULL);
	
ALTER TABLE perfiles ADD CONSTRAINT fk_id_rol_PERFILES
	FOREIGN KEY (codigo_rol) REFERENCES roles (id_rol);
	
ALTER TABLE perfiles ADD CONSTRAINT fk_id_permiso_PERFILES
	FOREIGN KEY (codigo_permiso) REFERENCES permisos (id_permiso);
	

--reglas para usuarios

ALTER TABlE usuarios ADD CONSTRAINT pk_id_usuario 
	PRIMARY KEY(id_usuario);
	
ALTER TABLE usuarios ADD CONSTRAINT NN_contrasenia_USUARIOS
	CHECK(contrasenia IS NOT NULL);

ALTER TABlE usuarios ADD CONSTRAINT NN_us_nombre_USUARIOS
	CHECK(us_nombre IS NOT NULL);
	
ALTER TABlE usuarios ADD CONSTRAINT NN_us_apellido_USUARIOS
	CHECK(us_apellido IS NOT NULL);

ALTER TABlE usuarios ADD CONSTRAINT NN_correo_usuario_USUARIOS
	CHECK(correo IS NOT NULL);
	
ALTER TABLE usuarios ADD CONSTRAINT fk_id_perfil_USUARIOS
	FOREIGN KEY (codigo_perfil) REFERENCES perfiles (id_perfil);




--reglas para presentaciones_clases

ALTER TABlE presentaciones_clases ADD CONSTRAINT pk_ID_pres_clase 
	PRIMARY KEY(id_pres_cla);

ALTER TABLE presentaciones_clases ADD CONSTRAINT fk_pre_cla_CLASES
	FOREIGN KEY (codigo_clase) REFERENCES clases (id_clase);

ALTER TABLE presentaciones_clases ADD CONSTRAINT fk_pre_cla_PRESENTACIONES
	FOREIGN KEY (codigo_pres) REFERENCES presentaciones (id_presentacion);




--reglas para asistencias

ALTER TABLE asistencias ADD CONSTRAINT pk_asistencia 
	PRIMARY KEY(dia, mes, anio, id_usuario_asistencia);

ALTER TABLE asistencias ADD CONSTRAINT fk_id_usuario_USUARIOS
	FOREIGN KEY (id_usuario_asistencia) REFERENCES usuarios (id_usuario);

ALTER TABLE asistencias ADD CONSTRAINT fk_id_clase_CLASES
	FOREIGN KEY (codigo_clase_asistencia) REFERENCES clases (id_clase);