drop table if exists ITEM;

CREATE TABLE IF NOT EXISTS PUBLIC.ITEM
(
    ITEM_ID VARCHAR               NOT NULL,
    URL VARCHAR                           ,
    ITEM_DATE VARCHAR             NOT NULL,
    PARENT_ID VARCHAR                     ,
    TYPE VARCHAR                  NOT NULL,
    SIZE INTEGER                  NOT NULL,
    CHILDREN VARCHAR              NOT NULL
    CONSTRAINT ITEM_ID PRIMARY KEY (ITEM_ID)
);