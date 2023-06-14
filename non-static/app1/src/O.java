class O 
{
	int i;
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = o1;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i =10;
		System.out.println(o2.i);
		o2.i = 20;
		System.out.println(o1.i);
		
	}
}
// one object can have any no . of refrences.
// one object can be pointed ny any no. of refrences.
//changes in one refrences reflecting to all the refrences that are pointing to that object.
//a refrence can point to only one object at a time
