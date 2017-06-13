# ASRS
Silly College project for a friend

Automated Student Registration System made as per the specification below:



	Chandigarh Univeristy

Department of Computer Science & Engineering
Document prepared By : Er. Kshitiza Vasudeva
Automated Student Registration System
This project is for primary validation of the student, registering the student for exam and then finally student appearing
the exam for which he/she is evaluated.
Packages to be used in this project are:

1. Package name: students
Class name: Student 
Instance variables: Name(String), age(int), email_id(String), phone_no(String), adhar_no(String)

2. Package name:  students.validation
Class name: Validation extends class Student
Instance variables:  validation_pass (boolean)

Methods: 
a) boolean Check_age(int age): this method will validate age whether the age is greater than zero. If it is invalid then 
user defined exception is thrown saying “invalidAgeException”. This method will return either true or false.
b) boolean Check_email_id( String email_id):  this will perform validation process for email id entered by the student. It
will check for ‘@’ symbol in between two strings. Example: xyz@gmail.com. This will also return true or false.
c) boolean check_phone_no( String phone_no): Check for 10 digits and return true or false accordingly.
d) boolean Check_ adhar_no( String adhar_no): Check for 16 digits and return true or false accordingly.
e) boolean full_validation(age, email_id, phone_no,adhar_no): this method will call all the remaining methods a,b,c and . If
all the methods return true then final validation is over.    

3. Package name: students.registration
Class name: Registration extends class Student and Validation 
Instance variables: total_registered_students( int), array of registered students.

Methods: 
a) void Get_data(): this method will get data from the student and store in an array of student class objects which includes
name, age, email id, phone number and adharcard unique number of student.
b) Register_Student(Student obj): this will pass student details to validation method which will finally validate the
student. After successful validation student will be registered and his/her data will be stored in a different array defined
in this class Registration. 



