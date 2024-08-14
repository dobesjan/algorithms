WITH FirstLogin AS (
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
),
     SecondLogin AS (
         SELECT player_id, MIN(event_date) AS second_login
         FROM Activity
         WHERE event_date > (SELECT MIN(event_date)
                             FROM Activity a2
                             WHERE a2.player_id = Activity.player_id)
         GROUP BY player_id
     )
SELECT
    ROUND((SELECT COUNT(*)
           FROM SecondLogin sl
                    JOIN FirstLogin fl ON sl.player_id = fl.player_id
           WHERE sl.second_login = fl.first_login + 1
          ) /
          (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM dual;
