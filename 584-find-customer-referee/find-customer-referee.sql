# Write your MySQL query statement below
select c.name from Customer c left join Customer r on c.referee_id=r.id where c.referee_id<> 2 OR c.referee_id IS Null;