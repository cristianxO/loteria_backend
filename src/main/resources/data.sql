INSERT INTO cliente (nombre, correo) VALUES
  ('Ana Pérez', 'ana.perez@mail.com'),
  ('Carlos Gómez', 'carlos.gomez@mail.com'),
  ('Astrid Parra', 'astrid.parra@mail.com'),
  ('Juan Martínez', 'juan.martinez@mail.com'),
  ('Luisa Fernández', 'luisa.fernandez@mail.com');

INSERT INTO sorteo (nombre_sorteo, fecha_sorteo) VALUES
  ('Sorteo Verano', '2025-08-15'),
  ('Sorteo Otoño',  '2025-11-10'),
  ('Sorteo Navidad', '2025-12-20'),
  ('Sorteo Año Nuevo', '2026-01-05');

INSERT INTO billete (numero, precio, estado, cliente_id, sorteo_id) VALUES
  (101, 5000.00, 'DISPONIBLE', NULL, 1),
  (102, 5000.00, 'DISPONIBLE', NULL, 1),
  (103, 5000.00, 'DISPONIBLE', NULL, 1),
  (104, 5000.00, 'DISPONIBLE', NULL, 1),
  (105, 5000.00, 'DISPONIBLE', NULL, 1),
  (106, 5000.00, 'DISPONIBLE', NULL, 1),
  (107, 5000.00, 'DISPONIBLE', NULL, 1),
  (108, 5000.00, 'DISPONIBLE', NULL, 1),
  (109, 5000.00, 'DISPONIBLE', NULL, 1),
  (110, 5000.00, 'DISPONIBLE', NULL, 1);

INSERT INTO billete (numero, precio, estado, cliente_id, sorteo_id) VALUES
  (201, 7000.00, 'DISPONIBLE', NULL, 2),
  (202, 7000.00, 'DISPONIBLE', NULL, 2),
  (203, 7000.00, 'DISPONIBLE', NULL, 2),
  (204, 7000.00, 'DISPONIBLE', NULL, 2),
  (205, 7000.00, 'DISPONIBLE', NULL, 2),
  (206, 7000.00, 'DISPONIBLE', NULL, 2),
  (207, 7000.00, 'DISPONIBLE', NULL, 2),
  (208, 7000.00, 'DISPONIBLE', NULL, 2),
  (209, 7000.00, 'DISPONIBLE', NULL, 2),
  (210, 7000.00, 'DISPONIBLE', NULL, 2);

INSERT INTO billete (numero, precio, estado, cliente_id, sorteo_id) VALUES
  (301, 10000.00, 'DISPONIBLE', NULL, 3),
  (302, 10000.00, 'DISPONIBLE', NULL, 3),
  (303, 10000.00, 'DISPONIBLE', NULL, 3),
  (304, 10000.00, 'DISPONIBLE', NULL, 3),
  (305, 10000.00, 'DISPONIBLE', NULL, 3),
  (306, 10000.00, 'DISPONIBLE', NULL, 3),
  (307, 10000.00, 'DISPONIBLE', NULL, 3),
  (308, 10000.00, 'DISPONIBLE', NULL, 3),
  (309, 10000.00, 'DISPONIBLE', NULL, 3),
  (310, 10000.00, 'DISPONIBLE', NULL, 3);

INSERT INTO billete (numero, precio, estado, cliente_id, sorteo_id) VALUES
  (401, 12000.00, 'DISPONIBLE', NULL, 4),
  (402, 12000.00, 'DISPONIBLE', NULL, 4),
  (403, 12000.00, 'DISPONIBLE', NULL, 4),
  (404, 12000.00, 'DISPONIBLE', NULL, 4),
  (405, 12000.00, 'DISPONIBLE', NULL, 4),
  (406, 12000.00, 'DISPONIBLE', NULL, 4),
  (407, 12000.00, 'DISPONIBLE', NULL, 4),
  (408, 12000.00, 'DISPONIBLE', NULL, 4),
  (409, 12000.00, 'DISPONIBLE', NULL, 4),
  (410, 12000.00, 'DISPONIBLE', NULL, 4);

  INSERT INTO billete (numero, precio, estado, cliente_id, sorteo_id) VALUES
    (10011, 5000.00, 'VENDIDO', 1, 1),
    (10012, 5000.00, 'VENDIDO', 1, 1),
    (10013, 5000.00, 'VENDIDO', 1, 2),
    (10014, 5000.00, 'VENDIDO', 1, 2),

    (20011, 7000.00, 'VENDIDO', 2, 1),
    (20012, 7000.00, 'VENDIDO', 2, 1),
    (20013, 7000.00, 'VENDIDO', 2, 3),
    (20014, 7000.00, 'VENDIDO', 2, 3),

    (30011, 10000.00, 'VENDIDO', 3, 2),
    (30012, 10000.00, 'VENDIDO', 3, 2),
    (30013, 10000.00, 'VENDIDO', 3, 4),
    (30014, 10000.00, 'VENDIDO', 3, 4),

    (40011, 12000.00, 'VENDIDO', 4, 3),
    (40012, 12000.00, 'VENDIDO', 4, 3),
    (40013, 12000.00, 'VENDIDO', 4, 4),
    (40014, 12000.00, 'VENDIDO', 4, 4),

    (50011, 15000.00, 'VENDIDO', 5, 4),
    (50012, 15000.00, 'VENDIDO', 5, 4),
    (50013, 15000.00, 'VENDIDO', 5, 1),
    (50014, 15000.00, 'VENDIDO', 5, 1);
