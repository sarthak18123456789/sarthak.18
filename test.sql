----TEST QUE----

Que1
mysql> select customername
    -> from customer
    -> order by customername asc;

Que2
mysql> select productname from products
    -> order by price
    -> limt 10;

Que3
mysql> select * from employee
    -> order by  salary decs
    -> limit 1,1;

Que4
mysql> select city, count(*) totalcustomer
	 from customers
    -> group by city;

Que5
mysql> select department,sun(salary) totalsalary frome employe
    -> where salary >200000
    -> group by deptrtment;

Que6
mysql> select
    -> lift (CustomerName, 3)  FirstthreeChars,
    -> right (phone_number, 4) LastfourDigits
    -> from customer;

Que-7
 select * from product
    -> where product_name like '%pro%';

Que-8
mysql> select cource_id,count(student_id) total_student
    -> from student
    -> group by cource_id
    -> having (student_id)>=30;

Que-9
select 
    month(order_date) month_number,
    count(order_id)  total_orders
from Orders
group by month(order_date)
order by month(order_date);

Que-10;
select 
    department_id,
    max(salary)  highest_salary,
    min(salary)  lowest_salary
from Employees
group by department_id;

Que-11
SELECT SUBSTRING('Database', 1, 4);

ANS-Data

Que-12
Which clause is used to sort the results in descending order?

ANS-a) ORDER BY DESC

Que-13
13. What is the default sorting order of `ORDER BY` if no direction (ASC/DESC) is specified?

ANS-a) ASC

Que-14
What will be the output of the following query?
SELECT ROUND(15.678, 2);

ANS-b) 15.68

Que-15
15. Which SQL function is used to count the number of rows in a table?

ANS-b) COUNT()

