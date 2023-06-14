class A 
{
	//data member
	private String name;
	private int rollNumber;
	private int age;

	//rea-only //getter method
	//getter and setter method must be declare us public

	public String getName()
	{
		return name; // this.name //both are same
	}

	public int getRollNumber()
	{
		return rollNumber;//this.rollNumber;
	}
	public int getAge()
	{
		return age; //this.age;
	}

	// write-only // setter method

	public void setName(String name)
	{
		this.name = name;
	}
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}

class Driverclass
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
		System.out.println("================");
		a1.setName("Jay");
		a1.setRollNumber(4);
		a1.setAge(24);
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
	}
}
	
	

