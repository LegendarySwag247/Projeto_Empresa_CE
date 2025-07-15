DROP DATABASE IF EXISTS cedb;
CREATE DATABASE cedb;
USE cedb;

CREATE TABLE usuario (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(256),
  cpf VARCHAR(14),
  login VARCHAR(25),
  senha VARCHAR(32),
  tipo VARCHAR(13),
  email VARCHAR(256),
  endereco MEDIUMTEXT,
  image BLOB
);

CREATE TABLE modelo (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  usuario_id INT NOT NULL,
  mensagem MEDIUMTEXT,
  preco CHAR(9),
  pagamento CHAR(12),
  arquivo MEDIUMBLOB,
  tipo CHAR(5),
  KEY fk_modelo (usuario_id),
  CONSTRAINT fk_modelo FOREIGN KEY (usuario_id) REFERENCES usuario (id)
);

INSERT INTO usuario VALUES
 (1, "Davi", "146.158.077-31", "LegendarySwag", MD5('311005'), "Funcionario","davi.vinade@gmail.com", "Avenida Rua Ernesto Pereira 720 401", null),
 (2, "Enzo", "146.158.097-86", "EnzoGostoso", MD5('060304'), "Funcionario","enzo.vinade@gmail.com", "Avenida Rua Ernesto Pereira 720 401", null);
 
-- SELECT * FROM usuario;
-- SELECT * FROM podcast;