package pack1;
class D 
{
	private void test()
	{
		System.out.println("from test()");
	}
}
 class E
{

	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("done");
	}
}
//in one java file any number classes can be developed.
//for all the classes a .class will be genreted(after the sucessful compilation of .java file) Ex A.class,B.class,C.class
