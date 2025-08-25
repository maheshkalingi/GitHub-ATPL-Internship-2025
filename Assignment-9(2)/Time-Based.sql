
-- 13. Which customers placed more than 5 orders?
SELECT CU.CustomerName, COUNT(OD.OrderID) AS OrderCount
FROM Orders OD
JOIN Customers CU ON OD.CustomerID = CU.CustomerID
GROUP BY CU.CustomerName
HAVING OrderCount > 5;

-- Time-Based Analysis
-- 14. How many orders are placed each month?
SELECT DATE_FORMAT(OrderDate, '%Y-%m') AS Month, COUNT(*) AS OrderCount
FROM Orders
GROUP BY Month;

-- 15. What is the average order value per month?
SELECT DATE_FORMAT(OrderDate, '%Y-%m') AS Month, AVG(OrderTotal) AS AvgOrderValue
FROM (
  SELECT OD.OrderID, DATE_FORMAT(OD.OrderDate, '%Y-%m') AS Month, SUM(O.Quantity * P.Price) AS OrderTotal
  FROM Orders OD
  JOIN OrderDetails O ON OD.OrderID = O.OrderID
  JOIN Products P ON O.ProductID = P.ProductID
  GROUP BY OD.OrderID
) AS MonthlyOrders
GROUP BY Month;

-- 16. Which month had the highest number of orders?
SELECT DATE_FORMAT(OrderDate, '%Y-%m') AS Month, COUNT(*) AS OrderCount
FROM Orders
GROUP BY Month
ORDER BY OrderCount DESC
LIMIT 1;

