INSERT INTO CAR (id, MODEL_NAME, CAR_SEGMENT, description, introduced, engine, power, available)
    VALUES (1, 'Ford Focus', 'C', 'Fords Compact car based on global C-car platform', 1998, '1l', 134, true);

INSERT INTO CAR (id, MODEL_NAME, CAR_SEGMENT, description, introduced, engine, power, available)
    VALUES (2, 'Ford Fiesta', 'D', '', 1998, '1.5l', 100, true);

INSERT INTO VERSION (CAR_ID, ID, NAME) VALUES (1, 1, 'Ford Focus v1');
INSERT INTO VERSION (CAR_ID, ID, NAME) VALUES (1, 2, 'Ford Focus v2');
INSERT INTO VERSION (CAR_ID, ID, NAME) VALUES (1, 3, 'Ford Focus v3');
INSERT INTO VERSION (CAR_ID, ID, NAME) VALUES (2, 4, 'Ford Fiesta v1');
INSERT INTO VERSION (CAR_ID, ID, NAME) VALUES (2, 5, 'Ford Fiesta v2');
