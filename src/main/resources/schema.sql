create table profesor
(
    id integer not null,
    nombre varchar(255) not null,
    apellidos varchar(255) not null,
    primary key(id)
);
create table curso
(
    id integer not null,
    titulo varchar(255) not null,
    nivel varchar(255) not null,
    numHoras varchar(255) not null,
    activo varchar(255) not null,
    profesor_id integer,
    primary key(id),
    constraint fk_curso_profesor foreign key (profesor_id)
    references profesor(id)
);