DROP TABLE IF EXISTS t_event;
CREATE TABLE t_event
(
    id int PRIMARY KEY AUTO_INCREMENT,
    b_id char(36) NOT NULL UNIQUE,
    topic varchar(100)  NOT NULL,
    description text,
    event_type int,
    location varchar (20),
    point int4,
    poster varchar(150),
    belong char(36) NOT NULL,
    create_date datetime NOT NULL,
    update_date datetime,
    creator char(36) NOT NULL,
    updator char(36),
    status int NOT NULL,
    principal char(36) NOT NULL
);

DROP TABLE IF EXISTS t_event_type;
CREATE TABLE t_event_type
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(5) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS t_event_status;
CREATE TABLE t_event_status(
                               id int PRIMARY KEY AUTO_INCREMENT,
                               name varchar(10) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS article;
CREATE TABLE t_article
(
    id int PRIMARY KEY AUTO_INCREMENT,
    b_id char(36) NOT NULL UNIQUE,
    title varchar(100) NOT NULL,
    content text,
    author char(36) NOT NULL,
    pub_date datetime NOT NULL,
    update_date datetime,
    status int NOT NULL,
    cover char(36),
    article_option int
);

DROP TABLE IF EXISTS t_article_option;
CREATE TABLE t_article_option
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS t_article_status;
CREATE TABLE t_article_status
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(10) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS t_agent;
CREATE TABLE t_agent
(
    id int PRIMARY KEY AUTO_INCREMENT,
    b_id char(36) NOT NULL UNIQUE,
    name varchar(50) NOT NULL,
    description text,
    phone varchar(15)
);

DROP TABLE IF EXISTS t_agent_agent_type_rel;
CREATE TABLE t_agent_agent_type_rel
(
    agent_b_id char(36) NOT NULL,
    agent_type_id int NOT NULL,
    PRIMARY KEY (agent_b_id, agent_type_id)
);


DROP TABLE IF EXISTS t_agent_type;
CREATE TABLE t_agent_type
(
    id   int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20) NOT NULL
);

DROP TABLE IF EXISTS t_agent_service_type_rel;
CREATE TABLE t_agent_service_type_rel
(
    agent_b_id char(36) NOT NULL,
    service_type_id int NOT NULL,
    PRIMARY KEY (agent_b_id, service_type_id)
);

DROP TABLE IF EXISTS t_agent_service_type;
CREATE TABLE t_agent_service_type
(
    id   int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20) NOT NULL
);

DROP TABLE IF EXISTS t_mentor;
CREATE TABLE t_mentor
(
    id int PRIMARY KEY AUTO_INCREMENT,
    b_id  char(36) NOT NULL UNIQUE,
    code char(5) NOT NULL UNIQUE,
    name varchar(50) NOT NULL,
    avatar_id char(36) NOT NULL,
    title varchar(50) NOT NULL,
    description text,
    contact_info varchar(20)
);

DROP TABLE IF EXISTS t_mentor_service_type_rel;
CREATE TABLE t_mentor_service_type_rel
(
    mentor_b_id     char(36) NOT NULL,
    service_type_id int      NOT NULL,
    PRIMARY KEY (mentor_b_id, service_type_id)
);

DROP TABLE IF EXISTS t_mentor_domain_rel;
CREATE TABLE t_mentor_domain_rel
(
    mentor_b_id char(36) NOT NULL,
    domain_id   int      NOT NULL,
    PRIMARY KEY (mentor_b_id, domain_id)
);

DROP TABLE IF EXISTS t_mentor_domain;
CREATE TABLE t_mentor_domain
(
    id   int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20) NOT NULL
);

DROP TABLE IF EXISTS t_resource;
CREATE TABLE t_resource
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    b_id        char(36)     NOT NULL UNIQUE,
    topic       varchar(120) NOT NULL,
    description text
);