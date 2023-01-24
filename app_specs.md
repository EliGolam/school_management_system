# School Management System

## Concept

A Simple school management system that tracks Students, Teachers and Funds.

It's a Money Management System for a School. -> We keep track of:

* Student Fees (Paid / To pay)
* Teacher Salary
* Available Funds

### Entities Needed

* Teacher
* Student
* Funds (Money earned - Money spent)

#### Teacher

{
  id | unique,

  name | required,

  salary | default = 0,

  subject | nullable
}

#### Student

{
  id | unique,

  name | required,

  fees | default = 1,

  feesPaid | default = 0,
  
  year | default = 1,
}
