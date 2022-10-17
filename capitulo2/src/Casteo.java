public class Casteo {
    public static void main(String[] args) {
        
        // em este ejemplo generamos un casteo de tipo int a float
        int variableDeTipoInt= 10;
        float variableDeTipoFloat= variableDeTipoInt;
        System.out.println("la variable de tipo float vale: "+ variableDeTipoFloat);

        // aca hacemos casteo de tipo float a double
        double variableDeTipoDouble= variableDeTipoFloat;
        System.out.println("la variable de tipo double vale: "+variableDeTipoDouble);

        // otra forma de casteo 
        double otraVariableDeTipoDouble= 2.76;
        int otraVariableDeTipoInt= (int)otraVariableDeTipoDouble;
        System.out.println("el resultado del casteo de otraVariableDeTipoDouble a int es: "+ otraVariableDeTipoInt);

        byte variable1 = 5;
        byte variable2 = 10;
        byte suma= (byte)(variable1 + variable2);
        System.out.println("el resultado del casteo a byte es: "+ suma);
        

        





    }
}
