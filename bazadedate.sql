CREATE DATABASE toysdb;

USE toysdb;

CREATE TABLE Category(
	CategoryID INT auto_increment primary key,
    CategoryName VARCHAR(255)
);
CREATE TABLE ToyKind(
	ToyKindID INT auto_increment primary key,
    ToyKindName VARCHAR(255)
);
CREATE TABLE Toy(
	ToyID INT auto_increment primary key,
    Description VARCHAR(255),
    Price DOUBLE(10, 2),
	ToyKindID INT,
    CategoryID INT,
    foreign key(ToyKindID) REFERENCES ToyKind(ToyKindID),
    foreign key(CategoryID) REFERENCES Category(CategoryID)
);
INSERT INTO ToyKind(ToyKindName)
	VALUES ('Figurine');

INSERT INTO ToyKind(ToyKindName)
	VALUES ('Electronice');

INSERT INTO Category(CategoryName)
	VALUES ('LEGO');
INSERT INTO Category(CategoryName)
	VALUES ('Papusi');
INSERT INTO Category(CategoryName)
	VALUES ('Masini');
INSERT INTO Category(CategoryName)
	VALUES ('Puzzle');
INSERT INTO Category(CategoryName)
	VALUES ('Exterior');

INSERT INTO Toy (Description, Price, ToyKindID, CategoryID) 
	VALUES('Barbie', 50.00, 1, 2);
INSERT INTO Toy (Description, Price, ToyKindID, CategoryID) 
	VALUES('Mercede', 12.50, 2, 3);
INSERT INTO Toy (Description, Price, ToyKindID, CategoryID) 
	VALUES('Castel', 120.00, 1, 1);
INSERT INTO Toy (Description, Price, ToyKindID, CategoryID) 
	VALUES('Iron Man', 11.70, 1, 2);
INSERT INTO Toy (Description, Price, ToyKindID, CategoryID) 
	VALUES('Turnul Eiffel', 150.00, 1, 4);
INSERT INTO Toy (Description, Price, ToyKindID, CategoryID) 
	VALUES('Drona', 1150.00, 2, 5);

SELECT * FROM Toy;