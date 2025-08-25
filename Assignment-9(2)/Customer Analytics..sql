
-- 9. Who are the top 5 customers by purchase volume?
SELECT CU.CustomerName, SUM(O.Quantity * P.Price) AS TotalSpent
FROM Orders OD
JOIN Customers CU ON OD.CustomerID = CU.CustomerID
JOIN OrderDetails O ON OD.OrderID = O.OrderID
JOIN Products P ON O.ProductID = P.ProductID
GROUP BY CU.CustomerName
ORDER BY TotalSpent DESC
LIMIT 5;

-- 10. How many customers are there in each country?
SELECT Country, COUNT(*) AS CustomerCount
FROM Customers
GROUP BY Country;

-- 11. Which country contributes the most to total revenue?
SELECT CU.Country, SUM(O.Quantity * P.Price) AS TotalRevenue
FROM Orders OD
JOIN Customers CU ON OD.CustomerID = CU.CustomerID
JOIN OrderDetails O ON OD.OrderID = O.OrderID
JOIN Products P ON O.ProductID = P.ProductID
GROUP BY CU.Country
ORDER BY TotalRevenue DESC
LIMIT 1;

-- 12. What is the average order value per customer?
SELECT CU.CustomerName, AVG(OrderTotal) AS AvgOrderValue
FROM (
  SELECT OD.CustomerID, OD.OrderID, SUM(O.Quantity * P.Price) AS OrderTotal
  FROM Orders OD
  JOIN OrderDetails O ON OD.OrderID = O.OrderID
  JOIN Products P ON O.ProductID = P.ProductID
  GROUP BY OD.OrderID
) AS CustomerOrders
JOIN Customers CU ON CustomerOrders.CustomerID = CU.CustomerID
GROUP BY CU.CustomerName;
