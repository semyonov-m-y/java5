SELECT SUM(salary), projects.project_name FROM developers 
LEFT JOIN projects ON developers.project_id = projects.id
GROUP BY project_name ORDER BY SUM(salary) DESC LIMIT 1;
