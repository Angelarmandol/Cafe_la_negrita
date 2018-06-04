-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-06-2018 a las 19:33:45
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `negrita`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `tarjeta` int(11) NOT NULL,
  `clave` longtext NOT NULL,
  `nombre` text NOT NULL,
  `apellido` text NOT NULL,
  `compra` int(10) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `fecha` date NOT NULL,
  `productos_idProductos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `ingredientes` mediumtext NOT NULL,
  `cantidad` int(11) NOT NULL,
  `campo1` varchar(45) NOT NULL,
  `id_Ingrediente` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`ingredientes`, `cantidad`, `campo1`, `id_Ingrediente`) VALUES
('Cafe', 41, '100', 'sku00001'),
('leche entera', 1200, '100', 'sku00002'),
('cacao en polvo', 100, '100', 'sku00003'),
('azucar', 100, '100', 'sku00004'),
('cafe chai', 100, '100', 'sku00005'),
('cafe chai vainilla', 100, '176', 'sku00006'),
('oreo', 100, '69', 'sku00007'),
('sirope caramelo', 100, '369', 'sku00008'),
('hielo', 100, '45', 'sku00009'),
('agua', 100, '485', 'sku00010'),
('Cafe cColombiano', 100, '100', 'sku00011'),
('test', 200, '200', 'sku00012'),
('chai', 200, '200', 'sku00013'),
('', 12000, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_Producto` varchar(25) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `ingredientes` varchar(256) NOT NULL,
  `preparacion` varchar(256) NOT NULL,
  `precioPesos` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_Producto`, `nombre`, `ingredientes`, `preparacion`, `precioPesos`) VALUES
('sku00014', 'Expresso', '15 café', 'rapida', 25),
('sku00015', 'Americano', '15 café, 100 ml de agua, Café con leche, 15 g café, 120 ml de leche entera,', 'rapida', 30),
('sku00016', 'Cafe Moka', '15 café\r\n120ml leche\r\n60g cacao polvo\r\n15g agua caliente\r\n35g azúcar\r\n', 'rapida', 35),
('sku00017', 'Café latte', '170g leche\r\n30 g café\r\n35g azúcar\r\n', 'rapida', 33),
('sku00018', 'Chai spiced\r\n', '170g leche\r\n30 g café\r\n35g azúcar\r\n', 'lenta', 57),
('sku00019', 'Chai Vainilla\r\n', '35g Chai vainilla\r\n30g Café\r\n35g Azúcar\r\n', 'rapida', 63),
('sku00020', 'Frappe Latte ', '30g Café\r\n240g hielo\r\n40g azucar\r\n125ml leche\r\n ', 'lenta', 55),
('sku00021', 'Frappe Moka ', 'Frappe Latte\r\n30g Café\r\n240g hielo\r\n60g cacao polvo\r\n40g azucar\r\n125ml leche\r\n', 'lenta', 60),
('sku00022', 'Frappe Vainilla ', '\r\n30g café vainilla\r\n240g hielo\r\n240g leche\r\n', 'normal', 72),
('sku00023', 'Frappe Caramelo', '?	Frappe Caramelo\r\n30g café \r\n150ml sirope de caramelo\r\n240g hielo\r\n240g leche\r\n40g azucar\r\nFrappe oreo\r\n30g café \r\n240g hielo\r\n240g leche\r\n2 galletas oreo\r\n', 'lenta', 85);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` text NOT NULL,
  `pass` char(10) NOT NULL,
  `tipo` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `pass`, `tipo`) VALUES
(1, 'Angel', 'muu295t', 1),
(2, 'Cajero', 'pass', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idFactura`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD KEY `id_Ingrediente` (`id_Ingrediente`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_Producto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
