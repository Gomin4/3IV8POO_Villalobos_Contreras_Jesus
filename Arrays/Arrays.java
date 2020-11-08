import java.util.*;
public class Arrays {
    static void caso1()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; 
        int[] numeros = new int[10]; 
        double sumaPos = 0, sumaNeg = 0;

        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
            }

        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }

       
        if (pos != 0) {
            System.out.println("Promedio de los valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Promedio de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
    static void caso2()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ 
                media = media + numeros[i];
            }
        }
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);
    }
    static void caso3()
    {
        Scanner s=new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int calif[]=new int[10];
        double suma = 0;
        int mayor, menor;
        int pos = 0;
        int i;
        float promedio=0;
        int cal;
        double sumaPos = 0;
        double media;
        System.out.println("Calificaciones");
      
        for ( i = 0; i < 10; i++) {
            System.out.print("Calificacion[" + i + "]= ");
            calif[i]=sc.nextInt();
            }
            for (i = 0; i < 10; i++) {
                suma = suma + calif[i];
            }
            media = suma / calif.length;
        System.out.printf("Nota media del curso: %.2f %n", media);
       
        for ( i = 0; i < calif.length; i++) {
            if(calif[i] >5) {
                System.out.println("Alumno numero " + (i + 1) + " Nota final: " + calif[i] + " Aprobado");
            }
            if(calif[i] <=5) {
                
                System.out.println("Alumno numero " + (i + 1) + " Nota final: " + calif[i] + " Reprobado");
            }
        }
        mayor = menor = calif [0];
       
        for (i = 0; i < calif.length; i++) {
            if(calif [i] > mayor) {
                mayor = calif[i];
            }
            if(calif[i]<menor) {
                menor = calif[i];
            }
        }
        System.out.println("calificacion de mayor valor es: "+mayor);
        System.out.println("calificacion de menor valor es: "+menor);
        System.out.println("Listado de calificacion  superiores a la media: ");
        for (i = 0; i < calif.length; i++) {
            if (calif[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + calif[i]);
            }
        }
    }
static void caso4()
{
    Scanner entrada = new Scanner (System.in);
        
    int matriza[][] = new int [3][3];
    int matrizb[][] = new int [3][3];
    int matrizs[][] = new int [3][3];
    int i, j;
    
    System.out.println("Datos de la matriz A.");
    for (i = 0; i <= 2; i++){
        for (j = 0; j <= 2; j++){
            System.out.print("Escriba el valor de [" + i + "] [" + j + "]: ");
            matriza [i][j] = entrada.nextInt();
        }
    }

    System.out.println("\nDatos de la matriz B.");
    for (i = 0; i <= 2; i++){
        for (j = 0; j <= 2; j++){
            System.out.print("Escriba el valor de [" + i + "] [" + j + "]: ");
            matrizb[i][j] = entrada.nextInt();
        }
    }
        
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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  opcion;
        
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Promedio ");
        System.out.println("2.-Promedio pares  ");
        System.out.println("3.-Calificaciones  ");
        System.out.println("4.-suma de la matriz   ");
        System.out.println("5.- Salir  ");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
            caso1();
            break;
            case 2:
            caso2();
            break;
            case 3:
            caso3();
            break;
            case 4:
            caso4();
            break;
        }
    }
}