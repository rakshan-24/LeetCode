# Write your MySQL query statement below
select *, 
CASE
 when x+y>z and
     y+z>x and
     x+z>y THEN 'Yes'
 else 'No' 
END AS triangle
from Triangle;
