//U11216019 劉宸昕

public class hw1_2_3{
	public static void main ( String[] args )
	{
		for ( int i = 0 ; i < 10 ; i ++ )
		{
			for ( int j = i + 1 ; j < 10 ; j ++ )
			{
				for ( int k = j + 1 ; j < 10 ; j ++ )
				{
					int x = i ^ 3 + j ^ 3 + k ^ 3 ) ;
					if ( x < 1000 && x > 99 )
					{
						System.out.println( x + " " ) ;
					}
				}
			}
		}
	}

}
