create table data_status_speed
(
    data_status_id bigint not null
        constraint fksja63b0oh0i0jtoyaackewp59
            references data_status,
    speed_id       bigint not null
        constraint uk_b1tkq9ep1jiys295iuaj73bxd
            unique
        constraint fk67ans95bm5u2pdh7ookttpoyr
            references status
);

alter table data_status_speed
    owner to postgres;
