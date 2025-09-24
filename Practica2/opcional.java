import java.util.Arrays;
public class opcional {
    // función que tome una matriz de m x n y devuelva su matriz transpuesta, es decir,
    // una nueva matriz de n x m donde las filas de la matriz original se convierten en
    // las columnas de la nueva matriz, y viceversa.
    public static int[][] generaTranspuesta(int[][] m) {
        int[][] mres = new int[m[0].length][m.length]; 

        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                mres[j][i] = m[i][j]; 
            }
        }

        return mres;
    }
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};           // esta matriz es de 2 x 3
        int[][] matriz2 = {{1, 2, 3}, {7, 8, 2}, {4, 3, 9}, {0, 5, 6}}; // esta matriz es de 4 x 3

        System.out.println("Matriz orig.: " + Arrays.deepToString(matriz1));
        System.out.println("Matriz transp.: " + Arrays.deepToString(generaTranspuesta(matriz1)));

        System.out.println("Matriz orig.: " + Arrays.deepToString(matriz2));
        System.out.println("Matriz transp.: " + Arrays.deepToString(generaTranspuesta(matriz2)));
    }
}