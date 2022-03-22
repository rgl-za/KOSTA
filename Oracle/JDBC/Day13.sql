CREATE SEQUENCE seq_book_id
INCREMENT BY 1 
START WITH 1 ;

create sequence seq_author_id
increment by 1
start with 10;

drop sequence seq_author_id;

SELECT seq_book_id.nextval FROM dual;

insert into author values (1, '박경리', '토지 작가');
insert into author(author_id, author_name) values (2, '이문열');
insert into author values (4, '유시민', '17대 국회의원');
insert into author values (3, '이문열', '경북 영양');
insert into author values (5, '기안84', '기안동');
insert into author values (6, '강풀', '웹툰 1세대');
insert into author values (7, '김영하', '오직 두사람');
insert into author values (8, '강풀', '웹툰 1세대');
select * from author;

INSERT INTO author VALUES (seq_author_id.nextval, '남궁성', '자바의 정석(기초편)');

update author
set author_desc = '알쓸신잡'
where author_id = 7;






INSERT INTO book
values(seq_book_id.nextval, '토지', '마로니에북스', to_date('2012-08-15', 'YYYY-MM-DD'), 1 );

INSERT INTO book
values(seq_book_id.nextval, '유시민의 글쓰기 특강', '생각의길', to_date('2012-08-15', 'YYYY-MM-DD'), 3 );

INSERT INTO book
values(seq_book_id.nextval, '패션왕', '중앙북스', to_date('2012-08-15', 'YYYY-MM-DD'), 4 );

INSERT INTO book
values(seq_book_id.nextval, '순정만화', '재미주의', to_date('2012-08-15', 'YYYY-MM-DD'), 6 );

INSERT INTO book
values(seq_book_id.nextval, '오직 두사람', '문학동네', to_date('2012-08-15', 'YYYY-MM-DD'), 7 );

INSERT INTO book
values(seq_book_id.nextval, '26년', '재미주의', to_date('2012-08-15', 'YYYY-MM-DD'), 8 );

update book
set title = '보리의 일기'
where book_id = 11;

update book 
set title = '자바의 정석 (기초편)', pubs = '도우출판'
where book_id = 13;

SELECT * FROM book;
select * from author;

UPDATE book
SET title = '우리들의 일그러진 영웅', pubs = '다림' 
WHERE book_id = 3;

update author
set author_desc = '세상에서 제일 귀여움'
where author_id = 11;

update author
set author_desc = '자바 덕후...'
where author_id = 10;


INSERT INTO book
values(4, '범내려온다', '홍길동', sysdate, 7 );


SELECT *
FROM  BOOK b ,AUTHOR a
WHERE a.AUTHOR_ID = b.AUTHOR_ID ;


DELETE FROM author 
where author_id = 25;

commit;

INSERT INTO author VALUES (seq_author_id.nextval, '남궁성', '자바의 정석');