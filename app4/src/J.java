class J 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = a++ + a + a++ + a + a-- + a;
		//       0    1   1     2    2     1
		System.out.println(a);
		System.out.println(b);
		int c = 0;
		int d = ++c + c + ++c + c + --c + c;
	   	//       1    1    2    2    1    1
		System.out.println(c);
		System.out.println(d);
	}
}
