import java.util.Scanner;

class pokedex{

   

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

        int id1=102;
        int id2=103;
        int id3=104;
        int fuerza1=45;
        int fuerza2=49;
        int fuerza3=50;
        int defensa1=100;
        int defensa2=95;
        int defensa3=98;
        int vida1=100;
        int vida2=109;
        int vida3=104;
        int ataque11= 45;
        int ataque12= 56;
        int ataque13=34;
        int ataque21=56;
        int ataque22=78;
        int ataque23=23;
        //asignar la opcion

        opcion = entrada.nextInt();

       

        switch (opcion) {
            case 1:
            System.out.println("charmander"); 
            System.out.println("id "+id1); 
            System.out.println("fuerza "+fuerza1);
            System.out.println("defensa "+defensa1);
            System.out.println("vida "+vida1);
            System.out.println("ataque 1: Bola ignea "+ataque11);
            System.out.println("ataque 2: llamarada "+ataque21);
            break;
            case 2:
            System.out.println("bulbasaor");
            System.out.println("id "+id2);  
            System.out.println("fuerza "+fuerza2);
            System.out.println("defensa "+defensa2);
            System.out.println("vida "+vida2);
            System.out.println("ataque 1: rocas "+ataque12);
            System.out.println("ataque 2: semillas "+ataque22); 
            break;
            case 3:
            System.out.println("squartle");
            System.out.println("id"+id3); 
            System.out.println("fuerza "+fuerza3);
            System.out.println("defensa "+defensa3);
            System.out.println("vida "+vida3);
            System.out.println("ataque 1: bola de agua "+ataque13);
            System.out.println("ataque 2: nadar "+ataque23);   
            break;
            case 4:
            System.out.println("Batalla");
      Scanner teclado = new Scanner(System.in);
 
      int seleccionCompu = (int)(Math.random() * 3) + 1;
      System.out.println("La computadora ya escogio...");
 
      System.out.print("Indique su seleccion [1=charmander, 2=bulbasur, 3=squartle]: ");
      int seleccionUsuario = teclado.nextInt();
 
      System.out.print("La computadora habia escogido: ");
      switch ( seleccionCompu )
      {
         case 1:
            System.out.println("bulbasur");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Empate!"); break;
               case 2: System.out.println("los puntos de vidas del pokemon enemigo sean reducido a 0!"); break;
               case 3: System.out.println("los puntos de vidas de tu pokemon sean reducido a 0!"); break;
            }
            break;
 
         case 2:
            System.out.println("charmander");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("los puntos de vidas de tu pokemon sean reducido a 0!"); break;
               case 2: System.out.println("Empate!"); break;
               case 3: System.out.println("los puntos de vidas del pokemon enemigo sean reducido a 0!"); break;
            }
            break;
 
         case 3:
            System.out.println("squartle");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("los puntos de vidas del pokemon enemigo sean reducido a 0!"); break;
               case 2: System.out.println("los puntos de vidas de tu pokemon sean reducido a 0!"); break;
               case 3: System.out.println("Empate!"); break;
            }
            break;
      }  
            break;
            default:
                System.out.println("regresa pronto ");
        

            
                
                
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