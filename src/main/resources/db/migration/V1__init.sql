create table item
(
    id                  IDENTITY       not null,
    name                VARCHAR2       not null,
    type                VARCHAR2       not null,
    weight              INTEGER        not null,
    season              VARCHAR2,
    required_per_day    INTEGER,

    constraint item_pk
        primary key (id)
);
