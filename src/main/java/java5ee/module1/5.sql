SELECT SUM(cost), javaee.companies.company_name, javaee.projects.customer_id FROM javaee.projects
LEFT JOIN javaee.companies ON javaee.companies.id = javaee.projects.company_id
WHERE company_name LIKE "Luxoft"
GROUP BY customer_id ORDER BY SUM(cost) LIMIT 1;

SELECT SUM(cost), javaee.companies.company_name, javaee.projects.customer_id FROM javaee.projects
LEFT JOIN javaee.companies ON javaee.companies.id = javaee.projects.company_id
WHERE company_name LIKE "MTS"
GROUP BY customer_id ORDER BY SUM(cost) LIMIT 1;
