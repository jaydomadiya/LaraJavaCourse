class G
{
	{
		System.out.println("IIB1");
	}
	G()
	{
		this(90);
		System.out.println("G(F)");
	}
	G(int i)
	{
		System.out.println("G(int i)");
	}
	public static void main(String[] args)
	{
		G g1 = new G();
		System.out.println("============");
		G g2 = new G(12);
		System.out.println("==============");
	}
}