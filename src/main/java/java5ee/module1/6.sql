SELECT AVG(salary), projects.project_name FROM developers
LEFT JOIN projects ON developers.project_id = projects.id
GROUP BY project_name ORDER BY cost LIMIT 1;
