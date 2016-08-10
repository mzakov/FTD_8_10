
public class Student {

	private String name;

	private String state;

	private String city;

	Student(String name, String state, String city) {
		this.name = name;
		this.state = state;
		this.city = city;

	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (name + "\n" + state + "\n" + city);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
