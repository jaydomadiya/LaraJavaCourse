class I 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i + i++ + i;
		//      0     1   1     2
		System.out.println(i);
		System.out.println(j);
		int m = 0;
		int n = ++m + m + ++m +m;
		//      1     1    2   2
		System.out.println(m);
		System.out.println(n);
	}
}
