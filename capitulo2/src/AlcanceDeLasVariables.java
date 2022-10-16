public class AlcanceDeLasVariables {
    public static void main(String[] args) {
        
        int dias= 0;

        while (dias < 30){// lo declarado dentro del scope del while no puede ser usado fuera del mismo, tampoco se permite definir una variable con el mismo nombre.
            
            dias= dias +1;
            int semanas= dias / 7;
            System.out.println("Han pasado "+ dias + "dias lo que supone " + semanas + "semanas");
            
        }

        int años= dias / 365;

    }
}