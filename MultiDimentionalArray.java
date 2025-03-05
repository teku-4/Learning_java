public class MultiDimentionalArray {
    public static void main(String[] args){
    // ------------------------multi-Dimetional array-------------------
    int[][] matrix={{1,2,3,4},{6,7,8,9,0},{1,3,5,-4}};
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<=matrix.length; j++){
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
    for(int[] row:matrix){
        for(int col:row){
            System.out.println(col+ " ");
        }
        System.out.println();
    }
    }
}