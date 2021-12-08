
create database quan_ly_ban_hang;
drop database quan_ly_ban_hang;
CREATE TABLE customer (
    c_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    c_name VARCHAR(50) NOT NULL,
    c_age INT NOT NULL
);

CREATE TABLE orders (
    o_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    o_date DATETIME,
    o_total_price VARCHAR(20),
    c_id INT NOT NULL,
    FOREIGN KEY (c_id)
        REFERENCES customer (c_id)
);

CREATE TABLE product (
    p_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    p_name VARCHAR(50) NOT NULL,
    p_price VARCHAR(20)
);

CREATE TABLE order_detail (
    o_id INT NOT NULL,
    p_id INT NOT NULL,
    quantity INT NOT NULL,
    primary key(o_id,p_id),
    FOREIGN KEY (o_id)
        REFERENCES orders(o_id),
    FOREIGN KEY (p_id)
        REFERENCES product(p_id)
);