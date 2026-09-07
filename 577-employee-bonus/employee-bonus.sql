# Write your MySQL query statement below
select name,bonus
from Employee
left join Bonus
on Employee.empID=Bonus.empID
where Bonus<1000 or Bonus is NULL;