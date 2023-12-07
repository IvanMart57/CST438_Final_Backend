create table user_table (
	id identity primary key,  
	alias varchar(25) unique, 
	email varchar(25) unique,
	password varchar(100), 
	role varchar(25)
);

create table likes_table (
	likeId identity primary key,
    id int DEFAULT NULL,
    drinkId int DEFAULT NULL,
    drinkStr varchar(25),
    drinkImg varchar(250),
    FOREIGN KEY (id) REFERENCES user_table (id) on delete cascade
    );

