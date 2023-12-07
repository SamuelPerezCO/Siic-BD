
--creacion de la vista de los presentaciones 
--utilizadas en las clases

CREATE VIEW vista_presentaciones_en_clase AS
SELECT 
    pc.id_pres_cla,
    c.clase_descripcion,
    p.presen_descripcion
FROM
    presentaciones_clases pc
JOIN
    clases c ON pc.codigo_clase = c.id_clase
JOIN
    presentaciones p ON pc.codigo_pres = p.id_presentacion;
	
--Su consulta 

SELECT * from vista_presentaciones_en_clase;



--Vista para ver los estudiantes que asisten
--a las a cuales clases

CREATE view vista_estudiante_en_clase AS
	SELECT
		cl.clase_descripcion,
		u.us_nombre,
		u.us_apellido,
		u.correo
	FROM
		asistencias
	JOIN
		clases cl ON codigo_clase_asistencia = cl.id_clase
	JOIN
		usuarios u ON id_usuario_asistencia = u.id_usuario;
		
--Su consulta

SELECT * from vista_estudiante_en_clase;
		