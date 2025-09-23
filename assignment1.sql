Que-2
create table country
    -> ( country_id int(11),
    ->  country_name varchar(20),
    ->  region_id int(11));

Que3
 create table jobs1
    -> (job_id int primary key,
    -> job_title varchar(20) not null,
    -> min_salary int,
    -> max_salary int),
-> add constraint chk_max_salary
    -> check(max_salary<=25000);

Que4
 create table job_histry1
    -> (employee_id int,
    -> start_date int,
    -> end_date int,
    -> job_id int,
    -> department_id int);