insert into user_table (alias, email, password, role) values 
('user', 'test@csumb.edu', '$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue','USER'),
('admin', 'admin@csumb.edu', '$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW' , 'ADMIN');

insert into likes_table(id, drinkId, drinkStr, drinkImg) values
(2, 11012, 'Alabama Slammer', 'https://www.thecocktaildb.com/images/media/drink/jntghf1606771886.jpg'),
(2, 17035, 'Buccaneer', 'https://www.thecocktaildb.com/images/media/drink/upvtyt1441249023.jpg'); 