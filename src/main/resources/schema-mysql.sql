USE `fooddelivery-db`;

create table if not exists restaurants(
id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    restaurant_id VARCHAR (36),
    restaurant_name VARCHAR(36),
    menu_id VARCHAR(36),
    country_name VARCHAR (50),
    street_name VARCHAR(50),
    city_name VARCHAR(50),
    province_name VARCHAR (50),
    postal_code VARCHAR (9)

);

create table if not exists menus (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    restaurant_id VARCHAR(36),
    menu_id VARCHAR(36),
    typeOfMenu VARCHAR(100)
    );

create table if not exists items (
      id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
      item_id VARCHAR(36),
      item_name VARCHAR(20),
      item_desc VARCHAR (50),
      item_price DECIMAL (4,2)
    );