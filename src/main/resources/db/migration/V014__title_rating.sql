drop table if exists title_rating;

create table title_rating(
    title_id int references title(id) on delete cascade,
    rating_id int references rating(rating_id) on delete cascade,
    primary key (title_id, rating_id)
);