import java.util.Scanner;

public class laSentenciaIf {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int numeroPensado = 5;
        System.out.println("Adivina el número que estoy pensando del 1 al 10");
        int numeroIntroducido= scanner.nextInt();

        // if(numeroIntroducido==numeroPensado)System.out.println("Enhorabuena!!!");
        // else System.out.println("Lo sentimos, el numero que estaba pensando es el "+ numeroPensado);

        String color;

        if(numeroIntroducido == numeroPensado){
            color= "\033[0;32m";// se supone que colorea el mensaje a verde
            System.out.println(color+"Enhorabuena!!!");
            
        }else{ 
            color= "\033[0;31m";// se supone que colorea el mensaje a rojo
            System.out.println(color+"Lo sentimos, el numero que estaba pensando es el "+ numeroPensado);
        }

    }
}
