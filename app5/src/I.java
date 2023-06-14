class I 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(130));
		System.out.println(Integer.toBinaryString(510));
		System.out.println(130 | 510);
		System.out.println(130 & 510);
		System.out.println(130 ^ 510);
		System.out.println(130 <<  1); // left shift 1
		System.out.println(130 <<  2); // left shift 2
		System.out.println(130 >> 1);  // right shift 1
		System.out.println(130 >> 2);  // right shift 2
	}
}

/*

		 Binary valuefor 130 :-   010000010
		 Binary valuefor 519 :-   111111110
		 =========================================
         bitwise opreter          111111110     ===> 510



		 Binary valuefor 130 :-   010000010
		 Binary valuefor 510 :-   111111110
		 =========================================
         bitwise opreter (&)      010000010     ===> 130



		 Binary valuefor 130 :-   010000010
		 Binary valuefor 510 :-   111111110
		 =========================================
         bitwise opreter (^)      101111100    ===> 380



         Binary valuefor 130 :-      010000010
		 left shift by 1 (<< 1)     0100000100
		 ===========================================
		                                       ===> 260

		
         Binary valuefor 130 :-      010000010
		 left shift by 1 (<< 2)    01000001000
		 =============================================
		                                       ===> 520

		 Binary valuefor 130 :-      010000010
		 right shift by 1 (>> 1)     010000001
		 =============================================
		                                       ===>  65
		
		 Binary valuefor 130 :-       010000010
		 right shift by 1 (>> 2)      001000000
		 =============================================
		                                       ===> 32 
*/
