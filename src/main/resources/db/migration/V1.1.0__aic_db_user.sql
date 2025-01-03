CREATE TABLE IF NOT EXISTS t_user(
    id int PRIMARY KEY AUTO_INCREMENT,
    b_id char(36) NOT NULL  UNIQUE,
    username varchar(30),
    first_name varchar(20),
    last_name varchar(20),
    fk_creator char(36) NOT NULL,
    created_date datetime NOT NULL,
    updated_date datetime,
    fk_updater char(36),
    phone_no varchar(15),
    email varchar(100),
    code varchar(10),
    fk_avatar_b_id char(36)
);

CREATE TABLE IF NOT EXISTS t_account_inf(
    id int PRIMARY KEY AUTO_INCREMENT,
    fk_user_b_id char(36) NOT NULL,
    password varchar(20),
    fk_auth_status int NOT NULL,
    fk_auth_type int NOT NULL,
    auth_id varchar(100)
);

CREATE TABLE IF NOT EXISTS t_auth_type(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20)
);

CREATE TABLE IF NOT EXISTS t_auth_status(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20)
);

CREATE TABLE IF NOT EXISTS t_auth_third_party(
    id int PRIMARY KEY AUTO_INCREMENT,
    fk_user_b_id char(36),
    open_id char(100),
    access_token char(100),
    access_expired timestamp,
    fk_auth_type int
);