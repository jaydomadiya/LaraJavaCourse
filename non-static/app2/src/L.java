class L 
{
	L(int i, int j)
	{
		System.out.println("L(int i,int j)");
	}
	L(int i,double j)
	{
		System.out.println("L(int i ,double j)");
	}
	public static void main(String[] args) 
	{
		L obj = new L(10,20);
		System.out.println("Hello World!");
		L obj2 = new L(20,9.0);
		System.out.println("Hello World!");
		}
}
