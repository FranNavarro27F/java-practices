import javax.swing.SpinnerDateModel;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //operador and
        System.out.println("False & False es " + (false & false));
        System.out.println("True & False es " + (true & false));
        System.out.println("False & True es " + (false & true));
        System.out.println("True & True es " + (true & true));
        System.out.println("--------------------------------");

        //operador and de circuito corto: evalua el primero y si es false ya no evalua el segundo
        System.out.println("False & False es " + (false && false));
        System.out.println("True & False es " + (true && false));
        System.out.println("False & True es " + (false && true));
        System.out.println("True & True es " + (true && true));
        System.out.println("--------------------------------");

        //operador or 
        System.out.println("False | False es " + (false | false));
        System.out.println("True | False es " + (true | false));
        System.out.println("False | True es " + (false | true));
        System.out.println("True | True es " + (true | true));
        System.out.println("--------------------------------");

        //operador or de circuito corto: evalua el primero y si es true ya no evalua el segundo
        System.out.println("False || False es " + (false || false));
        System.out.println("True || False es " + (true || false));
        System.out.println("False || True es " + (false || true));
        System.out.println("True || True es " + (true || true));
        System.out.println("--------------------------------");

        //operador Xor
        System.out.println("False ^ False es " + (false ^ false));
        System.out.println("True ^ False es " + (true ^ false));
        System.out.println("False ^ True es " + (false ^ true));
        System.out.println("True ^ True es " + (true ^ true));
        System.out.println("--------------------------------");

        //operador not
        System.out.println("!False es "+ !false);
        System.out.println("!True es "+ !true);
       
        System.out.println("--------------------------------");


        

    }
}
