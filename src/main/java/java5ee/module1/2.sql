SELECT  project, MAX(SUM(salary)) FROM sqldatabase.developers LEFT JOIN sqldatabase.projects ON developers.id = projects.developer_id GROUP BY project;
