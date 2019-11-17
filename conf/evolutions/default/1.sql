# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table employee (
  id                            integer auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  email                         varchar(255),
  address                       varchar(255),
  office_id                     integer,
  user_id                       integer,
  constraint uq_employee_user_id unique (user_id),
  constraint uq_employee_email unique (email),
  constraint uq_employee_address unique (address),
  constraint pk_employee primary key (id)
);

create table office (
  id                            integer auto_increment not null,
  officename                    varchar(255),
  constraint uq_office_officename unique (officename),
  constraint pk_office primary key (id)
);

create table location (
  id                            integer auto_increment not null,
  loc                           varchar(255),
  office_id                     integer,
  constraint pk_location primary key (id)
);

create table phone (
  id                            integer auto_increment not null,
  phonenumber                   varchar(255),
  empid                         integer,
  constraint pk_phone primary key (id)
);

create table user (
  id                            integer auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  username                      varchar(255),
  password                      varchar(255),
  type                          varchar(255),
  constraint uq_user_username unique (username),
  constraint pk_user primary key (id)
);

create index ix_employee_office_id on employee (office_id);
alter table employee add constraint fk_employee_office_id foreign key (office_id) references office (id) on delete restrict on update restrict;

alter table employee add constraint fk_employee_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;

create index ix_location_office_id on location (office_id);
alter table location add constraint fk_location_office_id foreign key (office_id) references office (id) on delete restrict on update restrict;

create index ix_phone_empid on phone (empid);
alter table phone add constraint fk_phone_empid foreign key (empid) references employee (id) on delete restrict on update restrict;


# --- !Downs

alter table employee drop foreign key fk_employee_office_id;
drop index ix_employee_office_id on employee;

alter table employee drop foreign key fk_employee_user_id;

alter table location drop foreign key fk_location_office_id;
drop index ix_location_office_id on location;

alter table phone drop foreign key fk_phone_empid;
drop index ix_phone_empid on phone;

drop table if exists employee;

drop table if exists office;

drop table if exists location;

drop table if exists phone;

drop table if exists user;

