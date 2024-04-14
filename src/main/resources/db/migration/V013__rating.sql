drop table if exists rating;

create table rating(
    rating_id serial primary key,
    rating_name varchar(32) unique
);

create index idx_rating_name on rating(rating_name);