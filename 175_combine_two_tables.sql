# Write your MySQL query statement below
select FirstName, LastName, City, State
  from Person left join Address
  ON Address.PersonId=Person.PersonId;