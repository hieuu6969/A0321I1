create database case_study_final;
use case_study_final;

create table customer_type (
	customer_type_id int not null primary key,
	customer_type_name varchar(45)
);

create table customer (
	customer_id int not null primary key,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender bit(1),
    customer_id_card int,
    customer_phone varchar (45),
    customer_type_id int,
    foreign key (customer_type_id) references customer_type(customer_type_id),
    customer_address varchar(45)
);

insert into customer(customer_id, 
customer_name, 
customer_birthday, 
customer_gender, 
customer_id_card,
customer_phone,
customer_type_id,
customer_address) values (
1, "Ho Thi Thuong", '1992-01-11',0,194601573,0967286355,1,"Hoa Khanh Bac");

insert into customer(customer_id, 
customer_name, 
customer_birthday, 
customer_gender, 
customer_id_card,
customer_phone,
customer_type_id,
customer_address) values (
2, "Dinh Van Hieu", '1998-04-21',1,194622272,0776228786,4,"Hoa Minh");

insert into customer(customer_id, 
customer_name, 
customer_birthday, 
customer_gender, 
customer_id_card,
customer_phone,
customer_type_id,
customer_address) values (
3, "Pham Sy Minh Thong", '1993-11-07',1,16796528,045367932,3,"Hoa Vang");

insert into customer_type(
customer_type_id, 
customer_type_name) values (
1,"Diamond");

insert into customer_type(
customer_type_id, 
customer_type_name) values (
2,"Platinium");

insert into customer_type(
customer_type_id, 
customer_type_name) values (
3,"Gold");

insert into customer_type(
customer_type_id, 
customer_type_name) values (
4,"Silver");

select * from customer;
select * from customer_type;

drop table customer;