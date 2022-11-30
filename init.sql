create database springwebflux;
use springwebflux;
CREATE TABLE articles ( id SERIAL PRIMARY KEY, title VARCHAR(100) NOT NULL, author VARCHAR(100) NOT NULL, content VARCHAR(255));