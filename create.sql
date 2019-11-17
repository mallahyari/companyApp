
drop database if exists directorydb;
create database directorydb;

use directorydb;


-- alter table employee drop foreign key employee_ibfk_1;
-- alter table phone drop foreign key phone_ibfk_1;
-- alter table location drop foreign key location_ibfk_1;



drop table if exists user;
create table user (
  id int not null auto_increment primary key,
  fname varchar(255) not null,
  lname varchar(255) not null,
  username varchar(100) not null,
  password varchar(100) not null,
  type varchar(20) not null default 'user',
  unique(username)
);


drop table if exists office;
create table office (
  id int not null auto_increment primary key,
  officename varchar(255) not null,
  unique(officename)
);



drop table if exists employee;
create table employee (
  id int not null auto_increment primary key,
  fname varchar(255) not null,
  lname varchar(255) not null,
  office_id int,
  email varchar(255) not null,
  address varchar(255) not null,
  user_id int,
  unique(email),
  unique(address),
  foreign key (office_id) references office(id),
  foreign key (user_id) references user(id)
);

drop table if exists phone;
create table phone (
  id int not null auto_increment primary key,
  empid int not null,
  phonenumber varchar(20) not null,
  unique(empid, phonenumber),
  foreign key (empid) references employee(id)
);



drop table if exists location;
create table location (
  id int not null auto_increment primary key,
  office_id int not null,
  loc varchar(255) not null,
  unique(office_id,loc),
  foreign key (office_id) references office(id)
);


insert into user(fname, lname, username, password, type) values('mehdi','allahyari','mehdi.allahyari@gmail.com','1234','admin');
insert into user(fname, lname, username, password) values('Alex','Edlyn','aedlyn0@odnoklassniki.ru','test1');
insert into user(fname, lname, username, password) values('Florrie','Bunston','fbunston1@360.cn','test2');
insert into user(fname, lname, username, password) values('Herman','Apps','happs2@sogou.com','test3');
insert into user(fname, lname, username, password) values('Helli','Kliesl','hkliesl3@sciencedaily.com','test4');
insert into user(fname, lname, username, password) values('Tracy','McGilroy','tmcgilroy4@51.la','test5');
insert into user(fname, lname, username, password) values('Torin','Arnal','tarnal5@gravatar.com','test6');
insert into user(fname, lname, username, password) values('Lefty','Bogeys','lbogeys6@japanpost.jp','test7');
insert into user(fname, lname, username, password) values('John','Smith','test','test');


insert into office(officename) values('CompanyABC-Austin');
insert into office(officename) values('CompanyABC-San Fransisco');
insert into office(officename) values('CompanyABC-Dallas');
insert into office(officename) values('CompanyABC-New York');
insert into office(officename) values('CompanyABC-Los Angeles');
insert into office(officename) values('CompanyABC-Seattle');


insert into location(office_id,loc) values(1, 'Austin');
insert into location(office_id,loc) values(2, 'San Fransisco');
insert into location(office_id,loc) values(3, 'Dallas');
insert into location(office_id,loc) values(4, 'New York');
insert into location(office_id,loc) values(5, 'Los Angeles');
insert into location(office_id,loc) values(6, 'Seattle');


insert into employee(fname,lname,email,address,office_id,user_id) values("Mehdi","Allahyari","mehdi.allahyari@gmail.com","123 Statesboro",1,1);
insert into employee(fname,lname,email,address,office_id,user_id) values("Alex","Edlyn","aedlyn0@odnoklassniki.ru","99 Monterey Way",1,2);
insert into employee(fname,lname,email,address,office_id,user_id) values("Florrie","Bunston","fbunston1@360.cn","4 Brown Street",1,3);
insert into employee(fname,lname,email,address,office_id,user_id) values("Herman","Apps","happs2@sogou.com","44 Eagan Trail",2,4);
insert into employee(fname,lname,email,address,office_id,user_id) values("Helli","Kliesl","hkliesl3@sciencedaily.com","6 Forest Street",3,5);
insert into employee(fname,lname,email,address,office_id,user_id) values("Tracy","McGilroy","tmcgilroy4@51.la","0 Brickson Park Court",4,6);
insert into employee(fname,lname,email,address,office_id,user_id) values("Torin","Arnal","tarnal5@gravatar.com","231 Morningstar Junction",5,7);
insert into employee(fname,lname,email,address,office_id,user_id) values("Lefty","Bogeys","lbogeys6@japanpost.jp","76 Drewry Terrace",6,8);



-- insert into employee(fname,lname,email,address,office_id,userid) values("Alex","Edlyn","aedlyn0@odnoklassniki.ru","99 Monterey Way",1,1);
-- insert into employee(fname,lname,email,address,office_id,userid) values("Florrie","Bunston","fbunston1@360.cn","4 Brown Street",1,1);
-- insert into employee(fname,lname,email,address,office_id,userid) values("Herman","Apps","happs2@sogou.com","44 Eagan Trail",2,1);
-- insert into employee(fname,lname,email,address,office_id,userid) values("Helli","Kliesl","hkliesl3@sciencedaily.com","6 Forest Street",3,1);
-- insert into employee(fname,lname,email,address,office_id,userid) values("Tracy","McGilroy","tmcgilroy4@51.la","0 Brickson Park Court",4,1);
-- insert into employee(fname,lname,email,address,office_id,userid) values("Torin","Arnal","tarnal5@gravatar.com","231 Morningstar Junction",5,1);
-- insert into employee(fname,lname,email,address,office_id,userid) values("Lefty","Bogeys","lbogeys6@japanpost.jp","76 Drewry Terrace",6,1);



insert into phone(empid, phonenumber) values(1, "547-280-9854");
insert into phone(empid, phonenumber) values(1, "774-741-1541");
insert into phone(empid, phonenumber) values(2, "708-867-0559");
insert into phone(empid, phonenumber) values(3, "894-898-1948");
insert into phone(empid, phonenumber) values(3, "224-596-7296");
insert into phone(empid, phonenumber) values(3, "222-883-4780");
insert into phone(empid, phonenumber) values(4, "893-562-7716");
insert into phone(empid, phonenumber) values(4, "127-585-3986");
insert into phone(empid, phonenumber) values(5, "869-762-8633");
insert into phone(empid, phonenumber) values(5, "964-795-5919");
insert into phone(empid, phonenumber) values(5, "762-828-9763");
insert into phone(empid, phonenumber) values(6, "120-493-3903");
insert into phone(empid, phonenumber) values(6, "276-557-9896");
insert into phone(empid, phonenumber) values(7, "292-979-7031");









