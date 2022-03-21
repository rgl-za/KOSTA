SELECT e.SALARY
FROM EMPLOYEES e 
WHERE e.FIRST_NAME ='Den'

SELECT e.FIRST_NAME, e.SALARY 
FROM EMPLOYEES e 
WHERE e.SALARY > 11000


SELECT e.EMPLOYEE_ID, e.FIRST_NAME, e.SALARY  
FROM EMPLOYEES e 
WHERE e.SALARY > (SELECT e2.SALARY 
				  FROM EMPLOYEES e2 
				  WHERE e2.FIRST_NAME= 'Den');
		
				 
				 
SELECT e.FIRST_NAME, e.SALARY 
FROM EMPLOYEES e 
WHERE e.SALARY < (SELECT min(e2.salary)
				 FROM EMPLOYEES e2);
				 

SELECT e.FIRST_NAME, e.SALARY
FROM EMPLOYEES e 
WHERE SALARY < (SELECT avg(e2.SALARY)
				FROM EMPLOYEES e2);
				
			
			
-- 내가 푼 방법... 안나옴ㅁ (부서별 최고급여 사원)			
SELECT e.DEPARTMENT_ID, e.FIRST_NAME, e.SALARY 
FROM EMPLOYEES e 
WHERE e.SALARY > ALL (SELECT max(e2.SALARY) SALARY 
				  FROM EMPLOYEES e2, DEPARTMENTS d
				  WHERE e2.DEPARTMENT_ID = d.DEPARTMENT_ID);

				 
				 
SELECT e.DEPARTMENT_ID, e.EMPLOYEE_ID, e.FIRST_NAME, e.SALARY  
FROM EMPLOYEES e 
WHERE (e.DEPARTMENT_ID, e.SALARY) IN (SELECT e2.DEPARTMENT_ID, MAX(e2.SALARY) 
									  FROM EMPLOYEES e2 
									  GROUP BY DEPARTMENT_ID);
									 
									 
									 
-- 서브쿼리도 임시 테이블이 만들어지기 때문에 테이블로 봄... 그래서 as 도 가능하고 조인도 가능함!
-- ex
select e.department_id, e.employee_id, e.first_name, e.salary
from employees e, (SELECT DEPARTMENT_ID, max(SALARY) SALARY 
				   FROM EMPLOYEES  
				   GROUP BY DEPARTMENT_ID) s
where e.department_id = s.department_id and e.salary = s.salary;	



-- 내가 푼 방법... fuck
SELECT e.JOB_ID,  SUM(e.SALARY) 
FROM EMPLOYEES e, JOBS j 
WHERE(e.JOB_ID, j.JOB_TITLE)  IN ( SELECT j2.JOB_ID, j2.JOB_TITLE  
								   FROM JOBS j2 
								   GROUP BY j2.JOB_TITLE);
				
				

-- 직급별 급여총합
select j.job_title, t.salary
from jobs j, ( select job_id, sum(salary) salary
             from employees
             group by job_id ) t
where j.job_id = t.job_id
order by salary desc;
				


SELECT e.EMPLOYEE_ID , e.LAST_NAME 
FROM EMPLOYEES e 
WHERE (e.EMPLOYEE_ID e.SALARY) IN (SELECT e2.EMPLOYEE_ID, AVG(e2.SALARY)
                      			   FROM EMPLOYEES e2);
                      			  
                      			  
                      			 
-- 내가 잘못 방향을 잡고 있나???                      			  
SELECT e.EMPLOYEE_ID, e. LAST_NAME, e.SALARY 
FROM EMPLOYEES e, (SELECT e.DEPARTMENT_ID  , avg(SALARY) salary
					FROM EMPLOYEES e
					group BY e.DEPARTMENT_ID) e2
WHERE e.DEPARTMENT_ID  = e2.department_id  AND e.SALARY > e2.salary ;




				
