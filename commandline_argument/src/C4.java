 class C4
{
	public static void main(String[] args) 
	{
		System.out.println("total argumnent!" + args.length);
		System.out.println("==============================");
		//its not converting from starting to char
		//its just fetching value from a particuler string index
		//we cant convert string to char
		
		char c1 = args[0].charAt(0);
		System.out.println(c1);
		
	}
}
// intrnally string are also array of characters.and will be having indexing. index starts from 0