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


-- Volcando estructura de base de datos para mtis
CREATE DATABASE IF NOT EXISTS `mtis` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mtis`;

-- Volcando estructura para tabla mtis.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idcliente` int(11) NOT NULL default '0',
  `nombre` varchar(50) default NULL,
  PRIMARY KEY  (`idcliente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla mtis.cliente: 3 rows
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`idcliente`, `nombre`) VALUES
	(1, 'Héctor Sansano'),
	(2, 'Pepe'),
	(3, 'Juan');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla mtis.codigospostales
CREATE TABLE IF NOT EXISTS `codigospostales` (
  `codigo` varchar(50) NOT NULL default '',
  `poblacion` varchar(50) default NULL,
  `provincia` varchar(50) default NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla mtis.codigospostales: 3 rows
/*!40000 ALTER TABLE `codigospostales` DISABLE KEYS */;
INSERT INTO `codigospostales` (`codigo`, `poblacion`, `provincia`) VALUES
	('03203', 'Elche', 'Alicante'),
	('03070', 'Alicante', 'Alicante'),
	('03839', 'Torrellano', 'Alicante');
/*!40000 ALTER TABLE `codigospostales` ENABLE KEYS */;

-- Volcando estructura para tabla mtis.llaves
CREATE TABLE IF NOT EXISTS `llaves` (
  `codigo` int(11) NOT NULL default '0',
  `llave` varchar(50) default NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla mtis.llaves: 1 rows
/*!40000 ALTER TABLE `llaves` DISABLE KEYS */;
INSERT INTO `llaves` (`codigo`, `llave`) VALUES
	(1, 'asdf');
/*!40000 ALTER TABLE `llaves` ENABLE KEYS */;

-- Volcando estructura para tabla mtis.presupuesto
CREATE TABLE IF NOT EXISTS `presupuesto` (
  `idpresupuesto` int(11) NOT NULL auto_increment,
  `idcliente` int(11) default NULL,
  `referenciaproducto` varchar(50) default NULL,
  `cantidadproducto` int(11) default NULL,
  `fechadisponibilidad` date default NULL,
  PRIMARY KEY  (`idpresupuesto`),
  KEY `referenciaproducto` (`referenciaproducto`),
  KEY `idcliente` (`idcliente`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla mtis.presupuesto: 11 rows
/*!40000 ALTER TABLE `presupuesto` DISABLE KEYS */;
INSERT INTO `presupuesto` (`idpresupuesto`, `idcliente`, `referenciaproducto`, `cantidadproducto`, `fechadisponibilidad`) VALUES
	(1, 1, 'abcdf', 1, NULL),
	(2, 2, 'llfksf', 2, NULL),
	(3, 2, 'llfksf', 4, NULL),
	(10, 555, 'abcdf', 2, NULL),
	(11, 2, 'abcdf', 1, '2017-05-04'),
	(12, 1, 'abcdf', 12, '2017-01-31'),
	(13, 3, 'abcdf', 4, '2017-01-31'),
	(14, 1, 'abcdf', 1, '0000-00-00'),
	(15, 1, 'abcdf', 1, '2016-08-01'),
	(16, 1, 'abcdf', 1, '2016-08-01'),
	(17, 1, 'abcdf', 1, '2017-06-01');
/*!40000 ALTER TABLE `presupuesto` ENABLE KEYS */;

-- Volcando estructura para tabla mtis.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `referenciaproducto` varchar(50) NOT NULL default '',
  `nombre` varchar(50) default NULL,
  `precioproducto` float default NULL,
  `stock` int(11) default NULL,
  `fechadisponibilidad` date default NULL,
  `idproveedor` int(11) default NULL,
  PRIMARY KEY  (`referenciaproducto`),
  KEY `idproveedor` (`idproveedor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla mtis.producto: 4 rows
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`referenciaproducto`, `nombre`, `precioproducto`, `stock`, `fechadisponibilidad`, `idproveedor`) VALUES
	('abcdf', 'rueda coche', 34.6, 56, '2017-02-20', 1),
	('zxcvb', 'volante', 12.6, 21, '2017-02-15', 1),
	('llfksf', 'asiento', 60.6, 24, '2017-02-19', 2),
	('fasdf', 'radio', 100.8, 10, '2018-01-01', 2);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

-- Volcando estructura para tabla mtis.proveedor
CREATE TABLE IF NOT EXISTS `proveedor` (
  `idproveedor` int(11) NOT NULL default '0',
  `nombre` varchar(50) default NULL,
  PRIMARY KEY  (`idproveedor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla mtis.proveedor: 2 rows
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` (`idproveedor`, `nombre`) VALUES
	(1, 'Mariscos Recio'),
	(2, 'Percebesa');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
