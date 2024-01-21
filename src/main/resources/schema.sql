-- CREATE TABLE IF NOT EXISTS recipes (
--     id          VARCHAR(60)   PRIMARY KEY ,
--     name        VARCHAR       NOT NULL ,
--     imageLink   VARCHAR       NULLABLE ,
-- );
CREATE TABLE IF NOT EXISTS recipes (
    id       VARCHAR(60)  PRIMARY KEY,
    name     VARCHAR      NOT NULL,
    imageLink       VARCHAR
);
-- DROP TABLE recipes;
