package students;

public class Student {
	private String name;
	private int age;
	private String email_id;
	private String phone_no;
	private String adhar_no;
	
	public Student() {
		this.name = null;
		this.age = 0;
		this.email_id = null;
		this.phone_no = null;
		this.adhar_no = null;
	}
	
	public Student(String name, int age, String email_id, String phone_no, String adhar_no){
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone_no = phone_no;
		this.adhar_no = adhar_no;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone_no=" + phone_no
				+ ", adhar_no=" + adhar_no + "]";
	}
	
	
}
