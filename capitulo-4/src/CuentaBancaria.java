public class CuentaBancaria {
    //variables de instancia
    String titular;
    String tipoDeCuenta;
    double saldo;

    //constantes
    public static final String TIPO_AHORRO= "ahorro";
    public static final String TIPO_NOMINA= "nómina";


    //constructores ( los constructores no retornan nada )
    CuentaBancaria(String t, String tipo, double s){
        titular= t;
        tipoDeCuenta= tipo;
        saldo= s;

    }

    CuentaBancaria(String t, double s){
        titular= t;
        tipoDeCuenta= TIPO_AHORRO;
        saldo= s;

    }



    CuentaBancaria(){
        tipoDeCuenta= TIPO_AHORRO;

    }


    //metodos
    void sacarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo -= cantidad;
    }

    void ingresarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(String nuevoTipo){
        tipoDeCuenta= nuevoTipo;
    }

    double obtenerSaldo(){
        return saldo;
    }


}
