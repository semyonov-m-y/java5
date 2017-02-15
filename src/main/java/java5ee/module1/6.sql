SELECT AVG(salary), projects.project, projects.cost FROM developers
LEFT JOIN projects ON developers.id = projects.developer_id
GROUP BY project ORDER BY cost LIMIT 1;
