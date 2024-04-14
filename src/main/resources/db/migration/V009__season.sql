drop table if exists season;

create table season(
    title_id int references title(id) on delete cascade,
    season_number int check ( season_number > 0 ),
    description varchar(256),
    primary key (title_id, season_number)
);