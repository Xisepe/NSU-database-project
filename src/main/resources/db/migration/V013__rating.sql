create table if not exists rating(
    rating_id serial primary key,
    rating_name varchar(32) unique
);

create index if not exists idx_rating_name on rating(rating_name);