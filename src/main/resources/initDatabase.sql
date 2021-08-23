CREATE TABLE extvaldb.external_value
(
    id     INT         NOT NULL AUTO_INCREMENT,
    value  VARCHAR(45) NULL,
    source VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);