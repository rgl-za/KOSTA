select first_name, hire_date 
from employees
where hire_date >= '04/01/01' and hire_date <= '05/12/31';


select first_name, salary
from employees
where salary between 14000 and 17000;



select first_name, salary
from employees
where salary in (2100, 3100, 4100, 5100);



select first_name, last_name, salary
from employees
where first_name like 'L%';


select first_name, salary
from employees
where first_name like '%am%';


select first_name, salary
from employees
where first_name like '_a%';


select first_name
from employees
where first_name like '___a%';


select first_name, salary
from employees
where first_name like '__a_';


select *
from employees;


select first_name, salary, commission_pct, salary*commission_pct
from employees
where salary between 13000 and 15000;


select first_name, salary, commission_pct
from employees
where commission_pct is null;


select first_name, salary, commission_pct
from employees
where commission_pct is not null;


select first_name
from employees
where manager_id is null and commission_pct is null;



select first_name, salary
from employees
order by salary asc;



select first_name, salary
from employees
order by salary desc;



select department_id, salary, first_name
from employees
order by department_id asc;



select first_name, salary
from employees
where salary >= 5000
order by salary desc;


select department_id, salary, first_name
from employees
order by department_id, salary desc;



select first_name,
       lpad(first_name, 10, '*'),
       rpad(first_name, 10, '*')
from employees;



select trunc(123.346,2) "r2",
       trunc(123.456, 0) "r0",
       trunc(123.456, -1) "r-1"
from dual;
