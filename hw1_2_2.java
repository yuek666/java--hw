//U11216019 劉宸昕


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
		int sum = 0 ;
		int[] md = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 } ;
		if ( year % 4 == 0 )
		{
			md[1] ++ ;
		}
		for ( int i = 0 ; i < month ; i ++ )
		{
			if ( i + 1 != month )
			{
				sum = sum + md[i] ;
			}	
		}
		sum = sum + day ;
		System.out.println( "day " + sum ) ;
	} 


}
