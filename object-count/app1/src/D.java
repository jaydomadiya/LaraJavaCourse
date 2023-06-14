class D
{
	static int count;
	D()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		D D1 = new D();
		System.out.println("a:" + count);
		D D2 = new D();
		System.out.println("b:" + count);
		D D3 = new D();
        System.out.println("D:" + count);
		D D4 = new D();
		System.out.println("d:" + count);

		
	
		System.out.println("a:" + D1.count);
	
		System.out.println("b:" + D2.count);
	
        System.out.println("D:" + D3.count);

		System.out.println("d:" + D4.count);


	}
}