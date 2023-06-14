// each end evry class will be extending object class either directly or indirctly
//if ckass is not extending any other class then that class is direct subclass of object class
//if the class is already extending another class then that class is the indirect sub-class of object class
//whatever we keep it or not compiler only keeps the extend for all the classes
class  K 
{
	K()
	{
		//if you dont keep any explicit super or this calling statement in the constructer body as a first statement,then compiler only keeps the super with no argument calling statement
		//super();
		System.out.println("K()");
	}
}
class L extends K
{
	L()
	{
		super();
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
	}
}
