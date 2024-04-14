create table if not exists dub_studio(
    studio_id serial primary key,
    studio_name varchar(64) unique
);

create index if not exists idx_studio_name on dub_studio(studio_name);