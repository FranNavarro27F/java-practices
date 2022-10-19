public class Informador {

//constantes para tener colores en consola
    public static final String COLOR_POR_DEFECTO= "\u001B[0m";
    public static final String COLOR_NEGRO= "\u001b[30m";
    public static final String COLOR_ROJO= "\u001B[31m";
    public static final String COLOR_VERDE= "\u001B[33m";
    public static final String COLOR_AMARILLO= "\u001B[33m";
    public static final String COLOR_AZUL= "\u001b[34m";

    void mostrarPorPantalla(int entero){
        System.out.println("Mostrando el entero "+ entero);
    }
    
    void mostrarPorPantalla(double decimal){
        System.out.println("Mostrando el decimal "+ decimal);
    }

    void mostrarPorPantalla(String palabra){
        System.out.println("Mostrando la palabra "+ palabra);
    }

    void mostrarPorPantalla(String palabra, String color){
        System.out.println(color + "Mostrando la palabra "+ palabra + COLOR_POR_DEFECTO );
    }


}
