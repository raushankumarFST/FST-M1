SELECT * FROM salesman;

-- Show data from the salesman_id and city columns
SELECT salesman_ID, salesman_city 
from salesman;

-- Show data of salesman from Paris
SELECT * 
FROM salesman 
WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission 
FROM salesman 
Where salesman_name='Paul Adam';