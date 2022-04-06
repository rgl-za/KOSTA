select *
from author;

delete 
from author
where author_id=23;


select no as num
from EMAILLIST;


SELECT b.book_id, b.title, b.pubs,to_char( b.pub_date,'YYYY-MM-DD'),a.author_name
FROM author a, book b
where a.author_id = b.author_id and (b.title || b.pubs || a.author_name) LIKE '%보%';



CREATE TABLE "EMAILLIST"(    
    "no" NUMBER,
    "last_name" VARCHAR2(10),
    "first_name" VARCHAR2(10),
    "email" VARCHAR2(100) NOT NULL,
    PRIMARY KEY("no")
);