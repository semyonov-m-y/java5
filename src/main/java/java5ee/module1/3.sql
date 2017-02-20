SELECT SUM(salary) FROM javaee.developers
LEFT JOIN javaee.developers_skills ON javaee.developers_skills.developer_id = javaee.developers.id 
WHERE skill_id = 2 GROUP BY skill_id;
