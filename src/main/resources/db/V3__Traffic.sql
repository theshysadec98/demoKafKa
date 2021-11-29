create table traffic
(
    id         bigserial
        constraint traffic_pkey
            primary key,
    highway    varchar(255),
    name       varchar(255),
    time_stamp timestamp,
    data_id    bigint
        constraint fklw4js95tyvbtgwl3anslmx8dc
            references data_status
);

alter table traffic
    owner to postgres;
