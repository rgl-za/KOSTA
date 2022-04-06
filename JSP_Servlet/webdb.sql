select *
from EMAILLIST;



insert into emaillist values (no.nextval, 'test', 'test', 'test@com');

create sequence no
    increment by 1
    start with 2
    minvalue 1
    maxvalue 90
    nocycle
    nocache
    noorder;