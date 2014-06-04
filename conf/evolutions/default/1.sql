# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table game (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  description               TEXT,
  start_map_link            varchar(255),
  constraint pk_game primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table game;

SET FOREIGN_KEY_CHECKS=1;

