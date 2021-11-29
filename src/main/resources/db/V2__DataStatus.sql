create table data_status
(
    id bigserial
        constraint data_status_pkey
            primary key
);

alter table data_status
    owner to postgres;
