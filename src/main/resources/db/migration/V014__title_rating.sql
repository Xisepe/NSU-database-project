create table if not exists title_rating(
    title_id int references title(id) on delete cascade,
    rating_id int references rating(rating_id) on delete cascade,
    title_order int not null unique,
    primary key (title_id, rating_id)
);