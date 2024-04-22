import java.util.*;

public class hw4 {

    public static void main(String[] args){
        odd();
    }

    /*
    public static void throwUserException( ) throws NotOddException
    {
        throw new NotOddException("001");
    }*/

    public static void odd() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "輸入一個數值n,印出1~之間的所有奇數值" );
        try
        {
            
            int n = input.nextInt();
            if ( n <= 0 )
            {
                throw new IllegalArgumentException();   
            }
            if ( n % 2 == 0 )//偶數
            {
                throw new NotOddException( "非奇數" );
            }
            
            for ( int i = 1 ; i <= n ; i++ )
            {
                if ( i % 2 == 1 ) System.out.println(i);
            }
            
        }
        //*
        catch ( IllegalArgumentException e )//<=0
        {
            System.out.println( "n值小於等於0,無法處理" );
        }
        //*/
        catch ( InputMismatchException e )//格式錯
        {
            System.out.println( "輸入格式錯誤,無法處理" );
        }
        catch ( NotOddException e )
        {
            System.out.println("出值為偶數,無法處理");
        }
        catch ( Exception e )//例外
        {
            System.out.println( e.getMessage() );
        }
        finally
        {
            input.close();
        }
    }
}

class NotOddException extends Exception{
    private String errCode;
    private String errMessage;

    public NotOddException( String errCode)
    {
        this.errCode = errCode;
        errMessage = "偶數";
    }
    
    public String getErrCodeString()
    {
        return errCode;
    }

    public String getErrMessage()
    {
        return errMessage;
    }


}
