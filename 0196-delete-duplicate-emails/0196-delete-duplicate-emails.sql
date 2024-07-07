DELETE p1
FROM Person as p1
JOIN (
  SELECT min(id) as min_id, email
  FROM Person
  GROUP BY email
) as p2
on p1.email = p2.email
  AND p1.id > p2.min_id