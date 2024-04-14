drop table if exists title_crew;

create table title_crew(
    title_id int references title(id) on delete cascade,
    person_id int references person(person_id) on delete cascade,
    crew_role_id int references crew_role(role_id) on delete cascade,
    primary key (title_id, person_id, crew_role_id)
)