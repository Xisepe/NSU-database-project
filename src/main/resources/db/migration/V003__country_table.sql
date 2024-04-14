create table if not exists country
(
    country_id   serial primary key,
    country_name varchar(32) not null unique
);

create index if not exists idx_country_name on country (country_name);

insert into country(country_name)
values ('США'),
       ('Великобритания'),
       ('Канада'),
       ('Франция'),
       ('Германия'),
       ('Япония'),
       ('Южная Корея'),
       ('Индия'),
       ('Китай'),
       ('Испания'),
       ('Италия'),
       ('Россия'),
       ('Австралия'),
       ('Бразилия'),
       ('Мексика');