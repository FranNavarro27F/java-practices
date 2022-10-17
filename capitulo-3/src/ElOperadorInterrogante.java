import java.util.Scanner;

public class ElOperadorInterrogante {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.println("introduce un numero entero");
        int dividendo= scanner.nextInt();

        System.out.println("introduce otro numero entero");
        int divisor= scanner.nextInt();

        int resultado;

        System.out.println("el divisor es "+divisor+" y el dividendo es "+ dividendo);
        

        // if(divisor == 0){
        //     resultado=0;
        // }else{
        //     resultado = dividendo / divisor;
        // }

        resultado = divisor==0 ? 0 : dividendo/divisor;

        System.out.println("el resultado de dividir "+dividendo+" entre "+ divisor +" es "+ resultado);



    }
}
