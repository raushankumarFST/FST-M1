select *from orders;

-- Write an SQL statement to find the total purchase amount of all orders.
select SUM(purchase_amount) AS "Total sum" from orders;

-- Write an SQL statement to find the average purchase amount of all orders.
select AVG(purchase_amount) AS "Total avg" from orders;

-- Write an SQL statement to get the maximum purchase amount of all the orders.
select MAX(purchase_amount) AS "Max purchace amt" from orders;

-- Write an SQL statement to get the minimum purchase amount of all the orders.
select Min(purchase_amount) AS "Min purchace amt" from orders;

-- Write an SQL statement to find the number of salesmen listed in the table.
select Count(distinct salesman_id) AS "Total no of salesman" from orders;