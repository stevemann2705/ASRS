package students.registration;

import java.util.Scanner;

import students.Student;
import students.validation.Validation;

public class Registration extends Validation{
	private static int total_registered_students;
	private Student students[];
	
	
	void get_data() {
		//TO-DO Implementation
	}
	
	public void register_student(Student s) {
		boolean validation = fullValidation(s.getAge(), s.getEmail_id(), s.getAdhar_no(), s.getPhone_no());
		if(validation) {
			students[total_registered_students++] = s;
		}
		else {
			System.out.println("Invalid Data. Student not registered");
		}
	}
}
