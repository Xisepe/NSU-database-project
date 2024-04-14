drop table if exists title_cast;

create table title_cast
(
    title_id       int references title (id) on delete cascade,
    person_id      int references person (person_id) on delete cascade,
    character_name varchar(64) not null,
    cast_order     int check ( cast_order > 0),
    primary key (title_id, person_id, character_name)
);

create index idx_character_name on title_cast(character_name);
