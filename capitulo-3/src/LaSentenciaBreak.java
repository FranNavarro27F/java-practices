public class LaSentenciaBreak {
    public static void main(String[] args) {
        

        int numeroEncontrado;
        for(numeroEncontrado = 2567; numeroEncontrado <= 3642; numeroEncontrado ++){
            System.out.println("¿Sera el numero ?"+ numeroEncontrado);
            if((numeroEncontrado % 2 == 0) && (numeroEncontrado % 3 == 0) && (numeroEncontrado % 5 == 0)){
                break;
            }
        }
        if(numeroEncontrado > 3642){
            System.out.println("No hay ningun numero entre 2567 y 3642 que sea multiplo de 2,3 y 5");
        }else{
            System.out.println("El primer multiplo de 2, 3 y 5 entre 2567 y 3642 es "+ numeroEncontrado);
            
        }
    }
   
}
