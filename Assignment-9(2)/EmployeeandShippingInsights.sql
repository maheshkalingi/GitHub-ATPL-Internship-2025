
-- 17. How many orders has each employee handled?
SELECT CONCAT(E.FirstName, ' ', E.LastName) AS EmployeeName, COUNT(O.OrderID) AS OrdersHandled
FROM Orders O
JOIN Employees E ON O.EmployeeID = E.EmployeeID
GROUP BY EmployeeName;

-- 18. Which employee generated the highest revenue?
SELECT CONCAT(E.FirstName, ' ', E.LastName) AS EmployeeName,
       SUM(OD.Quantity * P.Price) AS TotalRevenue
FROM Orders O
JOIN Employees E ON O.EmployeeID = E.EmployeeID
JOIN OrderDetails OD ON O.OrderID = OD.OrderID
JOIN Products P ON OD.ProductID = P.ProductID
GROUP BY EmployeeName
ORDER BY TotalRevenue DESC
LIMIT 1;

-- 19. How frequently has each shipper been used?
SELECT S.ShipperName, COUNT(O.OrderID) AS ShipmentCount
FROM Orders O
JOIN Shippers S ON O.ShipperID = S.ShipperID
GROUP BY S.ShipperName;

-- 20. Which shipper delivered the most revenue-generating orders?
SELECT S.ShipperName, SUM(OD.Quantity * P.Price) AS TotalRevenue
FROM Orders O
JOIN Shippers S ON O.ShipperID = S.ShipperID
JOIN OrderDetails OD ON O.OrderID = OD.OrderID
JOIN Products P ON OD.ProductID = P.ProductID
GROUP BY S.ShipperName
ORDER BY TotalRevenue DESC
LIMIT 1;