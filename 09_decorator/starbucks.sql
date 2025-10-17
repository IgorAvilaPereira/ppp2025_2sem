DROP DATABASE IF EXISTS starbucks;

CREATE DATABASE starbucks;

\c starbucks;

CREATE TABLE customers (
    id serial primary key,
    name text not null
);

CREATE TABLE orders (
    id serial primary key,
    details text,
    created_at timestamp default current_timestamp,
    cost numeric(10,2),
    customer_id integer references customers (id)
);


