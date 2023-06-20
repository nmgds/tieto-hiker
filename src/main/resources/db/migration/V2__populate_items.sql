insert into item (name, type, weight, season, required_per_day)
values ('Water', 'FOOD', 1000, NULL, 2),
       ('Apple', 'FOOD', 200, NULL, 2),
       ('Canned meat', 'FOOD', 300, NULL, 2),
       ('Bread', 'FOOD', 300, NULL, 1),
       ('Power bar', 'FOOD', 100, NULL, 3),
       ('Tea', 'FOOD', 10, 'COLD', 1),

       ('Matches', 'EQUIPMENT', 10, NULL, NULL),
       ('Sleeping bag', 'EQUIPMENT', 1000, 'WARM', NULL),
       ('Warm sleeping bag', 'EQUIPMENT', 2000, 'COLD', NULL),
       ('Tent', 'EQUIPMENT', 5000, NULL, NULL),
       ('Knife', 'EQUIPMENT', 200, NULL, NULL),
       ('Sun cream', 'EQUIPMENT', 100, 'WARM', NULL),
       ('Bug repellent', 'EQUIPMENT', 100, 'WARM', NULL),

       ('Socks', 'OUTFIT', 100, 'WARM', 1),
       ('Warm socks', 'OUTFIT', 150, 'COLD', 1),
       ('Underwear', 'OUTFIT', 100, NULL, 1),
       ('T-shirt', 'OUTFIT', 200, 'WARM', 1),
       ('Termo T-shirt', 'OUTFIT', 300, 'COLD', 1);

