SELECT id, num
FROM (
         SELECT id, COUNT(DISTINCT friend_id) AS num
         FROM (
                  SELECT requester_id AS id, accepter_id AS friend_id
                  FROM RequestAccepted
                  UNION
                  SELECT accepter_id AS id, requester_id AS friend_id
                  FROM RequestAccepted
              )
         GROUP BY id
         ORDER BY num DESC
     )
WHERE ROWNUM = 1;
