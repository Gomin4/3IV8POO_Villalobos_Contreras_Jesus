import java.util.Scanner;
 
public class Example {
 
    public static void Example(String[]args){


        Scanner entrada = new Scanner (System.in);
        
        int matriza[][] = new int [3][3];
        int matrizb[][] = new int [3][3];
        int matrizs[][] = new int [3][3];
        int i, j;
        
        //Lectura de datos de la matriz «A».
        System.out.println("Datos de la matriz A.");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
                matriza [i][j] = entrada.nextInt();
            }
        }
        
        //Lectura de datos de la matriz «B».
        System.out.println("\nDatos de la matriz B.");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
                matrizb[i][j] = entrada.nextInt();
            }
        }
            
        //Asignar valores para la matriz «S».
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                 matrizs [i][j] = matriza[i][j] + matrizb[i][j];
            }
        }
        
        //Imprimir resultados.
        System.out.println("Matriz resultante de la suma:");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++) {
                System.out.print(matrizs[i][j] + " ");
            }
            
        System.out.println("");
        }
    }
}
