
-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-12-19 16:12:39.111

-- tables
-- Table: color
CREATE TABLE color (
                       id serial  NOT NULL,
                       color varchar(255)  NOT NULL,
                       CONSTRAINT color_pk PRIMARY KEY (id)
);

-- Table: contact
CREATE TABLE contact (
                         id serial  NOT NULL,
                         user_id int  NOT NULL,
                         firstname varchar(255)  NOT NULL,
                         lastname varchar(255)  NOT NULL,
                         email varchar(255)  NOT NULL,
                         CONSTRAINT contact_ak_1 UNIQUE (user_id) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                         CONSTRAINT contact_pk PRIMARY KEY (id)
);

-- Table: country
CREATE TABLE country (
                         id serial  NOT NULL,
                         country varchar(255)  NOT NULL,
                         CONSTRAINT country_pk PRIMARY KEY (id)
);

-- Table: pet
CREATE TABLE pet (
                     id serial  NOT NULL,
                     user_id int  NOT NULL,
                     color_id int  NOT NULL,
                     type_id int  NOT NULL,
                     country_id int  NOT NULL,
                     name varchar(255)  NOT NULL,
                     code bigint  NOT NULL,
                     CONSTRAINT pet_ak_1 UNIQUE (code) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                     CONSTRAINT pet_pk PRIMARY KEY (id)
);

-- Table: type
CREATE TABLE type (
                      id serial  NOT NULL,
                      type varchar(255)  NOT NULL,
                      CONSTRAINT type_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        username varchar(255)  NOT NULL,
                        password varchar(255)  NOT NULL,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: contact_user (table: contact)
ALTER TABLE contact ADD CONSTRAINT contact_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: pet_color (table: pet)
ALTER TABLE pet ADD CONSTRAINT pet_color
    FOREIGN KEY (color_id)
        REFERENCES color (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: pet_country (table: pet)
ALTER TABLE pet ADD CONSTRAINT pet_country
    FOREIGN KEY (country_id)
        REFERENCES country (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: pet_type (table: pet)
ALTER TABLE pet ADD CONSTRAINT pet_type
    FOREIGN KEY (type_id)
        REFERENCES type (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: pet_user (table: pet)
ALTER TABLE pet ADD CONSTRAINT pet_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.