public class TiposDeDatosPrimitivos {
    public static void main(String[] args) {
        
        //typos de datos en java :)

        byte elMenorByte= Byte.MIN_VALUE;
        byte elMayorByte= Byte.MAX_VALUE;

        System.out.println("el menor valor de un dato de tipo byte es: "+elMenorByte);
        System.out.println("el mayor valor de un dato de tipo byte es: "+elMayorByte);

        short elMenorShort= Short.MIN_VALUE;
        short elMayorShort= Short.MAX_VALUE;

        System.out.println("el menor valor de un dato de tipo short es: "+ elMenorShort);
        System.out.println("el mayor valor de un dato de tipo short es: "+ elMayorShort);

        System.out.println("los valores que pueden guardar en un dato de tipo Integer van desde el :"+Integer.MIN_VALUE+" al "+Integer.MAX_VALUE);

        System.out.println("los valores que pueden guardar en un dato de tipo Long van desde el :"+Long.MIN_VALUE+" al "+Long.MAX_VALUE);

        float variableFloat= 5.6f;

        double variableDouble= 5.6;

        char a= 'a';// para pasar de letra "a" a letra "b" podemos sumarle uno, es es por el valor en unicode!
        
        boolean trueBoolean= true;
        boolean falseBoolean= false;


    }
    
}
