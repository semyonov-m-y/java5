SELECT AVG(salary), projects.project FROM developers
LEFT JOIN projects ON developers.id = projects.developer_id
GROUP BY project ORDER BY AVG(salary) LIMIT 1;
