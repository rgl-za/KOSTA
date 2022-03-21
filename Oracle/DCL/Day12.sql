create table book(
    book_id     number(5),
    title       varchar2(50),
    author      varchar2(10),
    pub_date    date
);


ALTER TABLE book ADD (pubs VARCHAR2(50));

ALTER TABLE book MODIFY (title VARCHAR2(100));

ALTER TABLE book DROP (author);

RENAME book TO article;

DROP TABLE article;


create table author (
    author_id number(10),
    author_name varchar2(100) not null,
    author_desc varchar2(500),
    primary key(author_id)
);

create table book (
    book_id number(10),
    title varchar2(100) not null,
    pubs varchar2(100),
    pub_date date,
    author_id number(10),
    primary key(book_id),
    CONSTRAINT c_book_fk foreign key (author_id)
    references author(author_id)
);


-- 묵시
insert into author values (1, '박경리', '토지 작가');

select * from author;

-- 명시
insert into author(author_id, author_name) values (2, '이문열');

-- 데이터 변경 후 commit을 일상화하자 특히 dbeaver인 걍우 auto이지만 sqldeveloper는 아님

update author
set author_name = '주호민', author_desc = '웹툰작가'
where author_id = 1;

commit;

-- 이 같은 경우에는 전부 다 적용됨...
update author 
set author_name = '강풀', author_desc = '웹툰 작가';

select * 
from author a;

commit;

select *
from author a;

create sequence seq_author_id
increment by 1
start with 1 ;

select seq_author_id.nextval from dual;

select seq_author_id.currval from dual;


insert into author
values(seq_author_id.nextval, '강풀', '웹툰 작가');

update author
set author_id = 1
where author_id = 11;

select * from author;
select * from book;

select *
from book b, author a
where b.author_id(+) = a.author_id;

insert into book(book_id, title, pubs, pub_date) values (1, '이문열');

