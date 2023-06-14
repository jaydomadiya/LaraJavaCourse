class  B
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!" + args.length);
		for(String arg : args)
		{
			System.out.println(arg);
		}
	}
}
// JVM will be calling the main method by supplying empty string array object if you dont supplyy anything as a command line argument while executing any class.
//if you directly print the array refrence you will be getting the memory address of that array object.
//each end evry arrary will be having a length.we can find out the arrary length by using 'length' property(by calling length property on array refrence)
//array are also object in java.
//array index will be satrting from 0 but lendth we will calculate from no.1.;
//if there are no elements are present in the array then we can say thst array is empty or size or length is 0.
//by default whatever the value you are suppling as command line argument that will be cosiderd as string type only.