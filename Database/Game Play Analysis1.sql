SELECT player_id,min(event_date) as first_login FROM Activity
GROUP BY player_id ORDER BY player_id;