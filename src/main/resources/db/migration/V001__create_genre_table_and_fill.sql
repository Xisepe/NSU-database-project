drop table if exists genre;

create table genre
(
    genre_id   serial primary key,
    genre_name varchar(32) unique
);

create index idx_genre_name ON genre (genre_name);

insert into genre(genre_name)
values ('драма'),
       ('комедия'),
       ('экшн'),
       ('ужасы'),
       ('фантастика'),
       ('фэнтези'),
       ('триллер'),
       ('мистика'),
       ('романтика'),
       ('детектив'),
       ('анимация'),
       ('приключения'),
       ('исторический'),
       ('вестерн'),
       ('документальный'),
       ('нуар'),
       ('мелодрама'),
       ('мюзикл'),
       ('биография'),
       ('спортивный'),
       ('военный'),
       ('политический'),
       ('фэнтези-комедия'),
       ('катастрофа'),
       ('детский'),
       ('семейный'),
       ('шпионский'),
       ('фильм о вампирах'),
       ('психологический триллер');

