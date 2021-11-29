create table data_status_vehicles
(
    data_status_id bigint not null
        constraint fkjy0l59hps8ci7v9jpbw8oxtq0
            references data_status,
    vehicles_id    bigint not null
        constraint uk_ev8ybs1lcon5jvkfiavfp2g3n
            unique
        constraint fkpa41frfokt91bq09687ie9pej
            references status
);

alter table data_status_vehicles
    owner to postgres;