public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        boolean esUnoMayorQueDos= 1 > 2;
        System.out.println("¿es cierto que 1 es mayor que 2? :"+ esUnoMayorQueDos);

        boolean esUnoComaCincoMenorQueSieteComaDos= 1.5 < 7.2;
        System.out.println("¿es cierto que 1.5 es menor que 7.2? :"+ esUnoComaCincoMenorQueSieteComaDos);

        boolean esOchoMayorOIgualQueOcho= 8 >= 8;
        System.out.println("¿es ocho mayor o igual que ocho? :"+ esOchoMayorOIgualQueOcho);

        boolean esTresComaUnoIgualQueTresComaDos= 3.1 == 3.2;
        boolean esCuatroDiferenteDeCuatro= 4 != 4;
        System.out.println("¿es 3.1 igual a 3.2? "+ esTresComaUnoIgualQueTresComaDos);
        System.out.println("¿es cuatro diferente de cuatro? "+ esCuatroDiferenteDeCuatro);

        String perro= "perro";
        String gato= "gato";
        // System.out.println("¿es cierto que el string perro es igual al string gato? " + perro == gato);
        // el comentario anterior ignora la salida por consola de la string solo tira boolean, por alguna razon...
        boolean esPerroIgualAGato= perro == gato;
        System.out.println("¿es cierto que el string perro es igual al string gato? "+esPerroIgualAGato);
        

 


    }
}
