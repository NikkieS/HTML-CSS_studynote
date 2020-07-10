-- report

create table report(
    idx number(4) primary key,
    sname varchar2(20) not null,
    stn varchar(20) not null,
    reportfile varchar2(100) not null
)