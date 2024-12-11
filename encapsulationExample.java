package tasks;

class Dhana{
	private String name;
	private int age;
	private int roll;
	
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
	
	public int getRoll() {
		return roll;
	}
	public void setRollNo(int roll) {
		this.roll= roll;
	}
}

public class encapsulationExample {
public static void main(String[] args) {
	
	Dhana obj = new Dhana();
	obj.setName("Joe");
	obj.setAge(22);
	obj.setRollNo(99);
	
	System.out.println("Name 	: "+obj.getName());
	System.out.println("Age 	: "+obj.getAge());
	System.out.println("Roll No : "+obj.getRoll());
	
}
}