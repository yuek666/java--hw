


public class hw1_2_2{
	public static void main ( String[] args )
	{
		System.out.println( "please input Years " ) ;
		Scanner input = new Scanner( System.in ) ;
		System.out.println( "please input Months " ) ;
		System.out.println( "please input Day " ) ;
		int year = input.nextInt() ;
		int month = input.nextInt() ;
		int day = input.nextInt() ;
		int[] md = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 } ;
		if ( year % 4 == 0 )
		{
			md[1] ++ ;
		}
	} 


}
