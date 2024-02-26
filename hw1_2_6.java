//U11216019 劉宸昕


public class hw1_2_6{
    public static void main ( String[] args )
    {
        int[] newArr = rightShift( new int[] { 4 , 21 , 4 , 3 , 6 ,7 ,12 , 43 , 11 233 } ,1 ) ;
        for ( int i : newArr )
        {
            System.out.println( i + " " ) ;
            System.out.println() ;
            System.out.println("=========================") ;
            int[] newArr2 = rightShift( new int[] {4 , 21 , 4 ,3 ,6, 7, 12 ,43, 11 ,233 } , 4 ) ;
            for ( int i : newArr2)
            {
                System.out.println( i + " " ) ;
            }
                    
        }
    }

    public static int[] rightShift( int[] x , int n )
    {
        int[] xv2 = new inbt[ x.length ] ;
        for ( int i = 0 ; i < x.length ; i ++ ) 
        {
            int asd = i + n ; 
            if ( asd < x.length )
            {
                 xv2[ asd ] = x[i] ;   
            }
            else
            {
                xv2[ asd - x.length + 1 ] = x[i] ;
            }
        }
        return xv2 ;
                
    }
}
