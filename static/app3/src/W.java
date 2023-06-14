class W 
{
	public static void main(String[] args) 
	{
		System.out.println("W main begin");
		V.main(args);
		V.main(null);
		System.out.println("W main end");
	}
	static
	{
		System.out.println("W.SIB");
	}
}