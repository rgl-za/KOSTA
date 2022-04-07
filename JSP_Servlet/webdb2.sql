insert into guestbook
values (seq_guestbook_no.nextval, 
        '정준하', 
        '1234', 
        '내용없음',
        sysdate
       );
      
insert into guestbook
values (seq_guestbook_no.nextval, 
        '하하', 
        '1234', 
        '내용없음',
        sysdate
       );

insert into guestbook
values (seq_guestbook_no.nextval, 
        '유재석', 
        '1234', 
        '내용없음',
        sysdate
       );
       

commit;
      
select *
from guestbook
order by reg_date desc;



alter table guestbook rename column contnent to content;


delete 
from guestbook 
where "name" = '정준하';