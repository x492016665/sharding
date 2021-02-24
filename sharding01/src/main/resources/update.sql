drop table if exists t_order;
CREATE TABLE t_order (
  id BIGINT UNSIGNED auto_increment NOT NULL,
  order_id bigint unsigned not null,
  user_id bigint unsigned not null,
  order_type varchar(20) default null,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB;
