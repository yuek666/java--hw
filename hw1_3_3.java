//U11216019 劉宸昕

public class hw1_3_3{
    public static void main ( String[] args )
    {
        int[][][] arr = {{{1, 2}}, {{3, 4}, {5}, {6}}, {{7, 8}, {9, 10}}, {{3, 4}, {4, 1}}, {{}, {43, 13}}};
        int array = flatten(array);
        for (int n : array)
        {
            System.out.print(n + “ ”);
        }
    }

    public static int[] flattern( int[][][] x )
    {
        int[] newArr = new int[1] ;
        int plus = 0 ; 
        for ( int i = 0 ; i < x.length ; i ++ )
        {
            for ( int j = 0 ; j < x[i].length ; j ++ )
            {
                for ( int k = 0 ; k < x[i][j].length ; k ++ )
                {
                    newArr[plus] = x[i][j][k] ;
                    plus++ ;
                    int[] tmpArr = new int[newArr.length + 1] ;
                    for ( int asd = 0 ; asd < newArr.length ; asd++ )
                    {
                        tmpArr[asd] = newArr[asd] ;
                    }
                    newArr = tmpArr ;
                }
            }
            return newArr ;
        }
    }
}
