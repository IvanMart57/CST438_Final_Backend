create table user_table (
	id identity primary key,  
	alias varchar(25) unique, 
	email varchar(25) unique,
	password varchar(100), 
	role varchar(25)
);