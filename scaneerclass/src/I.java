import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("please enter student information");
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter student roll no");
		int roll_no = sc.nextInt(); 
        sc.nextLine();
		System.out.println("please enter student first_last_name");
		String first_last_name = sc.nextLine();


		System.out.println("please enter student initialas");
		char initialas = sc.next().charAt(0);

		System.out.println("please enter student age");
		byte age = sc.nextByte();

		System.out.println("please enter student course");
         String course = sc.next();
		  sc.nextLine(); 

		System.out.println("please enter student skill");
		String skill = sc.nextLine();

		System.out.println("please enter student fees");
		double fees = sc.nextDouble();

		System.out.println("please enter student job_offer");
		boolean job_offer = sc.nextBoolean();

        System.out.println(" ==================================== " );
        System.out.println(" Student all details  bellow " );
        System.out.println(" Roll no. " + roll_no  );
        System.out.println(" Name : " + first_last_name  );
        System.out.println(" initialas : " + initialas  );
        System.out.println(" Age : " + age  );
        System.out.println(" Course : " + course  );
        System.out.println(" skills : " + skill  );
        System.out.println(" fees :" + fees  );
        System.out.println(" job_offer :" + job_offer  );
	}
}