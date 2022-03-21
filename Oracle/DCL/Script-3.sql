-- 평균급여(salary)가 가장 높은 부서의
-- 직원들의 직원번호(employee_id), 이름(firt_name), 성(last_name)과  업무(job_title), 급여(salary)를¬ 조회하시오

-- 부서별 평균
SELECT e.DEPARTMENT_ID , avg(e.SALARY)
FROM EMPLOYEES e 
GROUP BY e.DEPARTMENT_ID ;

-- 부서별 평균이 가장 높은 부서는?
SELECT DEPARTMENT_ID, salary
FROM (SELECT e.DEPARTMENT_ID , avg(e.SALARY) salary
		FROM EMPLOYEES e 
		GROUP BY e.DEPARTMENT_ID )
ORDER BY 2 DESC;

;


SELECT *
FROM EMPLOYEES e, 
     (SELECT rn,
       DEPARTMENT_ID, salary
		FROM (SELECT rownum rn,
		       DEPARTMENT_ID, salary
				FROM ( SELECT DEPARTMENT_ID, salary
						FROM (SELECT e.DEPARTMENT_ID , avg(e.SALARY) salary
								FROM EMPLOYEES e 
								GROUP BY e.DEPARTMENT_ID )
						ORDER BY 2 DESC
				     )
		     )
		WHERE rn = 1) d
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID;


SELECT *
FROM EMPLOYEES e
WHERE e.DEPARTMENT_ID = 90;