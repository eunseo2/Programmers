
GROUP BY를 사용할 때는 두가지를 기억해야 합니다.

특정 컬럼을 그룹화 하는 GROUP BY 

특정 컬럼을 그룹화한 결과에 조건을 거는 HAVING

* WHERE랑 HAVING을 헷깔리는 경우가 많은데 WHERE는 그룹화 하기 전이고, HAVING은 그룹화 후에 조건입니다.

고양이와 개는 몇 마리 있을까
SELECT ANIMAL_TYPE, Count(*) as count
from ANIMAL_INS  GROUP BY 1
ORDER BY ANIMAL_TYPE;

동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL
SELECT NAME , COUNT(*) as cnt FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY 1 HAVING cnt >=2
ORDER BY NAME;

SELECT NAME, count(Name) as count  
from ANIMAL_INS
group by 1
having count >= 2
order by NAME;

count(*)은 null값 포함, count(name) 컬럼명을 쓰면 null값 제외 


각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 
SELECT HOUR(DATETIME) AS HOUR , COUNT(*)
FROM ANIMAL_OUTS
GROUP BY 1
HAVING HOUR >8 AND HOUR <20
ORDER BY 1;