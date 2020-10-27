import java.util.Scanner;

class casos{


    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner digito = new Scanner(System.in);
        Scanner inicio = new Scanner(System.in);
        Scanner iniciacion = new Scanner(System.in);
        Scanner comienzo = new Scanner(System.in);
        //variables
        long factorial=1;
        int  opcion, num, seleccion, derecho,edad,socios,ene;
        int positivos = 0;
        int negativos = 0;
        int total = 0;
        int precioteclado=777;
        int preciomouse=560;
        int totalnum;
        char letra,operador;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado,base, altura, radio, area, perimetro, temperatura,valor,abono,teclado, mouse, producto,leer, x, y,valorfinal;
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Bono ");
        System.out.println("2.- Pasar un numero a Binario ");
        System.out.println("3.- Coversor de temperatura ");
        System.out.println("4.- positivo y negativo ");
        System.out.println("5.- precios ");
        System.out.println("6.- area y perimetro ");
        System.out.println("7.- tabla de valores ");
        System.out.println("8.- factorial ");
        System.out.println("9.- Calculadora ");
        System.out.println("10.- Salir ");
        //asignar la opcion

        opcion = entrada.nextInt();
        seleccion = entrada.nextInt();
        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
            System.out.println("Escribe tu edad: "); 
            edad = entrada.nextInt();
            System.out.println("Escribe tu abono: "); 
            abono = entrada.nextDouble();
            
           if (edad > 65){
               
                abono = abono*.6;
                System.out.println("El total a pagar es: " + abono);
            }
            if (edad < 21){
               System.out.println("Si tus padres son socios, selecciona 1. De lo contrario, selecciona 2.");
    
               socios = entrada.nextInt();
    
                switch (socios){
                    case 1: 
                    abono = abono*.55;
                    System.out.println("El total a pagar es:" + abono);
    
                    break;
                    default:
                    abono = abono*.75;
                    System.out.println("El total a pagar es: " + abono);
    
                }
                
            }
            System.out.println("Tu edad es: " + edad); 
            System.out.println("El total a pagar es: " + abono); 
        
                break;

            case 2:
                    System.out.println("Ingrese un número en el sistema decimal positivo");
                    int numero = scanner.nextInt();
                    String binario = "";
                    if (numero > 0) {
                        while (numero > 0) {
                            if (numero % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numero = (int) numero / 2;
                        }
                    } else if (numero == 0) {
                        binario = "0";
                    } else {
                        binario = "No se pudo convertir el numero. Ingrese solo numeros positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
            
                break;

            case 3:
            System.out.println("Ingrese su temperatura en grados Farenheit");
            temperatura = entrada.nextInt();
    
            System.out.println("Escoja a que grados quiere convertir");
            System.out.println("1.- Celsius.");
            System.out.println("2.- Kelvine.");
            System.out.println("3.- Rankine");
    
            derecho = entrada.nextInt();
    
            switch (derecho){
    
                case 1: 
                valor = (temperatura-32)*5/9;
                System.out.println(temperatura + " farehnheit es igual a " + valor + " celsius.");
                break;
                case 2:
                valor = ((temperatura-32)*5/9)+273.15;
                System.out.println(temperatura + " farehnheit es igual a " + valor + " kelvine.");
                break;
                case 3:
                valor = temperatura+459.67;
                System.out.println(temperatura + " farehnheit es igual a " + valor + " rankine.");
                break;
                default:
                System.out.println("Gracias por participar, vuelva pronto.");
                
            }      
                break;

            case 4:
            System.out.println("Inserte la cantidad de numeros que quiere digitar.");
    
            total = entrada.nextInt();
    
            do{
                System.out.println("Digite el numero");
    
                totalnum = entrada.nextInt();
    
                if(totalnum == 0){
                    positivos = positivos+0;
                } else { 
                    if(totalnum>0){
                            positivos = positivos +1;
                    }else{
                        negativos = negativos+1;
                    }
    
                }
    
                total = total-1;
    
                }while (total!=0);
    
                System.out.println("El total de positivos es: " + positivos);
    
                System.out.println("El total de negativos es: " + negativos);
        
                break;

            case 5:
                    {
                        System.out.println("Ingrese la cantidad de teclados que lleva.");
                        teclado = entrada.nextInt();
                        System.out.println("Ingrese la cantidad de mouse que lleva.");
                        mouse = entrada.nextInt();
                        producto=(teclado*precioteclado)+(mouse*preciomouse);
                        System.out.println("El total de los productos adquiridos es de: "+producto);
                        resultado=producto*.16;
                        resultado=producto+resultado;
                        System.out.println("El total de su compra es de: "+resultado);
                    }    
                break;

            case 6:
            System.out.println("Seleccione la opcion que requiera.");
            System.out.println("1: Area y perimetro de un rectangulo.");
            System.out.println("2: Area y perimetro de un triangulo.");
            System.out.println("3: Volumen de una esfera.");
            System.out.println("4: Volumen de un cilindro.");
    
            seleccion = entrada.nextInt();
    
            switch(seleccion){
    
                case 1:
                System.out.println("ingrese la altura del rectangulo.");
                altura = entrada.nextDouble();
    
                System.out.println("ingrese la base del rectangulo.");
                base = entrada.nextDouble();
    
                perimetro = (base*2)+(altura*2);
                area = base * altura;
                System.out.println("El perimetro del rectangulo es: " + perimetro);
                System.out.println("El area del rectangulo es: " + area);
    
                break;
    
                case 2:
                System.out.println("ingrese la altura del triangulo.");
                altura = entrada.nextDouble();
    
                System.out.println(" ingrese la base del triangulo.");
                base = entrada.nextDouble();
    
                perimetro = (base*3);
                area = (base * altura)/2;
                System.out.println("El perimetro del triangulo es: " + perimetro);
                System.out.println("El area del triangulo es: " + area);
    
                break;
    
                case 3:
                System.out.println(" ingrese el radio de la esfera.");
                base = entrada.nextDouble();
    
                area = (3/4)*3.1415926*(base*base*base);
    
                System.out.println("El volumen de la esfera es: " + area);
    
                break;
    
                case 4:
                System.out.println(" ingrese el radio del cilindro.");
                base = entrada.nextDouble();
    
                System.out.println(" ingrese la altura del cilindro.");
                altura = entrada.nextDouble();
    
                area = 3.1415926*base*base*altura;
    
                System.out.println("El volumen del cilindro es: " + area);
    
                default: 
    
                System.out.println("Gracias Buen dia");
            }
         
                break;
            case 7:
            for(ene=1; ene<=10; ene=ene+1){

                System.out.println(ene+" "+(ene*10)+" "+(ene*100)+" "+(ene*1000));
            }
                break;
            
            case 8:
            System.out.print("Introduce un número: ");
            num = digito.nextInt();
            for (int i = num; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
         
                break;
            case 9:
            System.out.print("Ingresar primer numero: ");
            x = entrada.nextDouble();
            System.out.print("Ingresar segundo numero: ");
            y = entrada.nextDouble();
            System.out.print("Ingresar operador(-,+,*,/):" );
            operador = entrada.next().charAt(0);
            switch(operador)
            {
            case '-s:
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
              break;
            default:
                System.out.println("Gracias por participar ");





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