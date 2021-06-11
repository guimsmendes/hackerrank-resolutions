set @r=0, @s=0, @t=0, @u=0;
select min(Doctor), min(Professor), min(Singer), min(Actor)
from(
  select case when Occupation='Doctor' then (@r:=@r+1)
            when Occupation='Professor' then (@s:=@s+1)
            when Occupation='Singer' then (@t:=@t+1)
            when Occupation='Actor' then (@u:=@u+1) end as RowNumber,
    case when Occupation='Doctor' then Name end as Doctor,
    case when Occupation='Professor' then Name end as Professor,
    case when Occupation='Singer' then Name end as Singer,
    case when Occupation='Actor' then Name end as Actor
  from OCCUPATIONS
  order by Name
) Temp
group by RowNumber/*
Enter your query here.
*/