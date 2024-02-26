//U11216019 劉宸昕

public class hw1_1_1{
    public static void main ( String[] args )
    {
        Scanner input = new Scanner( System.in ) ;
        System.out.println( "please input height" ) ;
        flaot h = input.nextFloat();
        System.out.println( "please input times" ) ;
        int n = input.nextInt();
        float sum = h ;
        for ( int i = 0 ; i < n ; i++, h /= 2f )
        {
            sum += h;
        }        
    }
}
