package Beans;

public class Address {

	private String dno;
	private String city;
	private String phone;
	private String email;
	
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// this method will be called whenever you are printing object of the class.
	@Override
	public String toString() {
		
		return "Address [dno=" + dno + ", city=" + city + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
}
