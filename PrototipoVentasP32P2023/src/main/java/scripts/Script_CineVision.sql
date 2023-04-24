CREATE SCHEMA IF NOT EXISTS `PrototipoP32P2023` DEFAULT CHARACTER SET utf8 ;
USE `PrototipoP32P2023` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(45) NULL,
  `Password` VARCHAR(45) NULL,
  estado tinyint default 1,
  PRIMARY KEY (`idUsuarios`)
  )
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clientes` (
  `idClientes` INT NOT NULL AUTO_INCREMENT,
  `clinombre` VARCHAR(45) NULL,
  `clistatus` VARCHAR(45) NULL,
  PRIMARY KEY (`idClientes`))
ENGINE = InnoDB;

