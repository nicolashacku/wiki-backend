TRUNCATE TABLE estudiantes RESTART IDENTITY;

INSERT INTO estudiantes
(nombre, apellido, email, edad, semestre, image_url, descripcion)
VALUES
('Jhony', 'Martinez', 'jonathanmartinez@javeriana.edu.co', 20, 6, 'jhony.jpg',
 'Estudiante apasionado por la tecnología y ciberseguridad.');

INSERT INTO estudiantes
(nombre, apellido, email, edad, semestre, image_url, descripcion)
VALUES
('Nicolas', 'Jimenez', 'jimenez_nicolase@javeriana.edu.co', 20, 6, 'nicolas.png',
 'Amante de la programación y hacer apps web.');

INSERT INTO estudiantes
(nombre, apellido, email, edad, semestre, image_url, descripcion)
VALUES
('Xamuel', 'Perez', 'xamuel_perez@example.com', 19, 6, 'xamu.png',
 'Apasionado por la inteligencia artificial.');

INSERT INTO estudiantes
(nombre, apellido, email, edad, semestre, image_url, descripcion)
VALUES
('Juandi', 'Funeme', 'juan.funeme@javeriana.edu.co', 19, 6, 'juandi.png',
 'Interesado en el desarrollo de videojuegos.');