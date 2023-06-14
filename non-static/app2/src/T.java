class T 
{
	T()
	{
		System.out.println("T()");
	}
	T(int i)
	{
		T t1 = new T();
		System.out.println("T(INT I)");
	}
	public static void main(String[] args) 
	{
		T obj1 = new T();
		System.out.println("==================");
		T obj2 = new T(10);
		System.out.println("============");
	}
}
