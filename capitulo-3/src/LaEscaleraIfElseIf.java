import java.util.Scanner;

public class LaEscaleraIfElseIf {
    public static void main(String[] args) {
        // en cuanto una de las condiciones se cumpla, el resto no se ejecutara cuando usamos esta estructura de escaleras else if
        

        Scanner scanner= new Scanner(System.in);

        System.out.println("escribe un numero entero y te dare informacion sobre el");
        int numeroIntroducido= scanner.nextInt();
        if(numeroIntroducido < 3){
            System.out.println("el numero introducido es menor que 3");
        }else if(numeroIntroducido < 5){
            System.out.println("el numero que has introducido esta entre 3 y 5");
        }else if(numeroIntroducido < 8){
            System.out.println("el numero que has introducido esta entre 5 y 8");
        }else{
            System.out.println("el numero introducido es mayor o igual que 8");
        }

    }
}
