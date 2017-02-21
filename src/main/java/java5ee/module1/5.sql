SELECT SUM(cost), companies.company_name, projects.customer_id FROM projects
LEFT JOIN companies ON companies.id = projects.company_id
WHERE company_name LIKE "Luxoft"
GROUP BY customer_id ORDER BY SUM(cost) LIMIT 1;

SELECT SUM(cost), companies.company_name, projects.customer_id FROM projects
LEFT JOIN companies ON companies.id = projects.company_id
WHERE company_name LIKE "MTS"
GROUP BY customer_id ORDER BY SUM(cost) LIMIT 1;
