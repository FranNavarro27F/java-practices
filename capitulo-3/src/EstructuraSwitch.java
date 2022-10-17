import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("por favor, introduzca el dia de la semana que quiere su cita");
        String dia= scanner.nextLine();

        // switch (dia){
        //     case "lunes":
        //         System.out.println("El lunes puede venir de 11:00 a 12:30");
        //         break;
        //     case "martes":
        //         System.out.println("El martes puede venir de 15:30 a 17:30");
        //         break;
        //     case "miercoles":
        //         System.out.println("El miercoles puede venir de 11:00 a 12:30");
        //         break;
        //     case "jueves":
        //         System.out.println("El Jueves puede venir de 15:30 a 17:30");
        //         break;
        //     case "viernes":
        //         System.out.println("El viernes puede venir de 09:00 a 11:00");
        //         break;
        //     case "sabado":
        //         System.out.println("El sabado nuestra clinica permanecera cerrada");
        //         break;
        //     case "domingo":
        //         System.out.println("El domingo nuestra clinica permanecera cerrada");
        //         break;
        //     default:
        //         System.out.println("no se ha introducido un dia valido");


            // refactoreamos el codigo anterior:
        switch (dia){
            case "lunes":
            case "miercoles":
                System.out.println("El "+ dia +" puede venir de 11:00 a 12:30");
                break;
            case "martes":
            case "jueves":
                System.out.println("El "+ dia +" puede venir de 15:30 a 17:30");
                break;
            
            case "viernes":
                System.out.println("El viernes puede venir de 09:00 a 11:00");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El "+ dia +" nuestra clinica permanecera cerrada");
                break;
           
            default:
                System.out.println("no se ha introducido un dia valido");
        }


    }
}
