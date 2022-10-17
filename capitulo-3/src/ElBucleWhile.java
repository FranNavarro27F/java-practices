import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor, introduzca el numero que quiera realizar la la raiz cuadrada");

        double numero= scanner.nextDouble();
        double candidatoARaizCuadrada= 0.0;
        while(candidatoARaizCuadrada * candidatoARaizCuadrada <= numero){
            candidatoARaizCuadrada += 0.01;
            System.out.println("¿sera el numero "+candidatoARaizCuadrada+"?"+"su cuadrado es: "+ candidatoARaizCuadrada);

        }
        candidatoARaizCuadrada -= 0.01;
        System.out.println("La raiz cuadrada que hemos caluclado es "+ candidatoARaizCuadrada);
        System.out.println("La raiz cuadrada real es "+ Math.sqrt(numero));
        

    }
}
