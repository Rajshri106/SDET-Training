package JavaTutorial;

public class Student {

	String name;
	int age;
	String address;
	
	public Student(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getAddress()
	{
		return address;
	}
	public static void main(String[] args)
	{
		Student s = new Student("abc",12,"In");
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}
}
