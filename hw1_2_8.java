//U11216019 劉宸昕
import java.util.*;

public class hw1_2_8{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in ) ;
        System.out.println( "please input the first number" ) ;
        int A1 = input.nextInt();
        System.out.println( "please input the second number" ) ;
        int A2 = input.nextInt();
        input.close();

        int B = 1 ;
        for ( int i = 1 ; i <= A1 ; i ++ )
        {
            if ( A1 % i == 0 && A2 % i == 0 )
            {
                B == i ;
            }            
        }       
        int S = A1 * A2 / B ;
        System.out.println( "最大公因數： " + A1 + " 最小公倍數: " + A2 ) ; 
    }
}
