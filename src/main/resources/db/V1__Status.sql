create table "status"
(
    id            bigserial
        constraint status_pkey
            primary key,
    direction     varchar(255),
    lane          varchar(255),
    value         bigint,
    saturation_id bigint
        constraint fk3u8krh8jhno2b9dv2non269wx
            references data_status
);

alter table status
    owner to postgres;
