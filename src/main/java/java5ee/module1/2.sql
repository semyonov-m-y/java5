SELECT SUM(salary), projects.project FROM developers 
LEFT JOIN projects ON developers.id = projects.developer_id
GROUP BY project ORDER BY SUM(salary) DESC LIMIT 1;
