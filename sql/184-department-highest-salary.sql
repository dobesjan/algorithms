SELECT d.name AS Department, e.name AS Employee, e.Salary
FROM Employee e
         INNER JOIN Department d ON e.departmentId = d.id
WHERE e.Salary = (
    SELECT MAX(e2.Salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId
);
