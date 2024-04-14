drop table if exists episode;

create table episode
(
    title_id       int,
    season_number  int,
    episode_number int check ( episode_number > 0 ),
    description    varchar(256),
    primary key (title_id, season_number, episode_number),
    foreign key (title_id, season_number) references season (title_id, season_number) on delete cascade
);