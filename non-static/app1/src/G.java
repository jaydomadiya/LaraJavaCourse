class G 
{
	int i;
	public static void main(String[] args) 
	{
		G g1 = new G(); // object creation
	    System.out.println(g1.i);// by using the refrence of G class object we can accss the non staic variable i.
		// this g1 refrence is local to main method
	}

}

// G g1 = G(class name), g1(reference variable name)(name can be anything)
// == assigenment opertator (left side assignment)
// new is keyword and also opreator
// G(); - calling G class no argument constuctor
// variable , method follow the case like variableNumberOne,methodNumberOne
// variable name should be a valid identifier
// while you are refering to the class case must be same (as a satanderd we will weite) the class name in camel case link Thies IsTheCamelCase
// object are store inside heap memory
// non static members are loading to the memory while object are created
// all the non static member are loadind to the memory whike we are ceating objects to that particuler class .it can be non variable or can be non static method or it caan  be a non static block.