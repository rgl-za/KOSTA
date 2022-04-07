select *
from EMAILLIST;



insert into emaillist values (no.nextval, 'test', 'test', 'test@com');

create sequence seq_guestbook_no
    increment by 1
    start with 1;
    
    
    

CREATE TABLE "GUESTBOOK"(    
    "no" NUMBER,
    "name" VARCHAR2(80),
    "password" VARCHAR2(20),
    "contnent" VARCHAR2(2000),
    PRIMARY KEY("no")
);

ALTER TABLE GUESTBOOK ADD reg_date date;