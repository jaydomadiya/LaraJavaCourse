class M 
{
	  int i;// non static

	public static void main(String[] args) 
	{
	    M m1 = new M();
		System.out.println(m1.i);// initial valur
		m1.i = 10;// we can re-initialize any no. of time.
		System.out.println(m1.i);// re-initialize value.
	}
}
