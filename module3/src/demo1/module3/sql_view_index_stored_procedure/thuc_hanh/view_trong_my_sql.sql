use classicmodels;

-- Tạo View có tên customer_views truy vấn dữ liệu từ bảng customers để lấy các dữ liệu: customerNumber, customerName, phone bằng câu lệnh SELECT :
CREATE VIEW customer_views AS
SELECT customerNumber, customerName, phone
FROM  customers;

-- Xem customer_views :
select * from customer_views;

-- Cập nhật view customer_views :
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';

-- Xoá view customer_views :
DROP VIEW customer_views;