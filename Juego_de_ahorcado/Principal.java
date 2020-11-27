import java.util.Scanner;


/**
 *
 * @author clase
 */
public class Principal {
    
    
    public static void main(String arg[]){
        String entrada = "";
        Scanner sc = new Scanner(System.in);
        

        do { // Este bucle representa cada una de las partidas del ahorcado
            System.out.println("\nNUEVA PARTIDA.");
            System.out.println("Si sabe la palabra escriba RESUELVO:(su  palabra) Ejemplo: RESUELVO:PERRO");
            System.out.println("Si no sabe la respuesta escriba (ME RINDO)");
            Ahorcado ahorcado = new Ahorcado();
            do {    // Este bucle representa una partida concreta del ahorcado
                System.out.printf("%n%s",ahorcado.getPalabraMostrar());
                System.out.println("\nEscribe una letra de la palabra:");
                entrada = sc.nextLine().toUpperCase();
                System.out.printf("%nNúmero de intentos:%d",ahorcado.getNumIntentos());
                if (entrada.equals("SALIR")){
                    break;
                }

                if (entrada.length()==1){   // Estamos jugando con una letra
                    ahorcado.intentar(entrada.charAt(0));
                }
                else{                       
                    if ((entrada.contains(Ahorcado.CAD_RESOLVER)) || 
                       ((entrada.contains(Ahorcado.CAD_ME_RINDO)))){
                        ahorcado.intentar(entrada);
                    }
                    else{
                        System.out.println("\nFormato de entrada incorrecto. Vuelva a intentarlo...");
                    }
                }
            }while(!ahorcado.getFinPartida());
            
            System.out.println("\nJuego acabado");
            System.out.printf("%n%s",ahorcado.getPalabraMostrar());
            System.out.printf("%nPartidas ganadas:%d",Ahorcado.getPartidasGanadas());
            System.out.printf("%nPartidas perdidas:%d",Ahorcado.getPartidasPerdidas());
            System.out.println("                                    Escriba SALIR para finalizar el programa");
        }while(!entrada.equals("SALIR"));
        
        
        
    }
}

