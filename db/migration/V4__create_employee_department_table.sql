CREATE TABLE IF NOT EXISTS employee (
    id serial PRIMARY KEY,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    address varchar(50),
    age integer,
    salary bigint,
    title varchar(20),
    department_id integer
    );

CREATE TABLE IF NOT EXISTS department (
    id serial PRIMARY KEY,
    department_name varchar(50),
    location varchar(50)
)