SELECT SUM(salary), skills.skill FROM developers
LEFT JOIN developers_skills ON developers_skills.developer_id = developers.id
LEFT JOIN skills ON skills.id = developers_skills.skill_id
WHERE skill LIKE "Java" GROUP BY skill_id;
