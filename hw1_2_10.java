//U11216019 劉宸昕

public class hw1_2_10{
    public static void main( String[] args )
    {
        reversePyramid( 1 );
        System.out.println( "=========================" ) ;
        reversePyramid( 3 );
        System.out.println( "=========================" ) ;
        reversePyramid( 5 );
    }

    public static void reversePyramid( int x )
    {
        int space = 0 ;
        for ( int i = 0 ; i < ( x + 1 ) / 2 ; i ++ )
        {
            for ( int j = 0 ; j < space ; j ++ )
            {
                System.out.print( " " ) ;
            }
            space ++ ;
            if ( x > 0 )
            {
                for ( int j = 0 ; j < x ; j ++ )
                {
                    System.out.print( "*" ) ;
                }
                x -= 2 ;
                System.out.println();
            }
        }
    }
}






