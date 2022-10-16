public class Literales {
    public static void main(String[] args) {
        
        int enteroDecimal= 100;// esto es un literal (100)

        int enteroOctal= 0100;// esto es en sistema octal (64)

        int enteroHexadecimal= 0x100;// esto es en sistema hexadecimal (256)

        System.out.println("enteroHexadecimal es: "+ enteroOctal);

        long numeorLong= 100L;

        double numeroDouble= 2.5;

        float numeroFloat= 2.5f;

        int numeroConGiones= 25_258_236;// los guiones ayudan a la legivilidad del desarrollador :) no se ve afectado el resultado.
        
        System.out.println("el numero con giones es: "+numeroConGiones);

        char miCharJ= 'b';

        char miOtroChar= '\u0062';// codigo unicode de b 

        System.out.println("el carácter miOtroChar es: "+ miOtroChar);

        char comillaSimple= '\'';

        String stringLiteral= "Esto es un literal";

        boolean booleanoVerdadero= true;

        String stringNulo= null;

        

    }
    
}
