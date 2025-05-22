--liquibase formatted sql

--changeset venikovdi:01-create-tbl_notice

create table carpark.tbl_notice (
    notice_id int primary key auto_increment,
    color varchar(100) not null,
    brand varchar(100) not null,
    number varchar(100) not null
);