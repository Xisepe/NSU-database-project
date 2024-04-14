drop table if exists dub_studio;

create table dub_studio(
    studio_id serial primary key,
    studio_name varchar(64) unique
);

create index idx_studio_name on dub_studio(studio_name);