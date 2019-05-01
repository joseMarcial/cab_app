CREATE TABLE cab_info (
  id BIGINT NOT NULL AUTO_INCREMENT,
  plates VARCHAR(64) NOT NULL,
  driver_name VARCHAR(64) NOT NULL,
  PRIMARY KEY (id)
  );
 
  CREATE INDEX ind_ci_plates ON cab_info (plates);
  
  CREATE TABLE location_history(
  id BIGINT NOT NULL AUTO_INCREMENT,
  cab_id BIGINT NOT NULL,
  service_id BIGINT,
  latitude double NOT NULL,
  longitude double NOT NULL,
  loc_timestamp BIGINT NOT NULL,
  PRIMARY KEY (id)
  );
  
  
  CREATE INDEX ind_lh_service_id ON location_history (service_id);
  CREATE INDEX ind_lh_cab_id ON location_history (cab_id);

  