select *
from author;

delete 
from author
where author_id=23;


select *
from book;


SELECT b.book_id, b.title, b.pubs,to_char( b.pub_date,'YYYY-MM-DD'),a.author_name
FROM author a, book b
where a.author_id = b.author_id and (b.title || b.pubs || a.author_name) LIKE '%보%';