create sequence seq_board;
 
create table tbl_board (
  bno number(10,0),
  title varchar2(200) not null,
  content varchar2(2000) not null,
  writer varchar2(50) not null,
  regdate date default sysdate, 
  updatedate date default sysdate
);
 
alter table tbl_board add constraint pk_board 
primary key (bno);

commit;

insert into tbl_board (bno, title, content, writer) 
values (seq_board.nextval, '테스트 제목','테스트 내용','user00');

commit;

select * from tbl_board;

select bno,title, content
select /*+INDEX_DESC(tbl_board pk_board)*/
    rownum rn, bno, title, content
from tbl_board
where rownum <= 10;


create table tbl_reply (
  rno number(10,0),
  bno number(10,0) not null,
  reply varchar2(1000) not null,
  replyer varchar2(50) not null,
  replyDate date default sysdate,
  updateDate date default sysdate
);

create sequence seq_reply;

alter table tbl_reply add constraint pk_reply primary key (rno);

alter table tbl_reply add constraint fk_reply_board foreign key (bno) references tbl_board (bno);

select * from tbl_reply;


create table tbl_sample1(col1 varchar2(500));
create table tbl_sample2(col2 varchar2(500));

select * from tbl_sample1;
select * from tbl_sample2;

delete tbl_sample1;
delete tbl_sample2;
commit;