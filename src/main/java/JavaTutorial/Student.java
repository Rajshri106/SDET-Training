package JavaTutorial;
public class Student {
	private String name;
	private int age;
	private String address;
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
		Student stud = new Student("abc",12,"In");
		System.out.println(stud.getName());
		System.out.println(stud.getAge());
		System.out.println(stud.getAddress());
	}
}
