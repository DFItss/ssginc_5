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

-- 5. 연산 가능  ( +, - , *, /, %(나머지))
-- % : mysql 에서 지원, 대신  mod( ) 함수 추천
SELECT empno, ename,   sal,  sal * 1.1,  ROUND(sal * 1.1),  ROUND(sal * 1.1, 2) 
 FROM emp;

SELECT empno, ename,   sal,  sal + 10, sal-10, sal*1.1 , sal / 3,  sal % 3,  mod(sal, 3)
 FROM emp;
 
 -- 6. 별칭
 -- 컬럼헤더값을 별칭으로 출력
 -- 문법:  표현식 as  별칭,    as 생략 가능(권장안함)
 -- 필요시  "별칭" 사용. (권장),   '별칭' (홑따옴표 가능하지만 사용 안하는 것으로)
SELECT empno AS 사번, ename AS 성명,  sal 급여 , sal * 12  as 연봉
FROM emp;

SELECT empno AS "사 번", ename AS "성명",  sal "급여" , sal * 12  as "연봉"
FROM emp;

-- 7. 리터럴 (literal)
-- 문자(열)값, 날짜값:  반드시 '' (홑따옴표) 사용
-- 수치값:    10   3.14
SELECT empno , 10, 3.15 , 'hello', '2024-03-23'
FROM emp;

-- 8.  null 값
-- null 값의 연산결과는 null 값이 반환된다. (******)
-- ifnull (컬럼명, 기본값) 사용하여 null 값인 경우 기본값으로 처리 가능.
SELECT empno, ename,   sal,  comm,  (sal * 12) + comm as "연봉", 
            (sal*12) + ifnull(comm, 0) as "연봉"
 FROM emp;

-- 9. 중복제거 
--  distinct 키워드 이용
SELECT distinct job
FROM emp;
 
-- 10. where 절에 사용하는  연산자
-- 1) 비교연산자 ( =, !=, >, >= , <, <= )
 SELECT empno, ename, job, deptno , sal
 FROM emp
 WHERE sal <= 1000;

 SELECT empno, ename, job, deptno , sal
 FROM emp
 WHERE ename = 'SMITH';

 SELECT empno, ename, job, deptno , sal
 FROM emp
 WHERE ename = 'smith';   -- 리터럴값은 oracle에서는 대소문자 구별됨.
-- 
 SELECT empno, ename, job, deptno , sal, hiredate
 FROM emp
 WHERE hiredate = '1980-12-17';
 
  SELECT empno, ename, job, deptno , sal, hiredate
 FROM emp
 WHERE hiredate > '1982-12-17';
 
 -- 2) 비교연산자  : Between A and B 
  SELECT empno, ename, job, deptno, sal
 FROM emp
 WHERE sal BETWEEN 800 AND 2000;
 
 SELECT empno, ename, job, deptno , sal, hiredate
 FROM emp
 WHERE hiredate BETWEEN '1980-01-11' AND '1982-12-17';
 
 SELECT empno, ename, job, deptno , sal, hiredate
 FROM emp
 WHERE ename BETWEEN 'Adam' AND 'Dartin';
 
-- 3 ) 비교연산자 :      in ( 값, 값2, 값3) 
 SELECT empno, ename, sal
 FROM emp
 WHERE empno IN (7369,7566,7698);
 
 SELECT empno, ename, sal
 FROM emp
 WHERE ename IN ( 'SMITH', 'FORD', '홍길동');
 
  SELECT empno, ename, sal, hiredate
 FROM emp
 WHERE hiredate IN ( '1980-12-17', '1980-01-11');
 
 
 -- 4) like 연산자 :   % ,  _  패턴문자(와일드 카드문자)와 같이 사용
 SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE'A%';
 
 SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE '%T%';

SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE '_L%';
 
-- 5)  is null 연산자:   null 값 조회
SELECT empno, ename, sal, comm
 FROM emp
 where comm IS NULL;
 
 SELECT empno, ename, sal, comm, mgr
 FROM emp
 where mgr IS NULL;
 
 
-- 6) 논리 연산자;   and  , or  , not 
SELECT empno, ename, job, deptno, hiredate, sal
 FROM emp
 WHERE job = 'salesman'AND sal >= 1500;

SELECT empno, ename, job, deptno, hiredate, sal
 FROM emp
 WHERE job = 'salesman' or  sal >= 1500;
 
 
  SELECT empno, ename, sal, comm, job
 FROM emp
 WHERE comm IS NOT NULL;
 
  SELECT empno, ename, job, deptno , sal
 FROM emp
 WHERE NOT ename = 'SMITH';
 
   SELECT empno, ename, job, deptno, sal
 FROM emp
 WHERE sal NOT BETWEEN 800 AND 2000;
 
  SELECT empno, ename, sal
 FROM emp
 WHERE ename NOT IN ( 'SMITH', 'FORD', '홍길동');
 
  SELECT empno, ename, sal
 FROM emp
 WHERE ename NOT LIKE'A%';
 
 -- 11. 정렬
 use testdb;
 SELECT empno, ename, hiredate
 FROM emp
 ORDER BY hiredate;
 
  SELECT empno, ename, hiredate
 FROM emp
 ORDER BY hiredate desc;
 
  SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY Annual;
 
   SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY sal * 12;
 
  SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY 3;
 
 -- 다중 정렬
  SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY 3, 1 asc;
 
   SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY Annual, empno asc;
 
 -- 2 일차 함수
 -- 1. 단일행함수 - 문자 데이터
 
 SELECT empno, ename, lower(ename), LOWER('HeLLO')
 FROM emp;
 
 SELECT empno, ename, UPPER(ename), UPPER('HeLLO')
 FROM emp;
 
  SELECT empno, CONCAT(ename, ' ', sal) as "ename_sal"
 FROM emp;
 
  SELECT empno, CONCAT_WS('/', ename, sal)
 FROM emp;
 
 SELECT empno, LPAD(ename,10, '*'), LPAD(sal, 10, '*')
 FROM emp;
 
 SELECT empno, RPAD(ename,10, '*'), RPAD(sal, 10, '*')
 FROM emp;
 
 SELECT empno, ename, SUBSTR(ename,1,2), SUBSTR(ename,3), SUBSTR(ename,-1)
 FROM emp;
 
  SELECT empno, ename, SUBSTRING(ename,1,2), SUBSTRING(ename,3), SUBSTRING(ename,-1)
 FROM emp;
 
 SELECT empno, ename, LENGTH(ename)
 FROM emp;
 
  SELECT empno, ename, sal, REPLACE(sal, '0','o')
 FROM emp;
 
  --  자바의 indexOf 역할. 차이점은 자바는 없으면 -1,   MySQL 0 반환
  SELECT INSTR('foobarbar', 'bar'), INSTR('foobarbar', 'xbar');
  
  
  -- oracle: 공백 및 특정문자 삭제 가능.
  -- mysql: 공백만 삭제 가능
  SELECT LTRIM('     bar     '), LENGTH(LTRIM('     bar     '));
   SELECT RTRIM('     bar     '), LENGTH(RTRIM('     bar     '));
   
    SELECT TRIM('     bar     '),
 TRIM(BOTH FROM '     bar     '),
 TRIM(LEADING FROM '     bar     '),
 TRIM(TRAILING FROM '     bar     ');
   
    SELECT TRIM('xxxbarxxx'),
 TRIM(BOTH 'x' FROM 'xxxbarxxx'),
 TRIM(LEADING 'x' FROM 'xxxbarxxx'),
 TRIM(TRAILING 'x' FROM 'xxxbarxxx');	
 
  SELECT ename, REVERSE(ename)
 FROM emp;
 
  SELECT FORMAT(9876543.2145, 2), FORMAT(9876543.2145, 2, 'en_US'),
             FORMAT(9876543.2145, 2, 'ko_KR');
  
  