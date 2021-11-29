create table data_status_saturation
(
    data_status_id bigint not null
        constraint data_status_id foreign key(data_status_id)
        references "data_status"(id),
    saturation_id  bigint not null unique
        constraint data_status_id foreign key(data_status_id)
        references "status"(id)

);

alter table data_status_saturation
    owner to postgres;