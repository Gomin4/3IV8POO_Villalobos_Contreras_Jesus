import java.util.Scanner;

    public class EXAMPLE {
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        char operador;
        int x, y, valorfinal;
         System.out.print("Ingresar primer numero: ");
        x = entrada.nextInt();
        System.out.print("Ingresar segundo numero: ");
        y = entrada.nextInt();
        System.out.print("Ingresar operador(-,+,*,/):" );
        operador = entrada.next().charAt(0);
        switch(operador)
        {
        case '-':
                valorfinal = x-y;
                System.out.println("La resta es:"  + valorfinal);
                break;
        case '+':
                valorfinal = x+y;
                System.out.println("La suma es: " + valorfinal);
                break;
        case '*':
                valorfinal = x*y;
                System.out.println("La multiplicación es: "  + valorfinal);
                break;
        case '/':
                if(y!=0)
                {
                    valorfinal = x/y;
                    System.out.println("La división es :" + valorfinal);
                }
                else
                System.out.println("no se puede dividir entre cero");
                break;
                default:
                System.out.println("resultado no valido");
            }
        }
    }
                                          
               
        

