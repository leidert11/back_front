drop database if exists tienda;
create database if not exists tienda;
use tienda;

CREATE TABLE Productos (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    descripcion VARCHAR(255),
    precio DECIMAL(10, 2),
    cantidad_en_stock INT,
    PRIMARY KEY (id)
);

CREATE TABLE Clientes (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    email VARCHAR(100),
    contraseña VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE Transacciones (
    id INT AUTO_INCREMENT,
    id_cliente INT,
    id_producto INT,
    cantidad INT,
    total DECIMAL(10, 2),
    fecha TIMESTAMP,
    estado VARCHAR(50),
    PRIMARY KEY (id),
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id),
    FOREIGN KEY (id_producto) REFERENCES Productos(id)
);

INSERT INTO productos (cantidad_en_stock, descripcion, nombre, precio) VALUES
(50, 'Zapatos deportivos Nike Air Max 270', 'NikeAirMax270', 129.99),
(100, 'Camisa de algodon manga larga color blanco', 'CamisaBlanca', 39.99),
(30, 'Pantalones vaqueros ajustados 511', 'Levis511', 59.99),
(20, 'Zapatos formales de cuero negro', 'ZapatosNegros', 89.99),
(50, 'Camisa de lino manga corta a rayas', 'CamisaRayas', 29.99),
(80, 'Pantalones chinos de color caqui', 'PantalonesCaqui', 44.99),
(10, 'Zapatillas de deporte Adidas Superstar', 'AdidasSuperstar', 89.99),
(40, 'Camisa de vestir manga larga color azul', 'CamisaAzul', 49.99),
(60, 'Pantalones de mezclilla rectos', 'PantalonesRectos', 39.99),
(25, 'Botas de cuero marron', 'BotasMarron', 79.99);

