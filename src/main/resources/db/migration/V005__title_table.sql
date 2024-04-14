create type mpa_rating as enum ('G','PG','PG-13','R','NC-17');

create table if not exists title(
    id serial primary key,
    name varchar(128) not null,
    original_name varchar(128),
    tagline varchar(64),
    duration int,
    budged int,
    release_date date,
    country_id int references country(country_id) on delete set null,
    mpa_rating mpa_rating,
    age_constraint int
);

create index if not exists idx_title_name on title(name);
create index if not exists idx_title_original_name on title(original_name);
