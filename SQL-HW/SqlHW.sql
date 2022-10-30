--ANSII standard
SELECT ContactName Adi, City Sehir  FROM Customers --Adi, sehir alias

SELECT  FROM Customers where City = 'Berlin'

case insensitive
select  from Products where CategoryID = 1 or CategoryID = 3
select  from Products where CategoryID = 1 and Price = 10
select  from Products where categoryID = 1 order by Price desc --asc ascending desc descending 
select  from Products order by CategoryID, ProductName--first order by categoryId, then order productName's by their alphabetic order.
Select count () from Products--counts how many data is in the products table.
Select count () Adet from Products where CategoryID = 2--Count of products where categoryID == 2 Adet is alias
select CategoryID, count () from products group by CategoryID--when using group by we can not use , list all categoryID's, then count every categoryID's product count.
select CategoryID, count () from products where Price  20 group by CategoryID having count()  10 --categories having less than 10 products where price is greater than 20

select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName 
from Products inner join Categories --products and categories combined
on Products.CategoryID = Categories.CategoryID --join by what if same CategoryID, join them
where Products.Price  10

inner join joins matched columns.

select  from Products p left join OrderDetails od--left means get Products table has but orderDetails hasn't
on p.productID = od.ProductID

select  from Customers c left join Orders o
on c.CustomerID = o.CustomerID--müşterilerde olan ama siparişi olmayanları da getir.
where o.customerID is null--sadece müşteri olup ürün almayanları getir --customerID primary key oldugu icin buna uygulamak mantıklı

select  from Products p inner join OrderDetails od
on p.productID = od.ProductID
inner join Orders o 
on o.OrderID = od.OrderID