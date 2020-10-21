USE cupcake;
CREATE TABLE bottoms (
bottom_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(15),
price INT,
PRIMARY KEY ( bottom_id )
);
INSERT INTO bottoms (name,price)
VALUES ("Chocolate",5);
INSERT INTO bottoms (name,price)
VALUES ("Vanilla",5);
INSERT INTO bottoms (name,price)
VALUES ("Nutmeg",5);
INSERT INTO bottoms (name,price)
VALUES ("Pistacio",6);
INSERT INTO bottoms (name,price)
VALUES ("Almond",7);