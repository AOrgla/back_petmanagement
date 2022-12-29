--liquibase formatted sql
--changeset author:01

INSERT INTO public."user" (id, username, password) VALUES (DEFAULT, 'John', '123');
INSERT INTO public."user" (id, username, password) VALUES (DEFAULT, 'Mihkel', '123');
INSERT INTO public."user" (id, username, password) VALUES (DEFAULT, 'Janis', '123');

INSERT INTO public.contact (id, user_id, firstname, lastname, email) VALUES (DEFAULT, 1, 'John', 'Wick', 'jw@ee.ee');
INSERT INTO public.contact (id, user_id, firstname, lastname, email) VALUES (DEFAULT, 2, 'Mihkel', 'Kitt', 'kitt@kitt.ee');
INSERT INTO public.contact (id, user_id, firstname, lastname, email) VALUES (DEFAULT, 3, 'Janis', 'Aas', 'ja@aj.ee');

INSERT INTO public.type (id, type) VALUES (DEFAULT, 'Cat');
INSERT INTO public.type (id, type) VALUES (DEFAULT, 'Dog');
INSERT INTO public.type (id, type) VALUES (DEFAULT, 'Horse');
INSERT INTO public.type (id, type) VALUES (DEFAULT, 'Rabbit');
INSERT INTO public.type (id, type) VALUES (DEFAULT, 'Parrot');

INSERT INTO public.color (id, color) VALUES (DEFAULT, 'Black');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'White');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'Brown');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'Yellow');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'Blue');

INSERT INTO public.country (id, country) VALUES (DEFAULT, 'Estonia');
INSERT INTO public.country (id, country) VALUES (DEFAULT, 'Latvia');
INSERT INTO public.country (id, country) VALUES (DEFAULT, 'Lithuania');
INSERT INTO public.country (id, country) VALUES (DEFAULT, 'Finland');
INSERT INTO public.country (id, country) VALUES (DEFAULT, 'Sweden');
INSERT INTO public.country (id, country) VALUES (DEFAULT, 'Norway');

INSERT INTO public.pet (id, user_id, color_id, type_id, country_id, name, code) VALUES (DEFAULT, 1, 1, 1, 1, 'Mustikas', 202211151535);
INSERT INTO public.pet (id, user_id, color_id, type_id, country_id, name, code) VALUES (DEFAULT, 1, 3, 2, 2, 'Roy', 202211151536);
INSERT INTO public.pet (id, user_id, color_id, type_id, country_id, name, code) VALUES (DEFAULT, 1, 2, 3, 6, 'Charles', 202211151537);

