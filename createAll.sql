CREATE DATABASE IF NOT EXISTS band_finder;
use band_finder;

CREATE TABLE band
(
	primary key(id),
    
	id int AUTO_INCREMENT,
	name varchar(30),
    genre varchar(30),
    description text,
    street_num int,
    street_name varchar(20),
    city varchar(20),
    state char(2),
    zipcode numeric(6,0),
	latitude numeric(9,6),
    longitude numeric(9, 6)
);

CREATE TABLE event
(
	primary key(id),

	id int AUTO_INCREMENT,
    event_date datetime,
    phone_number varchar(20),
    email varchar(40),
    
    street_num int,
    street_name varchar(20),
    city varchar(20),
    state char(2),
    zipcode numeric(6,0),
    latitude numeric(9,6),
    longitude numeric(9, 6),
    
	band_id int,
    
    foreign key(band_id) references band(id)
);