use testdb;

--  SQL문 주석문

-- 1. 테이블내의 모든 데이터 보기
 SELECT * FROM dept;
 
 SELECT * 
 FROM dept;
 
select * 
from dept;

-- 2. mysql 에서는 from 절 생략 가능 ( Oracle에서는 from절 생략 불가)
select  3455663 * 2245667;

select  3455663 * 2245667
from dual;  -- dummy table

select  now();

select  now()
from dual; 

-- 3. 특정 컬럼 데이터 보기
-- select 절에 지정된 컬럼순서대로 출력된다.
-- select 절에 지정된 표현식 그대로 컬럼헤더에 출력된다.
SELECT empno, ename, job, hiredate
FROM emp;
 
 SELECT ename, empno,  job, hiredate,  sal+10
FROM emp;
 
--  limit 은  ANSI 아님
-- 4. 출력할 데이터 갯수 제한1 : limit len 
SELECT empno, ename, job, hiredate
FROM emp
limit 3;

-- 4. 출력할 데이터 갯수 제한2 : limit start , len 
SELECT empno, ename, job, hiredate
FROM emp
limit  0 , 5;  -- 0 부터 5개 
