create table if not exists person
(
    person_id      serial primary key,
    person_name    varchar(32) not null,
    date_of_birth  date        not null,
    date_of_death  date,
    citizenship    varchar(32),
    place_of_birth varchar(32)
);

create index if not exists idx_person_name on person(person_name);
create index if not exists idx_person_date_of_birth on person(date_of_birth);

create table if not exists person_crew_role
(
    person_id    int references person (person_id) on delete cascade,
    crew_role_id int references crew_role (role_id) on delete cascade,
    primary key (person_id, crew_role_id)
);

create table if not exists person_genre
(
    person_id int references person (person_id) on delete cascade,
    genre_id  int references genre (genre_id) on delete cascade,
    primary key (person_id, genre_id)
);