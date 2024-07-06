SELECT * FROM salesman;

-- Add the grade column
Alter table salesman 
add grade int;

-- Update the values in the grade column
select * from salesman;
UPDATE salesman SET grade=100;

-- Display data
SELECT * FROM salesman;