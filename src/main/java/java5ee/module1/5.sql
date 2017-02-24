SELECT MIN(profit), company_name, customer_id FROM (
SELECT SUM(cost) AS profit, companies.company_name, projects.customer_id 
FROM projects
LEFT JOIN companies ON companies.id = projects.company_id
GROUP BY customer_id, company_id) AS item
GROUP BY company_name;
