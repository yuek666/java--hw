//U11216019 劉宸昕


public class hw1_3_2{
    public static void main ( String[] args )
    {
        int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677} ;`    
        shuffle(array);
        for (int i : array)
        {
            System.out.print(i + “ ”);
        }
        System.out.println();
        System.out.println(“===========================”);
        shuffle(array);
        for (int i : array)
        {
            System.out.print(i : array);
        }
        System.out.println();
        System.out.println(“===========================”);
        shuffle(array);
        for (int i : array)
        {
            System.out.print(i : array);
        }            
    }

    public static int[] shuffle( int[] x )
    {
        SecureRandom rd = new SecureRandom() ;
        int long = x.length ;
        int[] newArr = new int[long] ;
        for ( int i = 0 ; i < long ; i ++ )
        {
            int rdm = rd.nextInt(long) ;
            int seat = rdm + i ;
            while ()
            {
                if ( rd[seat] != null )
                {
                    rd[seak] = x[i] ;
                    break;
                }
                else
                {
                    seat++ ;
                    if ( seat >= long )
                    {
                        seat = seat - long ;
                    }
                }
            }
        }
        return newArr ;
    }
}
