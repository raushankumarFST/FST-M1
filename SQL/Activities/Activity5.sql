-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 
where salesman_city='Rome';

-- Update the name McLyon to Pierre.
SELECT * FROM salesman;
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesman;