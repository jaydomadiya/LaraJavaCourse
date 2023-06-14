class H 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(46));
		System.out.println(Integer.toBinaryString(65));
		System.out.println(45 | 65); // binary or
		System.out.println(45 & 65); // binary and
		System.out.println(45 ^ 65); // binary xor
	}
}
/*
	  binary of 45 :- 0101101
	  binary of 65 :- 1000001
	 ============================
	  binary or    :- 1101101 ===> 109

	    binary of 45 :- 0101101
	    binary of 65 :- 1000001
	=============================
	binary and       :- 0000001 ====> 1

	    binary of 45 :- 0101101
	    binary of 65 :- 1000001
	=============================
	binary xor       :- 1101100






*/