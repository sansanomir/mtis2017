/*Práctica 1
user root
password root
port=3311
*/
CREATE DATABASE mtis;
USE mtis
CREATE TABLE codigospostales (codigo char(50), poblacion char(50), provincia(50) );
/* Error de SQL (1064): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(50) )' at line 1 */
/* Filas afectadas: 0  Filas encontradas: 0  Advertencias: 0  Duración para 0 of 1 consulta: 0,000 sec. */
CREATE TABLE codigospostales (codigo varchar(50), poblacion varchar(50), provincia varchar(50), PRIMARY KEY (codigo));
/* Filas afectadas: 0  Filas encontradas: 0  Advertencias: 0  Duración para 2 consultas: 0,063 sec. */
CREATE TABLE proveedor (idproveedor integer, nombre varchar(50) PRIMARY KEY (idproveedor));
/* Error de SQL (1064): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(idproveedor))' at line 1 */
/* Filas afectadas: 0  Filas encontradas: 0  Advertencias: 0  Duración para 0 of 1 consulta: 0,000 sec. */
CREATE TABLE proveedor (idproveedor integer, nombre varchar(50), PRIMARY KEY (idproveedor));
/* Filas afectadas: 0  Filas encontradas: 0  Advertencias: 0  Duración para 1 consulta: 0,125 sec. */
CREATE TABLE cliente (idcliente integer, nombre varchar(50), PRIMARY KEY (idcliente));
/* Filas afectadas: 0  Filas encontradas: 0  Advertencias: 0  Duración para 1 consulta: 0,328 sec. */
CREATE TABLE producto (referenciaproducto varchar(50), nombre varchar(50), precioproducto float,
stock integer, fechadisponibilidad date, idproveedor integer,
PRIMARY KEY (referenciaproducto), FOREIGN KEY (idproveedor) references proveedor(idproveedor));
/* Filas afectadas: 0  Filas encontradas: 0  Advertencias: 0  Duración para 1 consulta: 0,141 sec. */
CREATE TABLE presupuesto (idpresupuesto integer NOT NULL AUTO_INCREMENT, 
idcliente integer, referenciaproducto varchar(50),
cantidadproducto integer, fechadisponibilidad date,
PRIMARY KEY (idpresupuesto), FOREIGN KEY (idcliente) references cliente(idcliente),
FOREIGN KEY (referenciaproducto) references producto(referenciaproducto),
FOREIGN KEY (idcliente) references cliente(idcliente)
);

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

