SELECT SUM(salary), projects.project FROM developers 
LEFT JOIN projects ON developers.project_id = projects.id
GROUP BY project ORDER BY SUM(salary) DESC LIMIT 1;
