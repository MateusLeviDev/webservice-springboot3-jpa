CREATE TABLE IF NOT EXISTS tax (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(255),
);

INSERT INTO tax (name, description)
VALUES ('Tax name', 'Tax description');