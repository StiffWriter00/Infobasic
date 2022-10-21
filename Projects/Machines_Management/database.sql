CREATE TABLE Department
(
  _location_ CHAR(2) NOT NULL,
  machinesNumber INT NOT NULL,
  operatorsNumber INT NOT NULL,
  PRIMARY KEY (_location_),
  UNIQUE (_location_)
);

CREATE TABLE Machine
(
  id CHAR(3) NOT NULL,
  _number_ INT NOT NULL,
  _status_ BIT NOT NULL,
  maintenancesNumber INT NOT NULL,
  type_A BIT NOT NULL,
  type_B BIT NOT NULL,
  type_C BIT NOT NULL,
  type_D BIT NOT NULL,
  Department_location CHAR(2) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (id),
  FOREIGN KEY (Department_location) REFERENCES Department(_location_),
  UNIQUE (Department_location)
);

CREATE TABLE Operator
(
  id CHAR(5) NOT NULL,
  name VARCHAR NOT NULL,
  surname VARCHAR NOT NULL,
  Department_location CHAR(2) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (id),
  FOREIGN KEY (Department_location) REFERENCES Department(_location_),
  UNIQUE (Department_location)
);

CREATE TABLE Maintenance
(
  id CHAR(5) NOT NULL,
  statusResult BIT NOT NULL,
  startTime VARCHAR(8) NOT NULL,
  endTime VARCHAR(8) NOT NULL,
  Machine_id CHAR(3) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (id),
  FOREIGN KEY (Machine_id) REFERENCES Machine(id),
  UNIQUE (Machine_id)
);

CREATE TABLE MaintenanceLog
(
  _number_ INT NOT NULL,
  _date_ DATE NOT NULL,
  Operator_id CHAR(5) NOT NULL,
  Maintenance_id CHAR(5) NOT NULL,
  PRIMARY KEY (_number_),
  UNIQUE (_number_),
  FOREIGN KEY (Maintenance_id) REFERENCES Maintenance(id),
  FOREIGN KEY (Operator_id) REFERENCES Operator(id),
  UNIQUE (Maintenance_id),
  UNIQUE (Operator_id)
);
