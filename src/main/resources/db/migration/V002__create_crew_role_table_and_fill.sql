drop table if exists crew_role;

create table crew_role
(
    role_id   serial primary key,
    role_name varchar(64) unique
);

create index idx_crew_role_name on crew_role (role_name);

insert into crew_role(role_name)
values ('режиссер'),
       ('оператор'),
       ('композитор'),
       ('художник'),
       ('сценарист'),
       ('монтажер'),
       ('звукорежиссер'),
       ('актер'),
       ('продюсер'),
       ('специалист по визуальным эффектам'),
       ('светорежиссер'),
       ('костюмер');
