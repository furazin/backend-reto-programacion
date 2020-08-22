create table profesor
(
    id integer auto_increment,
    nombre varchar(255) not null,
    apellidos varchar(255) not null,
    primary key(id)
);
create table curso
(
    id integer auto_increment,
    titulo varchar(255) not null,
    nivel varchar(255) not null,
    numHoras varchar(255) not null,
    activo boolean not null,
    profesor_id integer,
    primary key(id),
    constraint fk_curso_profesor foreign key (profesor_id)
    references profesor(id)
);