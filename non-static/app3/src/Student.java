class Student
{
	int roll_no;
	String name;
	String collegename;
	String course;
	Student(int roll_no,String name)
	{
		this.roll_no = roll_no;
		this.name = name;
		
	}
	{
		this.collegename = "LARA";
	}
	{
		this.course = "java full stack";
	}
	
	public static void main(String[] args) 
	{
		Student b1 = new Student(101,"Ashish");
		
		Student b2 = new Student(102,"chatu");
	
		Student b3 = new Student(103,"naveen");
		
		Student b4 = new Student(104,"Aditya");
	
		System .out.println(b1.roll_no + "," + b1.name + "," + b1.collegename + "," + b1.course);
		System .out.println(b2.roll_no + "," + b2.name + "," + b2.collegename+ "," + b2.course);
		System .out.println(b3.roll_no + "," + b3.name + "," + b3.collegename+ "," + b3.course);
		System .out.println(b4.roll_no + "," + b4.name + "," + b4.collegename+ "," + b4.course);
	}
}
