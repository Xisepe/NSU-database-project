drop table if exists title_genre;

create table title_genre
(
    title_id int references title (id) on delete cascade,
    genre_id int references genre (genre_id) on delete cascade,
    primary key (title_id, genre_id)
);