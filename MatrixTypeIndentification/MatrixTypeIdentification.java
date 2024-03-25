public class MatrixTypeIdentification {
    // creating matrix
    private int[][] matrix ;

    // constructor
    public MatrixTypeIdentification(){
        this.matrix = new int[][]{{1, 2, 0}, {0, 1, 0}, {0, 0, 1}};
    }
    public MatrixTypeIdentification(int[][] matrix){
        this.matrix = matrix;
    }

    // main method
    public static void main(String[] args) {
        MatrixTypeIdentification matrix = new MatrixTypeIdentification();
        System.out.println("the matrix: \n"+matrix);
        System.out.println("transpose matrix: \n"+matrix.transposeMatrix());
        matrix.matrixType();

//        MatrixTypeIdentification matrix2 = new MatrixTypeIdentification(new int[][]{{1,2,3},{0, 4, 2}, {0,0,9}});
//        System.out.println("the matrix: \n"+matrix2);
//        System.out.println("transpose matrix: \n"+matrix2.transposeMatrix());
//        matrix2.matrixType();

        MatrixTypeIdentification matrix3 = new MatrixTypeIdentification(new int[][]{{1,2,3},{0, 4, 2}, {7,0,9}});
        System.out.println("the matrix: \n"+matrix3);
        System.out.println("transpose matrix: \n"+matrix3.transposeMatrix());
        matrix3.matrixType();
    }

    //methods
    public void giveIntroduction(){
        System.out.println("This is a program to identify the type of matrix and print it's transpose. :)");
    }

    public void matrixType(){
        if (upperTriangular()){
            System.out.println("It is a upper triangular matrix");
        }
        if (lowerTriangular()){
            System.out.println("It is a lower triangular matrix");
        }
        if(identityMatrix()){
            System.out.println("It is an identity triangular matrix");
        }
        if(squareMatrix()){
            System.out.println("It is a square matrix");
        }

    }

    public String toString(){
        int[][] arr = this.matrix;
        String str = "";
        for (int i = 0; i < arr.length ; i++){
            str += "|";
            for (int j = 0 ; j < arr[i].length ; j++){
                str += " "+arr[i][j]+ " ";
            }
            str += "|\n";
        }
        return str;
    }
    public boolean upperTriangular(){
        boolean upperTriangular = true;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if ( i > j && matrix[i][j] != 0){
                    upperTriangular = false;
                    break;
                }
            }
        }
        return  upperTriangular && squareMatrix();
    }
    public boolean lowerTriangular(){
        boolean lowerTriangular = true;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if (  i < j && matrix[i][j] != 0){
                    lowerTriangular = false;
//                    break;
                }
            }
        }
        return  lowerTriangular && squareMatrix();
    }
    public boolean squareMatrix(){
        for (int i = 0 ; i< matrix.length ; i++){
            if(matrix.length != matrix[i].length){
                return false;
            }
        }
        return true;
    }
    public boolean identityMatrix(){
        for (int i = 0 ; i < matrix.length ; i++){
            for ( int j = 0 ; j < matrix.length ; j++){
                if ((i==j && matrix[i][j]!=1) || ( i != j && matrix[i][j]!=0)){
                    return false;
                }
            }
        }
        return true && squareMatrix() ;
    }

    public MatrixTypeIdentification transposeMatrix(){
        int rows = matrix.length;
        int columns = matrix[0].length;
        MatrixTypeIdentification transpose = new MatrixTypeIdentification(new int[rows][columns]);
        for (int i = 0 ; i<matrix.length ; i++){
            for (int j = 0 ; j<matrix[i].length ; j++){
                transpose.matrix[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}