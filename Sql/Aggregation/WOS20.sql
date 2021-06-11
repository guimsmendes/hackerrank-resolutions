SET @N = 0;
SELECT COUNT(*) FROM STATION INTO @CC;

SELECT round(AVG(lat_n),4) 
        FROM ( SELECT @N := @N+1 AS row_num, lat_n
                                         FROM station
                                         ORDER BY lat_n DESC) A
WHERE 
    CASE WHEN MOD(@CC,2)=0 THEN
            A.row_num = @CC/2 OR A.row_num = (@CC/2)+1
          ELSE A.row_num = (@CC+1)/2
    END;
