CREATE TABLE IF NOT EXISTS teams (
                                     id integer primary key,
                                     name varchar (100)
);

CREATE TABLE IF NOT EXISTS players (
                                       id integer primary key,
                                       firstName varchar (100),
                                       lastName varchar (100),
                                       birthDate varchar (100)
);
