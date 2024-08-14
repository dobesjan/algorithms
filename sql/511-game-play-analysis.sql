select MIN(player_id) player_id, MIN(TO_CHAR(event_date, 'YYYY-MM-DD')) first_login from Activity group by player_id
