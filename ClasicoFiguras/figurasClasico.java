import java.util.Scanner;

class figurasClasico{

   

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int base, altura, opcion;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado;
    do{
        //el cuerpo del programa
        System.out.println("Elija el pokemon ");
        System.out.println("1.- charmander  ");
        System.out.println("2.- bulbasaor ");
        System.out.println("3.- squartle. ");
        System.out.println("4.- batalla");
        System.out.println("5.- Salir ");


        //asignar la opcion

        opcion = entrada.nextInt();

       

        switch (opcion) {
            case 1:
               

            case 2:
                

            case 3:
                

            default:
                System.out.println("Gracias por participar unu nwn/ ");
        

            
                
                
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letra == 's');
        
        //System.out.println(letra);
        
    }
}