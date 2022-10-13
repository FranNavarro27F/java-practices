import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //aca usamos la una instancia de la clase Scanner (tenemos que importarla: import java.util.Scanner;) para poder usar la entrada y salida de datos por consola.

        
        Scanner entrada= new Scanner(System.in);    

        //la entrada de datos si es float, tiene que tener una "," para que lo tome como puntod ecimal.
        float numero;
        System.out.println("Digite un numero con coma decimal:  ");

        // numero= entrada.nextInt();
        numero= entrada.nextFloat();



        System.out.println("El numero es: "+numero);
    



    }
}
