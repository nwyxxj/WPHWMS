# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        varchar(255) not null,
  title                     varchar(255),
  student_user_id           varchar(255),
  credit                    integer,
  constraint pk_book primary key (id))
;

create table student (
  user_id                   varchar(255) not null,
  password                  varchar(255),
  name                      varchar(255),
  contact                   varchar(255),
  credit_balance            integer,
  constraint pk_student primary key (user_id))
;

alter table book add constraint fk_book_student_1 foreign key (student_user_id) references student (user_id) on delete restrict on update restrict;
create index ix_book_student_1 on book (student_user_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table book;

drop table student;

SET FOREIGN_KEY_CHECKS=1;

