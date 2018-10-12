
create table admin
(
	admin_id varchar(50) not null,
	name varchar(50) not null,
  username     varchar(50) not null,
  password varchar(50) not null,
  created date not null ,
	constraint admin_pkey
		primary key (admin_id)
)
;

