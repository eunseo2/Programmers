
루시와 엘라 찾기

SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS
WHERE NAME IN ('Ella', 'Lucy', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
order by ANIMAL_ID;


이름에 "EL"이 들어가는 개
SELECT ANIMAL_ID, NAME from ANIMAL_INS
where lower(NAME) like '%el%' AND ANIMAL_TYPE = 'Dog'
order by NAME;

중성화가 되어있다면 'O', 아니라면 'X'
SELECT ANIMAL_ID, NAME, CASE
    WHEN SEX_UPON_INTAKE like 'Neutered%' THEN 'O'
    WHEN SEX_UPON_INTAKE like 'Spayed%' THEN 'O'
    ELSE 'X'
    END '중성화'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;


날짜를 2018-01-22 

SELECT ANIMAL_ID, NAME,  DATE_FORMAT(DATETIME, '%Y-%m-%d') as '날짜'
from ANIMAL_INS
order by ANIMAL_ID;