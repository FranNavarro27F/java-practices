import java.io.OutputStream;

import javax.print.attribute.standard.NumberOfDocuments;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        int numeroDos= 2;
        int numeroTres= 3;
        int resultadoSuma= numeroDos + numeroTres;

        System.out.println("el resultado de sumar numero2 y numero3 es : "+ resultadoSuma);
        System.out.println("esto es un String " + " y lo concateno con este otro");

        int reultadoRest= numeroTres - numeroDos;
        int numeroDosConCambioDeSigno= -numeroDos;
        System.out.println("Si aplicamos el operador de resta a numeroDos obtenemos "+ numeroDosConCambioDeSigno);

        double resultadoMultiplicacion= numeroTres * 3.5;
        double resultadoDivision= (double)numeroDos / numeroTres;
        System.out.println("resultadoDivision contiene "+ resultadoDivision);

        int resultadoModulo= numeroTres % numeroDos;
        System.out.println("el resto de dividir 3 entre 2 es " + resultadoModulo);
        

    }
    
}
