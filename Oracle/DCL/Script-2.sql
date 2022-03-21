-- 급여를 가장 많이 받는 3명의 직원 이름 출력
select rn, first_name, salary
from ( select rownum rn, first_name, salary
       from ( select first_name, salary
              from employees
              order by salary desc)
      )
where rn >= 11 and rn <= 20;


-- 입사년도를 글자로 변환
SELECT e.HIRE_DATE 
FROM EMPLOYEES e 
WHERE TO_CHAR(e.HIRE_DATE, 'YYYY') = '2007'


-- 2007년에 입사한 사람들의 급여 내림차순 ROWNUM 부여
SELECT rownum rn,
       first_name , 
       salary , 
       hire_date 
FROM (SELECT e.first_name , e.salary , e.hire_date 
		FROM EMPLOYEES e 
	   WHERE to_char(e.HIRE_DATE , 'YYYY') = '2007'
    ORDER BY e.SALARY desc);

-- 2007년에 입사한 사람들의 급여 3위 부터 7위 까지
SELECT rn, 
       first_name , 
       salary , 
       hire_date 
FROM ( SELECT rownum rn,
       first_name , 
       salary , 
       hire_date 
		FROM (SELECT e.first_name , e.salary , e.hire_date 
				FROM EMPLOYEES e 
			   WHERE to_char(e.HIRE_DATE , 'YYYY') = '2007'
		    ORDER BY e.SALARY desc)
     )
WHERE rn >= 3 AND   rn <= 7;
