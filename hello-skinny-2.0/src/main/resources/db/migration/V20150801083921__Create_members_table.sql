-- For H2 Database
create table members (
  id bigserial not null primary key,
  name varchar(512) not null,
  activated boolean not null,
  lucky_number bigint,
  birthday date,
  created_at timestamp not null,
  updated_at timestamp not null
)
