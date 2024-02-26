//U11216019 劉宸昕


public class hw1_2_7{
    public static void main( String[] args )
    {
      System.out.println(fibonacci(10));
      System.out.println(fibonacci(15));    
      System.out.println(fibonacci(20));
    }

    public static int fibonacci( int x )
    {
        if ( x == 0 || x == 1 )
        {
            return 1 ;
        }
        else 
        {
            return ( fibonacci( x - 2 ) + fibonacci( n - 1 ) ) ;
        }
    }
}
