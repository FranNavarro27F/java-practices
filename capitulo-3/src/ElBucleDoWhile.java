import java.util.Scanner;

public class ElBucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double numero;

        do{
            System.out.println("Introduzca un numero y le mostramos la raiz cuadrada. para salir introduzca el 0");
            numero= scanner.nextDouble();
            if(numero == 0){
                System.out.println("hasta la vista");
            }else{
                System.out.println("La raiz cuadrada de"+ numero+" es "+ Math.sqrt(numero));
            }
        }while(numero != 0);
        
    }
}
