SELECT  cost, MIN(SUM(salary)) FROM sqldatabase.customers LEFT JOIN sqldatabase.projects ON customers.id = projects.customer_id GROUP BY cost;
