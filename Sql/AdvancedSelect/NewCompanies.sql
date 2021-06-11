SELECT a.company_code, a.founder, COUNT(DISTINCT b.lead_manager_code), COUNT(DISTINCT b.senior_manager_code),
COUNT(DISTINCT b.manager_code), COUNT(DISTINCT b.employee_code)
FROM company a
INNER JOIN employee b
ON a.company_code = b.company_code
GROUP BY a.company_code, a.founder
ORDER BY a.company_code;
