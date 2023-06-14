class Y
{
	public static void main(String[] args) 
	{
		System.out.println("W main begin");
		X.main(args);
		System.out.println("W main end");
	}
}

/*
Y.java:6: error: cannot find symbol
                X.main(args);
                ^
  symbol:   variable X
  location: class Y
1 e
*/