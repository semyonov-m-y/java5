SELECT AVG(salary), projects.project, projects.cost FROM developers
LEFT JOIN projects ON developers.project_id = projects.id
GROUP BY project ORDER BY cost LIMIT 1;
