//U11216019 劉宸昕

public class hw1_3_1{
    public static void main ( String[] args )
    {
        int[] array = { 5, 2 , 34 , 4 , 6 , 677 , 12 45 ,15 ,21 ,1234 , 612 , 778 ,303 , 132 , 245 , 677 } ;
        mySort(array);
        for ( int i : array ) 
        {
            System.out.println( I + " " );
        }                
    }

    public static int[] mySort( int[] x )
    {
        int temp ;
        for ( int i = 0 ; i < x.length - 1 ; i ++ )
        {
            for ( int j = 0 ; j < x.length-2 ; j ++ )
            {
                if ( x[j] >= x[j+1] )
                {
                    temp = x[j] ;
                    x[j] = x[j+1] ;
                    x[j+1] = temp ;
                }
            }
                 
        }
    }
}
