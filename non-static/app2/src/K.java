class K 
{
	K(int i)
	{
		System.out.println("k(int)");
	}
	K(boolean b)
	{
		System.out.println("boolean b");
	}
	public static void main(String[] args) 
	{
		K k1 = new K(90);
		System.out.println("===========");
		K k2 = new K(true);
		System.out.println("===========");
		K k3 = new K(34);
		System.out.println("===========");
	}
}
