drop table if exists dub_studio_title;

create table dub_studio_title(
    title_id int references title(id) on delete cascade,
    dub_studio int references dub_studio(studio_id) on delete cascade,
    primary key (title_id,dub_studio)
);