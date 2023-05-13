package quang.dev;

public class Person {
	private String name;
	private int age;
	private  String city;
	private double wage;
	public Person(String name, int age, String city, double wage) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.wage = wage;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	@Override
	public String toString() {
		return "Tên:" + name + "\n Tuổi:" + age + "\n Thành phố:" + city + "\n Thu nhập:" + wage;
	}
	
}
