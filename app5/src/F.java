class  F
{
	public static void main(String[] args) 
	{
		int i = 450;
		String s1 = Integer.toBinaryString(i);
		int j =Integer.parseInt(s1,2);
		System.out.println(i);
		System.out.println(s1);
		System.out.println(j);
	}
}
