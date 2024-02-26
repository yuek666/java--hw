//U11216019 劉宸昕

public class hw1_2_4{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in ) ;
        System.out.println( "Please input a " ) ;
        int a = input.nextInt() ;
        System.out.println( "please input n );
        int n = input.nextInt();
        int sum = 0 ;
        int i111 = 1 ;
        for ( int i = 0 ; i < n ; i++ )
        {
            sum = sum + i111 * a ; 
            i111 = i111 * 10 + 1 ;    
        }
        input.close();
    }
}
