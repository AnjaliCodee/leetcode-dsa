SELECT x,y,z,
CASE When x+y>z AND x+z>y AND y+z>x THEN 'Yes'
ELSE 'No'
END As triangle
FROM Triangle;