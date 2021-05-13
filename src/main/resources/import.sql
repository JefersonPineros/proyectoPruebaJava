insert into regiones (id, nombre) values (1,'Sudamerica');
insert into regiones (id, nombre) values (2,'Centroamerica');
insert into regiones (id, nombre) values (3,'Norteamerica');
insert into regiones (id, nombre) values (4,'Europa');
insert into regiones (id, nombre) values (5,'Asia');
insert into regiones (id, nombre) values (6,'Oceania');
insert into regiones (id, nombre) values (7,'Antartida');

insert into clientes(nombre, apellidos, email, create_at, region_id) values ('Andres', 'Guzman', 'profesor@bolsadeideas.com', '2020-04-25', 5);
insert into clientes(nombre, apellidos, email, create_at, region_id) values ('Jeferson', 'Pineros', 'jeferson91pineros@gmail.com', '2020-04-25', 6);
insert into clientes(nombre, apellidos, email, create_at, region_id) values ('Sol', 'Contreras', 'Solcontreras@gmail.com', '2020-04-26', 4);
insert into clientes(nombre, apellidos, email, create_at, region_id) values ('Emilda', 'Prieto', 'emilda@gmail.com', '2020-04-26', 1);
insert into clientes(nombre, apellidos, email, create_at, region_id) values ('Ana Sofia', 'Velasquez', 'Sofia@gmail.com', '2020-04-26', 2);

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into usuarios (username, password, enabled, nombre, apellido, email)  values ('Jeferson','$2a$10$AUzbriCtUyMe2un.v4Ee/.TrB7Ys4xO3o17To5gbuZ0xCjaDFhpdK',1, 'Jeferson Armando', 'Piñeros Prieto', 'jeferson91pineros@gmail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email)  values ('Sol','$2a$10$kWZGOoFzRaWk5NigzgvbR.GhnJaVK7ZDoCAWAh1SMZilp9Bi2RLwS',1, 'Sol Angela', 'Contreras Cruz', 'key_angela@gmail.com');

insert into usuario_roles (usuario_id, role_id) values (1,1);
insert into usuario_roles (usuario_id, role_id) values (2,2);
insert into usuario_roles (usuario_id, role_id) values (2,1);