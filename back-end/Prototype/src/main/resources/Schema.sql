CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Student table schema
CREATE TABLE IF NOT EXISTS student (
    matric VARCHAR(10) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    faculty VARCHAR(50) NOT NULL,
    year INT NOT NULL,
    profile_photo BYTEA NOT NULL
    );

-- Citation schema
CREATE TABLE IF NOT EXISTS citation (
                                        id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    matric VARCHAR(10) REFERENCES student(matric),
    citation_type VARCHAR(50) NOT NULL,
    citation_time TIME NOT NULL,
    address VARCHAR(255) NOT NULL,
    violation_photo BYTEA NOT NULL
    );

-- Car registration table
CREATE TABLE IF NOT EXISTS car_registration (
    car_plate VARCHAR(255) PRIMARY KEY NOT NULL,
    matric VARCHAR(10) REFERENCES student(matric)
    );


-- Student table schema
CREATE TABLE IF NOT EXISTS car_citations (
    car_plate VARCHAR(255) NOT NULL,
    matric VARCHAR(10) REFERENCES student(matric),
    registered BOOLEAN GENERATED ALWAYS AS (matric IS NOT NULL) STORED
    );




