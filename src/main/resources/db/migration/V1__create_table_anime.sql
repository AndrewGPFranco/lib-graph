create table anime (
    id uuid default gen_random_uuid() primary key,
    title varchar(255) not null unique,
    creation_date DATE NOT NULL,
    finalization_date DATE NULL
);