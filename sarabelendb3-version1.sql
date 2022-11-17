-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2022 a las 15:04:51
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sarabelendb3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asociados`
--

CREATE TABLE `asociados` (
  `id_asociado` bigint(20) NOT NULL,
  `nombre_asociado` varchar(255) DEFAULT NULL,
  `direc_asociado` varchar(255) DEFAULT NULL,
  `est_asociado` varchar(255) DEFAULT NULL,
  `telf_asociado` varchar(255) DEFAULT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asociados`
--

INSERT INTO `asociados` (`id_asociado`, `nombre_asociado`, `direc_asociado`, `est_asociado`, `telf_asociado`, `estado`) VALUES
(1, 'Donofrio', 'AvLaluz423 #23', 'ACTIVO', '993748374', b'1'),
(2, 'Libreria Cerron', 'sdfdsfdsfsf', 'ACTIVO', '123456789', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles`
--

CREATE TABLE `detalles` (
  `id` int(11) NOT NULL,
  `cantidad` double NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `total` double NOT NULL,
  `orden_id` int(11) DEFAULT NULL,
  `producto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordenes`
--

CREATE TABLE `ordenes` (
  `id` int(11) NOT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_recibida` datetime DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prendas`
--

CREATE TABLE `prendas` (
  `id_prenda` bigint(20) NOT NULL,
  `categoria_prenda` varchar(255) DEFAULT NULL,
  `costo_prenda` int(11) NOT NULL,
  `est_prenda` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nombre_prenda` varchar(255) DEFAULT NULL,
  `stock_prenda` int(11) NOT NULL,
  `talla_prenda` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_prod` bigint(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_prod`, `cantidad`, `descripcion`, `imagen`, `nombre`, `precio`, `estado`) VALUES
(1, 10, ' ejemplo', 'rosa-amarilla-imágenes-bonitas-fotos-gratis-muy-lindas-para-compartir-en-facebook-.jpg', 'Vestido Primavera', 50, b'1'),
(2, 7, ' example', 'cursed.gif', 'Vestido Otoño', 153, b'1'),
(3, 0, ' example', 'tumblr_a81fa312b085f4e4790b4fe3bf7eed63_28d40109_500.gif', 'Vestido Verano', 123, b'1'),
(4, 10, 'Botarga Barney Talla adulto color Morado', 'barneybailando.jpg', 'Botarga Barney', 103, b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosf`
--

CREATE TABLE `productosf` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id_rol`, `nombre`, `estado`) VALUES
(1, 'User', b'0'),
(2, 'Admin', b'0'),
(3, 'Customer', b'1'),
(7, 'employee', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` bigint(20) NOT NULL,
  `ape_usuario` varchar(255) DEFAULT NULL,
  `dni_usuario` varchar(255) DEFAULT NULL,
  `email_usuario` varchar(255) DEFAULT NULL,
  `est_usuario` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nom_usuario` varchar(255) DEFAULT NULL,
  `pass_usuario` varchar(255) DEFAULT NULL,
  `telef_usuario` varchar(255) DEFAULT NULL,
  `rol_usuario` bigint(20) DEFAULT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `ape_usuario`, `dni_usuario`, `email_usuario`, `est_usuario`, `foto`, `nom_usuario`, `pass_usuario`, `telef_usuario`, `rol_usuario`, `estado`) VALUES
(1, 'Carrasco', '75665179', 'anjocal844@gmail.com', 'ACTIVO', 'AngelC614.jpg', 'Angel', '$2a$10$FS8CNYuDl4n2/nRkxuj54.0yxd3gpPIpkHid3qOctMOtRMH7u8mwS', '937399029', 2, b'1'),
(3, 'Manayay', '12345678', 'nestormanayay@hotmail.com', 'ACTIVO', 'default.jpg', 'Daniel', '$2a$10$FS8CNYuDl4n2/nRkxuj54.0yxd3gpPIpkHid3qOctMOtRMH7u8mwS', '123456789', 1, b'1'),
(4, 'pizcolla', '42142412412', 'pruebaxd@hotmail.com', 'ACTIVO', 'default.jpg', 'Example', '$2a$10$8KWRaYAIOQgLF081WJuK4uSa2QmYOTo7p9KZMcHOtHH5tj9P6HGD2', '1421414214', 1, b'0'),
(5, 'Pizcolla', '75666333', 'emanuel_habla@hotmail.com', NULL, '1.png', 'Angel', '34567uythrfgefwagwh4w5324rew', '567876542', 1, b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_rol`
--

CREATE TABLE `usuario_rol` (
  `id_usuario` bigint(20) NOT NULL,
  `id_rol` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `producto` int(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `usuario` int(50) NOT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `producto`, `cantidad`, `fecha`, `usuario`, `estado`) VALUES
(1, 1, 3, '2015-09-08', 1, b'1'),
(2, 2, 1, '2015-10-22', 5, b'0'),
(3, 4, 2, '2019-12-25', 4, b'1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asociados`
--
ALTER TABLE `asociados`
  ADD PRIMARY KEY (`id_asociado`);

--
-- Indices de la tabla `detalles`
--
ALTER TABLE `detalles`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdurdo71oa161lmmal7oeaor74` (`orden_id`),
  ADD KEY `FKio4oyl8qt5jclekxp7bwws2iy` (`producto_id`);

--
-- Indices de la tabla `ordenes`
--
ALTER TABLE `ordenes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `prendas`
--
ALTER TABLE `prendas`
  ADD PRIMARY KEY (`id_prenda`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_prod`);

--
-- Indices de la tabla `productosf`
--
ALTER TABLE `productosf`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `rol_usuario` (`rol_usuario`);

--
-- Indices de la tabla `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD KEY `FKkxcv7htfnm9x1wkofnud0ewql` (`id_rol`),
  ADD KEY `FK3ftpt75ebughsiy5g03b11akt` (`id_usuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asociados`
--
ALTER TABLE `asociados`
  MODIFY `id_asociado` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detalles`
--
ALTER TABLE `detalles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ordenes`
--
ALTER TABLE `ordenes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prendas`
--
ALTER TABLE `prendas`
  MODIFY `id_prenda` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_prod` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `productosf`
--
ALTER TABLE `productosf`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id_rol` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalles`
--
ALTER TABLE `detalles`
  ADD CONSTRAINT `FKdurdo71oa161lmmal7oeaor74` FOREIGN KEY (`orden_id`) REFERENCES `ordenes` (`id`),
  ADD CONSTRAINT `FKio4oyl8qt5jclekxp7bwws2iy` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id_prod`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`rol_usuario`) REFERENCES `rol` (`id_rol`);

--
-- Filtros para la tabla `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK3ftpt75ebughsiy5g03b11akt` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  ADD CONSTRAINT `FKkxcv7htfnm9x1wkofnud0ewql` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id_rol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
