package Two_Dim_Array;

public class SetZeros_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] matrix) {
        // Set<Integer> seti = new HashSet<Integer>();
        // Set<Integer> setj = new HashSet<Integer>();
        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(row[i] || col[j])
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
