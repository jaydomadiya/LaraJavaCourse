class C2
{
	public static void main(String[] args) 
	{
		System.out.println("Total argument!" + args.length);

		System.out.println("still in the string datatype not coverted");
		for(String elements : args)
		{
			System.out.println(elements);
		}
		double i = Double.parseDouble(args[0]);
		double j = Double.parseDouble(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}
