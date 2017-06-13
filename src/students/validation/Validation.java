package students.validation;

import students.Student;

public class Validation extends Student {
	private boolean validation_pass;

	private boolean check_age(int age) { // throws Exception {

		if (age > 0) {
			return true;
		} else {
			// throw new Exception("InvalidAgeException");
			return false;
		}

	}

	private boolean check_email_id(String email_id) {
		if (email_id.contains("@")) {
			return true;
		} else {
			return false;
		}
	}

	private boolean check_phone_no(String phone_no) {
		if (phone_no.length() == 10) {
			return true;
		} else {
			return false;
		}

	}

	private boolean check_adhar_no(String adhar_no) {
		if (adhar_no.length() == 16) {
			return true;
		} else {
			return false;
		}
	}

	boolean fullValidation(int age, String email_id, String adhar_no, String phone_no) {
		if (check_age(age) && check_email_id(email_id) && check_adhar_no(adhar_no) && check_phone_no(phone_no)) {
			validation_pass = true;
		} else {
			validation_pass=false;
		}
		return validation_pass;
	}
	
	

}
