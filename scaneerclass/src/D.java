import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one double value");
		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();
		System.out.println("Double value is " + value);
	}
}
//byte < short < long < float < double