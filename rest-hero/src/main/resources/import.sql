-- tag::adocSQL[]
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Chewbacca', '', 'https://www.superherodb.com/pictures2/portraits/10/050/10466.jpg', 'Agility, Longevity, Marksmanship, Natural Weapons, Stealth, Super Strength, Weapons Master', 5);
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Angel Salvadore', 'Angel Salvadore Bohusk', 'https://www.superherodb.com/pictures2/portraits/10/050/1406.jpg', 'Animal Attributes, Animal Oriented Powers, Flight, Regeneration, Toxin and Disease Control', 4);
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Bill Harken', '', 'https://www.superherodb.com/pictures2/portraits/10/050/1527.jpg', 'Super Speed, Super Strength, Toxin and Disease Resistance', 6);
-- end::adocSQL[]
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Warlock (Infinity Gauntlet)', 'Adam Warlock', 'https://www.superherodb.com/pictures2/portraits/11/050/13426.jpg',
        'Astral Projection, Biokinesis, Duplication, Element Control, Energy Beams, Energy Manipulation, Immortality, Matter Manipulation, Mind Control, Molecular Manipulation, Nigh-Omnipresent, Portal Creation, Reality Warping, Regeneration, Size Changing, Spatial Awareness, Super Speed, Super Strength, Telekinesis, Telepathy, Teleportation, Time Manipulation, Time Travel, Weather Control', 74);
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Shazam (New 52)', 'Billy Batson', 'https://www.superherodb.com/pictures2/portraits/10/050/14714.jpg', 'Accelerated Healing, Durability, Element Control, Energy Absorption, Energy Blasts, Fire Resistance, Flight, Illumination, Invulnerability, Levitation, Magic, Marksmanship, Super Speed, Super Strength', 14);
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Galadriel', '', 'https://www.superherodb.com/pictures2/portraits/11/050/11796.jpg', 'Danger Sense, Immortality, Intelligence, Invisibility, Magic, Precognition, Telekinesis, Telepathy', 17);
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Wonder Woman (DCEU)', 'Diana Prince', 'https://www.superherodb.com/pictures2/portraits/11/050/12529.jpg', 'Energy Absorption, Energy Manipulation, Enhanced Hearing, Enhanced Memory, Enhanced Senses, Enhanced Sight, Enhanced Smell, Enhanced Touch, Flight, Immortality, Regeneration, Super Speed, Super Strength, Telekinesis', 14);
INSERT INTO hero(id, name, otherName, picture, powers, level)
VALUES (nextval('hibernate_sequence'), 'Wong (MCU)', 'Wong', 'https://www.superherodb.com/pictures2/portraits/11/050/13900.jpg', 'Astral Projection, Astral Travel, Dimensional Travel, Force Fields, Illusions, Magic, Teleportation', 7);