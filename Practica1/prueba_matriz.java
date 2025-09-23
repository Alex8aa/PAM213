public class prueba_matriz{
    public static void main(String[] args){
        int[][] matriz = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println("Imprimiendo la matriz por elementos: ");
        for (int i=0; i<matriz.length; i++){
           for (int j=0; j < matriz[i].length; j++){
            Systpruebaem.out.print(matriz[i][j] + " ");
           }
           System.out.println();
           System.out.println("---------");
        }
    }

    
}