/*Práctica 1
user root
password root
port=3311
*/
CREATE DATABASE mtis;
USE mtis

CREATE TABLE codigospostales (codigo varchar(50), poblacion varchar(50), provincia varchar(50), PRIMARY KEY (codigo));
CREATE TABLE proveedor (idproveedor integer, nombre varchar(50) PRIMARY KEY (idproveedor));
CREATE TABLE proveedor (idproveedor integer, nombre varchar(50), PRIMARY KEY (idproveedor));
CREATE TABLE cliente (idcliente integer, nombre varchar(50), PRIMARY KEY (idcliente));

CREATE TABLE producto (referenciaproducto varchar(50), nombre varchar(50), precioproducto float,
stock integer, fechadisponibilidad date, idproveedor integer,
PRIMARY KEY (referenciaproducto), FOREIGN KEY (idproveedor) references proveedor(idproveedor));

CREATE TABLE presupuesto (idpresupuesto integer NOT NULL AUTO_INCREMENT, 
idcliente integer, referenciaproducto varchar(50),
cantidadproducto integer, fechadisponibilidad date,
PRIMARY KEY (idpresupuesto), FOREIGN KEY (idcliente) references cliente(idcliente),
FOREIGN KEY (referenciaproducto) references producto(referenciaproducto),
FOREIGN KEY (idcliente) references cliente(idcliente)
);

CREATE TABLE llaves (codigo integer, llave varchar(50),PRIMARY KEY (codigo));

INSERT INTO proveedor (idproveedor,nombre) VALUES (1,'Mariscos Recio');
INSERT INTO proveedor (idproveedor,nombre) VALUES (2,'Percebesa');

INSERT INTO cliente (idcliente,nombre) VALUES (1,'Héctor Sansano');
INSERT INTO cliente (idcliente,nombre) VALUES (2,'Pepe');
INSERT INTO cliente (idcliente,nombre) VALUES (3,'Juan');

INSERT INTO producto (referenciaproducto,nombre,precioproducto,stock,fechadisponibilidad,idproveedor)
VALUES ('abcdf','rueda coche',34.6,56,'2017-02-20',1);
INSERT INTO producto (referenciaproducto,nombre,precioproducto,stock,fechadisponibilidad,idproveedor)
VALUES ('zxcvb','volante',12.6,21,'2017-02-15',1);
INSERT INTO producto (referenciaproducto,nombre,precioproducto,stock,fechadisponibilidad,idproveedor)
VALUES ('llfksf','asiento',60.6,24,'2017-02-19',2);
INSERT INTO producto (referenciaproducto,nombre,precioproducto,stock,fechadisponibilidad,idproveedor)
VALUES ('fasdf','radio',100.8,10,'2018-01-01',2);

INSERT INTO codigospostales (codigo,poblacion,provincia)
VALUES ('03203','Elche','Alicante');
INSERT INTO codigospostales (codigo,poblacion,provincia)
VALUES ('03070','Alicante','Alicante');
INSERT INTO codigospostales (codigo,poblacion,provincia)
VALUES ('03839','Torrellano','Alicante');


INSERT INTO llaves (codigo,llave) VALUES (1,'asdf');

insert into presupuesto (idcliente,referenciaproducto,cantidadproducto,fechadisponibilidad) values (1,'abcdf',1,'2016-08-01');
insert into presupuesto (idcliente,referenciaproducto,cantidadproducto,fechadisponibilidad) values (2,'llfksf',2,'2017-08-23');

	

