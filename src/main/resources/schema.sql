

CREATE TABLE IF not exist public.station (
    stationId serial NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    "hdEnabled" boolean NOT NULL,
    callSign character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
);