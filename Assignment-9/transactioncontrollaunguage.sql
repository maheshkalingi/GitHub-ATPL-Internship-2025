create table accounts_mahesh(
account_id int,
holder_name varchar(30),
balance int);
select * from accounts_mahesh;
insert into accounts_mahesh values(1,"alice",5000);
insert into accounts_mahesh values(2,"bob",3000);
insert into accounts_mahesh values(3,"charlie",4000);
begin ;
UPDATE accounts_mahesh
set balance=balance-1000 where account_id=1;

UPDATE accounts_mahesh
set balance=balance-1000 where account_id=2;
rollback;

begin;
UPDATE accounts_mahesh
set balance=balance-1000 where account_id=1;
commit;
savepoint afterdebit;
UPDATE accounts_mahesh
set balance=balance+1000 where account_id=2;
UPDATE accounts_mahesh
set balance=balance+500 where account_id=3;
rollback to afterdebit;