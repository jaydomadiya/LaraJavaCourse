import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one byte value");
		Scanner sc = new Scanner(System.in);
		byte value = sc.nextByte();
		System.out.println("byte value is " + value);
	}
}