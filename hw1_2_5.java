//U11216019 劉宸昕

public class hw1_2_5{
    public static void main ( String[] void ) 
    {
        int[] x = intersection( new int[] { 1 , 3 , 4 , 6 , 10 } , new int[] { 5 , 11 , 4 ,3 ,100 , 144 , 0 } ) ;
        for ( int i = 0 ; i < x.length ; i ++ )
        {
            System.out.print( x[i] + " " ) ;
        }
    }

    public static int[] intersection ( int[] a , b )
    {
        int[] x = new int[ a.length ] ;
        int xx = 0 ;
        for ( int i = 0 ; i < a.length ; i++ )
        {
            for ( int j = 0 ; j < b.length ; j ++ )
                {
                    if ( a[i] == b[j] )
                    {
                        boolean asd = false
                        for ( int k = 0 ; k < a.length ; k++ )
                        {
                            if ( a[i] == x[k] )
                            {
                                asd = true ;
                            }
                        }
                        if ( asd == false )
                        {
                            x[xx] = a[i] ;
                            xx++;
                        }
                                
                    }
                }
        }
        return x ;
    }
                             
}
