CREATE DATABASE banco
GO
USE banco
GO
CREATE TABLE conta_bancaria(
nome_cliente			VARCHAR(100)		NOT NULL,
num_conta				INT					NOT NULL,
saldo					FLOAT				NOT NULL
PRIMARY KEY(num_conta)
)
GO
CREATE TABLE conta_poupanca(
num_conta				INT					NOT NULL,
dia_rendimento			INT					NOT NULL
PRIMARY KEY(num_conta)
FOREIGN KEY(num_conta) REFERENCES conta_bancaria(num_conta)
)
GO
CREATE TABLE conta_especial(
num_conta				INT					NOT NULL,
limite					FLOAT				NOT NULL
PRIMARY KEY(num_conta)
FOREIGN KEY(num_conta) REFERENCES conta_bancaria(num_conta)
)
