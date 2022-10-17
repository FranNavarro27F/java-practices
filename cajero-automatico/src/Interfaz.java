import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) throws Exception {
        int numero;
        do{ 
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("   Escriba 1 para consultar su saldo");
            System.out.println("   Escriba 2 para ingresar dinero");
            System.out.println("   Escriba 3 para sacar dinero");
            System.out.println("   Escriba 4 para consultar sus últimos movimientos");
            System.out.println(" Una vez escrita la opción, pulse la tecla Enter ");
            System.out.println(" Para salir escriba cualquier otro numero");
            
            Scanner scanner= new Scanner(System.in);
            numero= scanner.nextInt();
    
            switch(numero){
                case 1:
                    System.out.println("La opcion que usted ha elegido es consultar su saldo");
                    break;
                case 2:
                    System.out.println("La opcion que usted ha elegido es ingresar dinero");
                    break;
                case 3:
                    System.out.println("La opcion que usted ha elegido es sacar dinero");
                    break;
                case 4:
                    System.out.println("La opcion que usted a elegido es consultar sus ultimos movimientos");
                    break;
                default:
                    System.out.println("Muchas gracias por usar nuestros servicios");

            }
            System.out.println("------------------------------------------------------");

        }while(numero == 1 || numero == 2 || numero == 3 || numero == 4);
        


    }
}
