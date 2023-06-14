class K5
{
	int j; // (non - static member) this member will be loaded each end evry time whenever we are creating object of K5 class differnet copy of the same j will be loaded to the memory with the defult value 0
	static int i;
	static K5 k5 = new K5();// (static member) this member will loading while class K5 is loading to thr memory with defult value 0 .while creating the object the object for K5 class this member will not be loading agaon bcz it is alrady loaded while K5 class is loading .each and every object of K5 class will be sharing the same copy of static int i
	static K5 k1 = new K5();
	static
	{
		System.out.println("SIB" + k5.i);
		k5.i = 50;
		k5.i =90;
		i = 40;
		System.out.println("SIB END" + k5.i);
	}
	public static void main(String[] args)
	{	
		System.out.println("main" + k5.i);
	}
	
}