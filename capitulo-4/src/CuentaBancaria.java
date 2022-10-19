public class CuentaBancaria {
    //variables de instancia
    String titular;
    String tipoDeCuenta;
    double saldo;

    //constructores ( los constructores no retornan nada )
    CuentaBancaria(String t, String tipo, double s){
        titular= t;
        tipoDeCuenta= tipo;
        saldo= s;

    }

    CuentaBancaria(){
        tipoDeCuenta= "ahorro";
        
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
