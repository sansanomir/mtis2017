-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.0.67-community-nt - MySQL Community Edition (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para almacen
CREATE DATABASE IF NOT EXISTS `almacen` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `almacen`;

-- Volcando estructura para tabla almacen.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `referenciaProducto` varchar(50) NOT NULL default '',
  `nombre` varchar(50) default NULL,
  `descripcion` varchar(50) default NULL,
  `precio` float default NULL,
  `stock` int(11) default NULL,
  PRIMARY KEY  (`referenciaProducto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla almacen.producto: 4 rows
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`referenciaProducto`, `nombre`, `descripcion`, `precio`, `stock`) VALUES
	('abc', 'Lenovo Thinkpad', 'Macnifico portátil', 999.45, 1),
	('dfg', 'Teclado', 'Para gamming', 22.22, 193),
	('hij', 'Mouse logitech', 'Ratón económico', 7.56, 18),
	('lmn', 'Pantalla asus', 'Pantalla 19', 100.56, 2);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;


-- Volcando estructura de base de datos para proveedor1
CREATE DATABASE IF NOT EXISTS `proveedor1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `proveedor1`;

-- Volcando estructura para tabla proveedor1.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `referenciaProducto` varchar(50) NOT NULL default '',
  `nombre` varchar(50) default NULL,
  `descripcion` varchar(50) default NULL,
  `precio` float default NULL,
  `stock` int(11) default NULL,
  PRIMARY KEY  (`referenciaProducto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proveedor1.producto: 2 rows
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`referenciaProducto`, `nombre`, `descripcion`, `precio`, `stock`) VALUES
	('abc', 'Lenovo Thinkpad', 'Macnifico portátil', 500.04, 1),
	('dfg', 'Teclado', 'Para gamming', 10.2, 228),
	('xyz', 'Apple pen', '..', 21, 19);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;


-- Volcando estructura de base de datos para proveedor2
CREATE DATABASE IF NOT EXISTS `proveedor2` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `proveedor2`;

-- Volcando estructura para tabla proveedor2.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `referenciaProducto` varchar(50) NOT NULL default '',
  `nombre` varchar(50) default NULL,
  `descripcion` varchar(50) default NULL,
  `precio` float default NULL,
  `stock` int(11) default NULL,
  PRIMARY KEY  (`referenciaProducto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proveedor2.producto: 3 rows
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`referenciaProducto`, `nombre`, `descripcion`, `precio`, `stock`) VALUES
	('abc', 'Lenovo Thinkpad', 'Macnifico portátil', 200.04, 2),
	('lmn', 'Pantalla asus', 'Pantalla 19', 70.45, 23),
	('hij', 'Mouse logitech', 'Ratón económico', 6.06, 23),
	('opq', 'Torre Lenovo', '..', 600, 18),
	('bbb', 'Torre Lenovo', '..', 600, 17);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;


-- Volcando estructura de base de datos para proveedor3
CREATE DATABASE IF NOT EXISTS `proveedor3` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `proveedor3`;

-- Volcando estructura para tabla proveedor3.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `referenciaProducto` varchar(50) NOT NULL default '',
  `nombre` varchar(50) default NULL,
  `descripcion` varchar(50) default NULL,
  `precio` float default NULL,
  `stock` int(11) default NULL,
  PRIMARY KEY  (`referenciaProducto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proveedor3.producto: 2 rows
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`referenciaProducto`, `nombre`, `descripcion`, `precio`, `stock`) VALUES
	('hij', 'Mouse logitech', 'Ratón económico', 4.06, 1),
	('lmn', 'Pantalla asus', 'Pantalla 19', 70.45, 20),
	('opq', 'Torre Lenovo', 'Macnifica torre', 700, 11);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
