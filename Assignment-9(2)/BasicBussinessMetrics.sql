--1. What is the total number of orders?
SELECT COUNT(*) as Total FROM Orders;

-- 2.How many customers are there?
SELECT COUNT(*) as TotalCustomers FROM Customers;

--3.What is the total revenue from all orders?
Select sum(o.Quantity*p.price) as "Total Revenue" from OrderDetails o left join Products p on o.ProductID = p.ProductID;