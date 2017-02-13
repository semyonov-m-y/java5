ALTER TABLE projects ADD cost INT NULL;

UPDATE projects SET cost = 1000000 WHERE project LIKE 'RFC 231456';
UPDATE projects SET cost = 2000000 WHERE project LIKE 'Main SIRIUS menu';
UPDATE projects SET cost = 3000000 WHERE project LIKE 'Patch to PFR functional';
UPDATE projects SET cost = 4000000 WHERE project LIKE 'SAMO';
UPDATE projects SET cost = 5000000 WHERE project LIKE 'China Union Pay';