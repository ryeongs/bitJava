create  table  friend(
seq number primary key, -- �⺻Ű(not null, unique)
name  varchar2(15)  not  null,
tel1  varchar2(5),
tel2  varchar2(5),
tel3  varchar2(5),
gender  number,   -- ���ڴ� 0, ���ڴ� 1
read  number default  0, -- �������� 0, ���� 1
movie  number default  0,
music  number default  0,
game  number default  0,
shopping  number default  0);

create sequence seq_friend nocycle nocache;
