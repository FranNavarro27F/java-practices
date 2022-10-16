import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("   Escriba 1 para consultar su saldo");
        System.out.println("   Escriba 2 para ingresar dinero");
        System.out.println("   Escriba 3 para sacar dinero");
        System.out.println("   Escriba 4 para consultar sus últimos movimientos");
        System.out.println("Una vez escrita la opción, pulse la tecla Enter ");
        
        Scanner scanner= new Scanner(System.in);
        int numero= scanner.nextInt();

        System.out.println("El numero que digito es: "+numero);
        


    }
}
