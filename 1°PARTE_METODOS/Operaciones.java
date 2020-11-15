/*

Esta clase es la que va a tener una relacion con la clase principal, 
en esta se va a encargar de realizar los metodos necesarios para 
resolver lo siguiente

una calculadora
conversion de unidades
creacion de cuadros
movimiento de cuadro

*/

import java.util.Scanner;

public class Operaciones{

    //crear un objeto para manipular datos
    Scanner entrada = new Scanner(System.in);

    //vamos a crear un metodo menu

    public void menu(){

        char op;

        System.out.println("MENU");
        System.out.println("A.- Calculadora de edad");
        System.out.println("B.- Calculadora de area y perimetro");
        System.out.println("C.- Presupuesto de llamadas");
        System.out.println("D.- salir");
        System.out.println("Codigo hecho por Villalobos Contreras Jesus 3IV8");

        op = entrada.next().charAt(0);

        //vamos a crear un switch

        switch(op){

            case 'A':
                Edad();  
                break;

            case 'B':
               
                AP();
                
                break;  

            case 'C':
                llamadas();
                break;
               
            case 'D':
                
                break;


        }
    }

    //metodo para la calculadora

    public void AP(){
        int AP;
        double  base, altura, perimetro, area, radio;
        System.out.println("seleccione la figura a calcular");
        System.out.println("1.- circulo");
        System.out.println("2.- rectangulo");
        System.out.println("3.- cuadrado");
        System.out.println("4.- triangulo.");
        AP = entrada.nextInt();
        
        switch(AP){
            case 1:
            System.out.println("Introduce el radio del circulo.");
            radio = entrada.nextInt();
    
            perimetro = 2*3.14*radio;
            area = 3.14*radio*radio;
            System.out.println("La circunferencia es de " + perimetro + ".");
            System.out.println("El area es de " + area + ".");        
            break;

            case 2:
            System.out.println("Introduce la base del rectangulo.");
            base = entrada.nextInt();
    
            System.out.println("Introduce la altura del rectangulo.");
            altura = entrada.nextInt();
    
            perimetro = base*altura;
            area = 2*(base+altura);
            System.out.println("El perimetro es de " + perimetro + ".");
            System.out.println("El area es de " + area + ".");
    
            break;
            
            case 3:
            System.out.println("Introduce el valor de un lado del cuadrado.");
            base = entrada.nextInt();
    
            perimetro = base*4;
            area = base*base;
            System.out.println("El perimetro es de " + perimetro + ".");
            System.out.println("El area es de " + area + ".");
            break;

            case 4:
            Scanner entrada = new Scanner(System.in); //<= creo el objeto sc para recibir las entradas
            double ladoA,ladoB,ladoC,sp; //<== defino los valores de memoria
                    System.out.println(" 1) Ingrese el valor del lado A del triangulo:"); //Hacemos los print para que se ingresen los valores *3
                        ladoA=entrada.nextDouble(); //Recojo los valores que el usuario ingresa por consola  de cada uno de los lados * 3
                    System.out.println(" 2) Ingrese el valor del lado B del triangulo");
                        ladoB=entrada.nextDouble();
                    System.out.println(" 3) Ingrese el valor del lado C del triangulo");
                        ladoC=entrada.nextDouble();
                        
                        
                        if(ladoA>0){ //compruebo si el lado A es mayor a cero si no se envia al else *3 
                            if(ladoB>0){
                                if(ladoC>0){
                                    sp=(ladoA+ladoB+ladoC)/2; 
                                    area=(Math.sqrt(sp*(sp-ladoA)*(sp-ladoB)*(sp-ladoC)));
                                    if (area>0.0){
                                    System.out.println("no es un trinagulo posible");
                                    }else{
                                    System.out.println("EL area del triangulo es de:"+area);
                                    perimetro = ladoA+ladoB+ladoC;
                                    System.out.println("El perimetro es de " + perimetro);
                                    }
                                }else{
                                    System.out.println("El valor de el Lado C es negativo,solo es posible usar mayores que cero");
                                    System.exit(0);
                                    //si el lado C es negativo muestro el mensaje de error 
                                }
                            }else{
                                System.out.println("El valor de el Lado B es negativo,solo es posible usar mayores que cero");
                                System.exit(0);
                                    //si el lado B es negativo muestro el mensaje de error 
 
                            }
                        }else{
                            System.out.println("El valor de el Lado A es negativo,solo es posible usar mayores que cero");
                            System.exit(0);
                         //si el lado A es negativo muestro el mensaje de error 
 
                        }
            break;
        }
       
    }
    public void Edad(){ 
        int nacimiento;
        int actual;
        int edad;
    
            System.out.println("Ingrese su año de nacimiento: ");
            nacimiento=entrada.nextInt();
    
            System.out.println("Ingrese el año actual: ");
            actual=entrada.nextInt();
    
            edad = actual - nacimiento;
            System.out.println("Usted tiene " + edad+ " años de edad");
              
        }
    public void llamadas(){ 
        int credito = 3500, OP;
        double NA = 0.5, INTER = 0.6, CEL = 0.2;
        long TEL;
        System.out.println("Bienvenido Selecciona la opcion de tu conveniencia");
        System.out.println("1.- Consultar credito");
        System.out.println("2.- Deposito");
        System.out.println("3.- Factura");  
        OP = entrada.nextInt();
        switch(OP){
                //Lugar donde estara el metodo
            case 1:
                CREDITOFINAL();
                break;
            case 2:
                DEPOSITO();
                break;
            case 3:
                DIFERENCIA();
            default:
                break;
        }
            
    }
    public void CREDITOFINAL(){             
        int credito = 3500, OP;
        System.out.println("Ingrese su numero celular");
        System.out.println("Usted tiene un credito de $"+credito);

    } 
    public void DEPOSITO(){ 
        int credito = 3500, OP;
        double NA = 0.5, INTER = 0.6, CEL = 0.2;
        long TEL;
        double ad;           
        System.out.println("A seleccionado deposito");
        System.out.println("Deposite el dinero que quiera agregar");
        ad=entrada.nextDouble();
        credito = credito+(int)ad;
        System.out.println("Su credito actual es de: $"+credito);
    }
    public void DIFERENCIA(){   
        double NA = 0.5, INTER = 0.6, CEL = 0.2;
        long TEL;
        int credito = 3500;           
        System.out.println("A seleccionado facturacion");
        System.out.println("Ingrese el numero de llamadas NACIONALES");
        NA=entrada.nextDouble();
        System.out.println("Ingrese el numero de llamadas INTERNACIONALES");
        INTER=entrada.nextDouble();
        System.out.println("Ingrese el numero de llamadas CELULARES");
        CEL=entrada.nextDouble();
        credito = credito - ((int)NA+(int)INTER+(int)CEL);
        System.out.println("Su credito actual es de: $"+credito);
    }         
}


