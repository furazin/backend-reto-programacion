create table curso
(
    id integer not null,
    titulo varchar(255) not null,
    nivel varchar(255) not null,
    numHoras varchar(255) not null,
    activo varchar(255) not null,
    nombreProfesor varchar(255) not null,
    apellidosProfesor varchar(255) not null,
    primary key(id)
);