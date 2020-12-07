DROP TABLE IF EXISTS gamepals_user;
CREATE TABLE gamepals_user(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(25) NOT NULL,
    email VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS profile;
CREATE TABLE profile(
    user_id BIGINT NOT NULL PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    bio TEXT
);