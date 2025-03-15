alter table anime
add column url_image varchar(500) not null default '-';

alter table persona
add column url_image varchar(500) not null default '-';