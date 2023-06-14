//single inharitance
//java support single inheritance meaning a class can inherits from only one siper class.
//parrent//base//super - class

class A 
{
	int i;
}
//child class//dirived class // sub-class
// one class can ablr to extend another class 
// at a time a class can able to extend only one class 
class B extends A
{
	int j;
	
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
	
}


