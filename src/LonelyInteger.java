import java.util.HashMap;

public class LonelyInteger {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        matrix= rotate90(length, matrix);

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate90(int n, int[][] matrix){
        int[][] newMatrix = new int[n][n];
        int size = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][size] =matrix[i][j];
            }
            size--;
        }
        return newMatrix;
    }
}
