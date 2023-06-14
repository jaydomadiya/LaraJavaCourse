import java.util.Scanner;
class J

{
	public static void main(String[] args) 
	{
		System.out.println("Student detail");
		Scanner sc = new Scanner(System.in);
		int rollno = sc.nextInt();
		//sc.nextLine();
		String name = sc.next();
		char initials = sc.next().charAt(0);
		//sc.nextLine();
		String course = sc.next();
		//sc.nextLine();
		String skill = sc.next();
		//sc.nextLine();
		int fees = sc.nextInt();
		//sc.nextLine();
		boolean joboffer = sc.nextBoolean();


		System.out.println("============================");
		System.out.println("rollno " + rollno);
		System.out.println("name  " + name);
		System.out.println("initials " + initials);
		System.out.println("course " + course);
		System.out.println("skill " + skill);
		System.out.println("fees " + fees);
		System.out.println("joboffer " + joboffer);
	}
}
