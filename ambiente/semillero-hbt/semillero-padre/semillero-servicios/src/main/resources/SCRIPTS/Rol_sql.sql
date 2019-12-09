-- Creacion de la tabla Rol
create table rol (
  rol_id number(3) not null,
  rol_nombre varchar2(50) not null,
  rol_estado varchar2(50 char) not null,
  constraint "PK_rol" PRIMARY KEY (rol_id),
  constraint "rol_estado_CHK" check (rol_estado IN('ACTIVO','INACTIVO')),
  constraint "rol_nombre_UN" unique (rol_nombre)
);

--Creacion de la secuencia para el incremento del id
create sequence "SEC_ROL" minvalue 1 start with 1 increment by 2;

--Insertar datos en la tabla Rol
insert into rol (ROL_ID,ROL_NOMBRE,ROL_ESTADO)
 values (SEC_ROL.nextval, 'Villano', 'ACTIVO');

--Ver datos contenidos en la tabla
select * from rol;


