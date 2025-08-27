DROP DATABASE IF EXISTS duck_simulator;
CREATE DATABASE duck_simulator;
\c duck_simulator; 
CREATE TABLE users (id serial primary key, name text, email text);
INSERT INTO users (name, email) VALUES('Igor', 'igor.pereira@riogrande.ifrs.edu.br');
INSERT INTO users (name, email) VALUES('Betito', 'betito@gmail.com');
INSERT INTO users (name, email) VALUES('Fernando', 'fernando@mikrus.com.br');
INSERT INTO users (name, email) VALUES('Marina', 'marina@bol.com');
