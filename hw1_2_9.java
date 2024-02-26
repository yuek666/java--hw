//U11216019 劉宸昕

public class hw1_2_9{
    public static void main( String[] args )
    {
        Pyramid( 1 );
        System.out.println( "=========================" ) ;
        Pramid( 3 );
        System.out.println( "=========================" ) ;
        Pyramid( 5 );
    }

    public static void Pyramid( int x )
    {
        int space = ( x + 1 ) / 2 ; 
        int sub = 1 ;
        for ( int i = 0 ; i < ( x + 1 ) / 2 ; i ++ )
        {
            for ( int j = 0 ; j < space ; j ++ )
            {
                System.out.print( " " ) ;
            }
            space++ ;
            for ( int j = 0 ; j < sub ; j ++ )
            {
                System.out.println( "*" );
            }
            sub += 2 ;
            System.out.println();
        }
    }
}
