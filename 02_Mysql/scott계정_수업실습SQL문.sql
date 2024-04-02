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
  
  --  삽입 :  INSERT(str,pos,len,newstr) ==> 지정된 위치에 len만큼  newstr로 치환된다.
   SELECT  INSERT('abcdefg', 1, 4, '####');
  
  -- 왼쪽부분열 : LEFT(str,len) , 오른쪽 부분열: RIGHT(str,len)
     SELECT LEFT('foobarbar', 5);
     SELECT RIGHT('foobarbar', 4);
  
  -- 문자열 반복: REPEAT(str,count)
  SELECT REPEAT('MySQL', 3) end;
-- #############################################################
   -- 2. 단일행함수 - 숫자 데이터
   -- https://docs.oracle.com/cd/E17952_01/mysql-8.0-en/numeric-functions.html
SELECT ROUND(45.678), ROUND(45.678, 2) , ROUND(45.678,-1) ;
   
SELECT ROUND(45.678), ROUND(45.678, 2) , ROUND(45.678,-1) FROM DUAL;
   
-- oracle : trunc(값 [, 자릿수])   
SELECT TRUNCATE(45.678, 0), TRUNCATE(45.678, 2) , TRUNCATE(45.678,-1)
FROM DUAL;

 SELECT CEIL(45.178), CEIL(-45.178);
 SELECT FLOOR(45.178), FLOOR(-45.178);
 
 -- oracle :  % 지원안됨.  mod()만 지원
  SELECT MOD(10, 3), 10%3 , 10 MOD 3 FROM DUAL;
  
   SELECT SIGN(-1.200), SIGN(34.3), SIGN(0) FROM DUAL;
  
  #############################################################
   -- 3. 단일행함수 - 날짜 데이터
  
 -- 1) 현재 날짜 출력,  포맷: YYYY-MM-DD
  SELECT CURDATE(), CURRENT_DATE(), CURRENT_DATE 
  FROM DUAL;

-- 2) 현재 시간 출력, 포맷:  hh:mm:ss
 SELECT CURTIME(), CURRENT_TIME(), CURRENT_TIME
 FROM DUAL;
 
 -- 3) 현재날짜와 시간 출력, 포맷: YYYY-MM-DD hh:mm:ss
 -- oracle:  sysdate  소괄호 없음
  SELECT SYSDATE(), NOW() FROM DUAL;
 
  -- SYSDATE()  vs  NOW()
   --  SYSDATE():  함수가 실행되는 시간을 반환
  --  NOW():  sql 명령문이 실행되는 시간을 반환
   SELECT NOW(), sleep(2), NOW() FROM DUAL;
   SELECT SYSDATE(), sleep(2), SYSDATE() FROM DUAL;
  
  -- 4) ADDDATE(date,days), 날짜에 일(day) 더하거나 빼기
   SELECT ADDDATE('2008-01-02', 30),  ADDDATE('2008-01-02', -30);
  SELECT ADDDATE(now(), 30),  ADDDATE(now(), -30);
  
-- 4) ADDDATE(date , interval 값  unit )
  SELECT ADDDATE(now(),  INTERVAL 1 DAY),
             ADDDATE(now(),  INTERVAL 1 MONTH),
             ADDDATE(now(),  INTERVAL 1 YEAR),
             now(),
             ADDDATE(now(),  INTERVAL 2 HOUR),
             ADDDATE(now(),  INTERVAL 3 MINUTE)
 FROM dual;
  
  
SELECT DATE_ADD('2008-01-02', INTERVAL 1 DAY) as A1,
 DATE_ADD('2008-01-02', INTERVAL 1 MONTH) as A2,
 DATE_ADD('2008-01-02', INTERVAL 1 YEAR) as A3,
 NOW() as A4,
 DATE_ADD(NOW(), INTERVAL 10 MINUTE) as A5,
 DATE_ADD(NOW(), INTERVAL 2 HOUR) as A6;
 
  SELECT DATE_SUB('2008-01-02', INTERVAL 1 DAY) as B1,
 DATE_SUB('2008-01-02', INTERVAL 1 MONTH) as B2,
 DATE_SUB('2008-01-02', INTERVAL 1 YEAR) as B3,
 NOW() as B4,
 DATE_SUB(NOW(), INTERVAL 10 MINUTE) as B5,
 DATE_SUB(NOW(), INTERVAL 2 HOUR) as B6;
 
 
 
 --  5)  두 날짜간의 일(day) 수 계산
  SELECT DATEDIFF('2023-01-04', '2022-01-04');
  
  -- 6) 날짜에 지정된 단위(unit)만큼 차이를 반환한다
   SELECT TIMESTAMPDIFF(HOUR, '2020-3-1', '2020-3-3') AS C1,
			 TIMESTAMPDIFF(DAY, '2020-3-1', '2020-3-3') AS C2,
			 TIMESTAMPDIFF(MONTH, '2020-2-1', '2020-6-3') AS C3,
			 TIMESTAMPDIFF(YEAR, '2020-3-1', '2022-3-3') AS C4;
  
  -- 7) 월의 마지막 날짜 반환 
  -- oracle 지원
  SELECT LAST_DAY('2003-02-05'), LAST_DAY(NOW());

  -- 8) 날짜에서 특정 unit에 해당하는 정보 반환
  -- oracle 지원
   SELECT NOW(),
			 EXTRACT(SECOND FROM NOW()),
			 EXTRACT(MINUTE FROM NOW()),
			 EXTRACT(HOUR FROM NOW()),
			 EXTRACT(DAY FROM NOW()),
			 EXTRACT(MONTH FROM NOW()),
			 EXTRACT(YEAR FROM NOW()),
			 EXTRACT(YEAR_MONTH FROM NOW());
             
--  9) 날짜데이터를 문자열로 특정 포맷지정해서 반환  : DATE_FORMAT(date,format)           
-- oracle:  TO_CHAR (datetime, fmt)
SELECT NOW(),
			 DATE_FORMAT(NOW(),'%Y%m%d'),
			 DATE_FORMAT(NOW(),'%Y/%m/%d'),
			 DATE_FORMAT(NOW(),'%Y년%m월 %d일'),
			 DATE_FORMAT(NOW(),'%H:%i:%S'),
			 DATE_FORMAT(NOW(),'%Y');

-- 10)  문자데이터를 날짜로 반환:  STR_TO_DATE(str,format)
-- oracle:  TO_DATE( str, fmt )
 SELECT STR_TO_DATE('2020-03-04','%Y-%m-%d'),
			 STR_TO_DATE('01,5,2013','%d,%m,%Y'),
			 STR_TO_DATE('2020년03월05일','%Y년%m월%d일'),
			 STR_TO_DATE('2020-03-04 12:23:32','%Y-%m-%d %H:%i:%S');


-- 11) 조건문 :  case 문
-- ANSI 
 --  가. 동등비교하는 case 문

  SELECT empno, ename, sal, job,
				 CASE job   WHEN 'ANALYST' THEN sal * 1.1
								 WHEN 'CLERK' THEN sal * 1.2
								 WHEN 'MANAGER' THEN sal * 1.3
								 WHEN 'PRESIDENT' THEN sal * 1.4
								 WHEN 'SALESMAN' THEN sal * 1.5
				                ELSE sal
				 END AS 실수령
FROM emp;
 
 --  나. 부등 비교하는 case 문 
 -- when 절에는 모든 연산자 사용가능( between A and B, in, like, and, or, not )
  SELECT empno, ename, sal,
			 CASE WHEN sal > 3500  THEN '이사급'
					 WHEN sal > 2500 THEN '과장급'
					 ELSE '사원급' 
				END AS 직급
FROM emp;
 

 SELECT sal, IF(sal > 2500 , '과장이상급', '사원급')
 FROM emp;

--  12) 형변환 함수
select '10',
        cast('10' as SIGNED ),
        cast('10' as SIGNED  INTEGER ),
        cast(100 as char ),
        cast(100 as float ),
        cast('24-03-29' as DATE ),
        cast('240329' as DATE ),
        cast('24-03-29 03:23:34' as DATETIME )
from dual;

select '10',
        convert('10' , SIGNED ),
        convert(100 , char ),
        convert('24-03-29' , DATE )
from dual;

--  4. 그룹 함수
SELECT AVG(sal), MAX(sal), MIN(sal), SUM(sal), count(sal)
 FROM emp
 WHERE job = 'SALESMAN';
 
 
 SELECT COUNT(*), COUNT(comm),
			AVG(comm), AVG(IFNULL(comm,0)),
            avg(sal), avg(DISTINCT sal),
			COUNT(deptno), COUNT(DISTINCT deptno)
 FROM emp;
 
 SELECT deptno, AVG(sal), MAX(sal), MIN(sal), SUM(sal), count(sal)
 FROM emp
 group by deptno;

  SELECT deptno, sal, AVG(sal), MAX(sal), MIN(sal), SUM(sal), count(*)
 FROM emp
 group by deptno, sal
 having avg(sal) > 2000
 order by 1, 2;
 
  SELECT deptno as no, AVG(sal), MAX(sal), MIN(sal), SUM(sal), count(sal)
 FROM emp
 group by 1;
 
 
 SELECT deptno, sal, AVG(sal), MAX(sal), MIN(sal), SUM(sal), count(*)
 FROM emp
 where sal > 1500
 group by deptno, sal
 having avg(sal) > 2000
 order by 1, 2;
 
 select deptno, sal, AVG(sal), MAX(sal), MIN(sal), SUM(sal), count(*)
 from emp
 where sal > 1500
 group by deptno, sal
 having avg(sal) > 2000
 order by avg(sal), 2;

-- 조인1 - inner 조인

-- 1) cross join
SELECT empno, ename, dname
FROM emp CROSS JOIN dept;
 
 -- 2 ) natural join
 SELECT empno, ename, sal, dname, loc, deptno
 FROM emp NATURAL JOIN dept;
 


SELECT empno, ename, sal, dname, loc, deptno
 FROM emp e NATURAL JOIN dept d;
 
 -- oracle 에서는 공통컬럼에 별칭사용불가 
 SELECT e.empno, e.ename, e.sal, d.dname, d.loc, deptno
 FROM emp e NATURAL JOIN dept d;
 
  -- 검색조건
 SELECT empno, ename, sal, dname, loc, deptno
 FROM emp NATURAL JOIN dept
 where deptno = 30;
 
 -- 3) using 절
  SELECT empno, ename, dname
 FROM emp INNER JOIN dept USING(deptno);
 
SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e JOIN dept d USING(deptno);
 
 -- 4) on 절
 -- 공통컬럼인 deptno는 반드시 별칭사용해야 된다.
  SELECT e.empno, e.ename, d.dname, loc , e.deptno, sal
 FROM emp e JOIN dept d ON e.deptno = d.deptno;
 
 
 
 
 
 SELECT empno, ename, dname, loc , sal, e.deptno
 FROM emp e JOIN dept d ON e.deptno = d.deptno
 WHERE sal > 2500;
 
 -- sal 등급 구하기 ( 부등 조인: non-equi 조인 )
 select empno, ename, sal , grade
 from  emp e join  salgrade s  on e.sal  BETWEEN s.losal AND  s.hisal;
 
  select empno, ename, sal , grade, dname
 from  emp e JOIN dept d ON e.deptno = d.deptno
                  join  salgrade s  on e.sal  BETWEEN s.losal AND  s.hisal;
 
 
 -- self 조인 ( 사원의 관리자명 출력)
  SELECT e.ename as 사원, m.ename as 관리자
FROM emp e JOIN emp m ON e.mgr = m.empno;


-- 조인 2 - outer 조인

SELECT empno, ename, dname, d.deptno
 FROM emp e RIGHT OUTER JOIN dept d ON e.deptno = d.deptno;

SELECT empno, ename, dname, d.deptno
 FROM emp e LEFT OUTER JOIN dept d ON e.deptno = d.deptno;
 
INSERT INTO emp VALUES ( 9000, 'TEST','SALESMAN', 7499,
 '90/01/01', 600, NULL, NULL );
 COMMIT;
 
 -- 신입사원 과  부서번호 40 같이 출력하자.
 SELECT empno, ename, dname, d.deptno
 FROM emp e RIGHT OUTER JOIN dept d ON e.deptno = d.deptno
 union
SELECT empno, ename, dname, d.deptno
 FROM emp e LEFT OUTER JOIN dept d ON e.deptno = d.deptno;
 
   select sal
	from emp
	where ename = 'scott';
    
           select *
	from emp
	where sal >= 3000;
    
    
    
     SELECT MIN(sal)
 FROM emp
 GROUP BY job;
 
 
 SELECT empno, ename, job, hiredate, sal, deptno
 FROM emp
 WHERE sal IN ( SELECT MIN(sal)
 FROM emp
 GROUP BY job );
 
  SELECT empno, ename, job, hiredate, sal, deptno
 FROM emp
 WHERE EXISTS ( SELECT empno
                         FROM emp
                         WHERE sal >  10000 );
SELECT empno
                         FROM emp
                         WHERE sal >  10000;
                         
-- 다중컬럼 서브쿼리
SELECT deptno, empno, ename, sal
 FROM emp
 WHERE (deptno, sal ) IN ( SELECT deptno, MAX(sal)
 FROM emp
 GROUP BY deptno);

--  emp 와 dept 테이블에서 부서별 sal총합과 평균을 출력?
select  e.deptno, sum(sal), ROUND(avg(sal)), count(*)
from emp e join dept d on e.deptno = d.deptno  -- emp: 15개와 dept: 4개가 조인에 참여함
group by deptno;

 SELECT e.deptno, total_sum, total_avg, cnt
 FROM ( SELECT deptno, SUM(sal) total_sum, ROUND(AVG(sal)) total_avg,COUNT(*) cnt
            FROM emp
            GROUP BY deptno) e JOIN dept d ON e.deptno = d.deptno;  -- 4개의 서브쿼리 dept: 4개가 조인에 참여함

SELECT deptno, SUM(sal) total_sum, ROUND(AVG(sal)) total_avg,COUNT(*) cnt
            FROM emp
            GROUP BY deptno;
            
-- DML
-- auto commit 확인
show variables like 'autocommit%';
 show variables like 'autocommit';
 
-- auto commit 비활성화
set autocommit=false;         

use testdb;
DESC dept;   
-- 1) insert 문
INSERT INTO dept (deptno, dname, loc )
 VALUES (90, '인사과','서울');
 INSERT INTO dept (deptno, dname ) # loc 컬럼에 null 저장
VALUES (91, '인사과');
 INSERT INTO dept (loc, dname, deptno )
 VALUES ('서울', '인사과', 80);
  INSERT INTO dept
 VALUES (70, '인사과','서울');
 
  --  INSERT INTO dept
 -- VALUES (71, '인사과');  에러발생
commit;





-- 다중행 생성
 CREATE TABLE copy_emp
 AS
 SELECT empno, ename, sal FROM emp
 WHERE 1=2;

 CREATE TABLE copy_emp2
 AS
 SELECT empno, ename, sal FROM emp;

-- 서브쿼리 이용
 INSERT INTO copy_emp (empno, ename, sal)
 SELECT empno, ename, sal
 FROM emp;
 rollback;
 
 -- value_list 이용 ( *************** )
  INSERT INTO copy_emp (empno, ename, sal)
 VALUES (71, '홍길동',800), (72, '이순신',900), (73, '유관순',950);
 commit;

-- 2) update 문

 UPDATE dept
 SET dname='경리과', loc='부산'
 WHERE deptno=90;
 commit;
 
 UPDATE dept
 SET dname='경리과', loc='부산';
 rollback;
 


-- subquery 이용한 update
      UPDATE  dept , (SELECT dname              
		      FROM dept             
		      WHERE deptno = 20 ) as X,             
		      (SELECT loc             
		       FROM dept             
		       WHERE deptno = 30 ) as X2
      SET dept.dname = X.dname,    
	  dept.loc =   X2.loc
      WHERE deptno = 90;
      

-- 3) delete 문

 DELETE FROM dept
 WHERE deptno = 90;
 commit;
 
  DELETE FROM dept; -- 에러발생. 이유는 emp에서 fk로 참조하고 있기 때문에.
  
 DELETE FROM emp;
 rollback;
 


-- limit 실습

select *
from copy_emp2
order by sal desc;

delete from copy_emp2
where sal = 3000
order by empno desc
limit  1;

rollback;



-- upsert 문
  select *
from dept;

 INSERT INTO dept (deptno, dname, loc )
 VALUES (90, '인사과','서울');

 INSERT INTO dept (deptno, dname, loc )
 VALUES (92, '인사과','서울') ON DUPLICATE KEY UPDATE loc='제주';
 
 
 -- DDL
 
-- 1)  컬럼명과 데이터타입만 지정한 경우
CREATE TABLE IF NOT EXISTS dept_2
 ( deptno INT,
 dname VARCHAR(10),
 loc VARCHAR(10) );
 
 insert into dept_2 ( deptno, dname)
values ( 1, '관리');   -- loc 에 null 값 저장

 -- 2)  default 추가
 CREATE TABLE IF NOT EXISTS dept_3
 ( deptno INT,
  dname VARCHAR(10),
  loc VARCHAR(10) DEFAULT '서울' );
  
insert into dept_3 ( deptno, dname)
values ( 1, '관리');   -- loc 에 기본값인 서울  저장

 CREATE TABLE IF NOT EXISTS board
 ( num INT PRIMARY KEY AUTO_INCREMENT,
 author VARCHAR(10) NOT NULL,
 title VARCHAR(20) NOT NULL,
 content VARCHAR(100) NOT NULL,
 writeday DATE DEFAULT (CURRENT_DATE),
 readcnt INT DEFAULT 0 );
 
  CREATE TABLE IF NOT EXISTS board2
 ( num INT PRIMARY KEY AUTO_INCREMENT,
 author VARCHAR(10) NOT NULL,
 title VARCHAR(20) NOT NULL,
 content VARCHAR(100) NOT NULL,
 writeday DATETIME DEFAULT NOW(),
 readcnt INT DEFAULT 0 );
 
 
 insert into board ( author, title, content )
 values('aa','bb','cc');
 
 -- 제약조건 설정
 CREATE TABLE student
 ( no INT PRIMARY KEY,
  name VARCHAR(10) UNIQUE ,
  address VARCHAR(10) NOT NULL, # 컬럼레벨만 가능
  age INT CHECK( age IN ( 10,20,30 )));
 
 insert into student ( no, name, address , age )
 values ( 1, 'aa','bb', 10);
 
  insert into student ( no, name, address , age )
 values ( 2, 'aa','bb', 10);
 
  insert into student ( no, name, address , age )
 values ( 3, 'aa2','bb', 40);
 
 CREATE TABLE student2
 ( no INT,
   name VARCHAR(10),
   address VARCHAR(10) NOT NULL,   -- Not null 반드시 컬럼레벨만 지원
   age INT ,
 CONSTRAINT PRIMARY KEY(NO),
 CONSTRAINT UNIQUE(NAME),
 CONSTRAINT CHECK(age IN( 10,20,30 )));
 
 
 -- fk 실습
 -- master 테이블 작성
 create table master1
 ( num int primary key,
  name varchar(10) not null );
  
insert into master1 ( num, name ) values ( 1, 'aa');
insert into master1 ( num, name ) values ( 2, 'bb');
insert into master1 ( num, name ) values ( 3, 'cc');
insert into master1 ( num, name ) values ( 4, 'dd');
commit;
 
 -- slave 테이블 작성: 컬럼 레벨 ( fk 설정이 안됨. 확인 필요 )
 drop table slave2;
 create table slave2
 (  n int primary key,
   num int  REFERENCES master1(num) );  -- master의 pk 또는 uk 컬럼만 참조 가능하다.
  
   -- slave 테이블 작성:  테이블 레벨
 drop table slave1;
 create table slave1
 (  n int primary key,
   num int,
   CONSTRAINT FOREIGN KEY(num)  REFERENCES master1(num) );  
   
insert into slave1 (n, num) values ( 10, 1 );
insert into slave1 (n, num) values ( 20, 2 );
insert into slave1 (n, num) values ( 30, 5 );   -- 에러발생
insert into slave1 (n, num) values ( 40, null );
commit;

select *
from information_schema.table_constraints
where table_name =  'slave1';
  
  
-- master의 레코드 삭제
   delete from master1
   where num = 1;
   
      -- slave 테이블 작성:  테이블 레벨 ON DELETE CASCADE
 drop table slave1;
 create table slave1
 (  n int primary key,
   num int,
   CONSTRAINT FOREIGN KEY(num)  REFERENCES master1(num)  ON DELETE CASCADE );  
   
insert into slave1 (n, num) values ( 10, 1 );
insert into slave1 (n, num) values ( 20, 2 );
-- insert into slave1 (n, num) values ( 30, 5 );   -- 에러발생
insert into slave1 (n, num) values ( 40, null );
commit;
   
      -- slave 테이블 작성:  테이블 레벨 ON DELETE SET NULL
 drop table slave1;
 create table slave1
 (  n int primary key,
   num int,
   CONSTRAINT FOREIGN KEY(num)  REFERENCES master1(num)  ON DELETE SET NULL );  
   
-- insert into slave1 (n, num) values ( 10, 1 );
insert into slave1 (n, num) values ( 20, 2 );
-- insert into slave1 (n, num) values ( 30, 5 );   -- 에러발생
insert into slave1 (n, num) values ( 40, null );
commit;
   
     
-- master의 레코드 삭제
   delete from master1
   where num = 2;
   
   -- 테이블 삭제
   drop table if exists copy_emp, copy_emp2;
   
   drop table master1; 
   
-- truncate 
create table copy_emp
as
select * from emp;

  truncate table  copy_emp;
   
 -- 테이블 수정
 
   -- 1) 컬럼 추가, 삭제
    CREATE TABLE scott_t
 ( num INT,
 NAME VARCHAR(10) );
   

  
   ALTER TABLE scott_t
 ADD ( address VARCHAR(30));
 
ALTER TABLE scott_t
 ADD ( email VARCHAR(30),  phone varchar(10));
 
 -- address 컬럼 삭제
 ALTER TABLE scott_t
 DROP address;
 -- 한번에 하나씩 삭제가능
  -- ALTER TABLE scott_t
 -- DROP (email, phone);

   -- 2) 컬럼 데이터 크기 변경, 타입 변경, 하나씩만 가능.
   ALTER TABLE scott_t
 MODIFY email VARCHAR(2);
   
     ALTER TABLE scott_t
 MODIFY email INT; 
 
 -- 3) 컬럼이름 변경
  ALTER TABLE scott_t
 RENAME COLUMN name  TO usename;
 
    DESC scott_t;
    
   -- 3) 제약조건 설정 (************)  
  CREATE TABLE scott_t2
 ( num INT,
   NAME VARCHAR(10),
 age INT,
 address VARCHAR(20) );
 
  -- num 컬럼에 primary key 제약조건 추가
 ALTER TABLE scott_t2
 ADD CONSTRAINT PRIMARY KEY(num);
 
 -- NAME 컬럼에 UNIQUE 제약조건 추가
  ALTER TABLE scott_t2
 ADD CONSTRAINT UNIQUE(NAME);
 
  -- age 컬럼에 CHECK 제약조건 추가
  ALTER TABLE scott_t2
 ADD CONSTRAINT CHECK(age>20);
 
  -- address 컬럼에 null 허용상태를  허용하지 않는 not null 상태로 제약조건 변경(****)
  ALTER TABLE scott_t2
 MODIFY address VARCHAR(20) NOT NULL;
 
 -- slave 테이블 작성
  CREATE TABLE IF NOT EXISTS scott_t2_child
 ( no INT PRIMARY KEY,
  num INT );
 
   ALTER TABLE scott_t2_child
   ADD CONSTRAINT FOREIGN KEY(num) REFERENCES scott_t2(num);

 