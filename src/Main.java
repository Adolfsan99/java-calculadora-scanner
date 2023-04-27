import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int num1;
        int num2;
        String option = "";

        Scanner INPUT = new Scanner(System.in);


        do {
        System.out.println(" ");
        System.out.println("*** BIENVENIDO A MI CALCULADORA ***");
        System.out.println("Por el momento puedes realizar: suma, resta");
        System.out.println("Ingrese la operacion a realizar!");
        option = INPUT.nextLine();

        switch (option) {

            case "suma":
            System.out.println("*** SUMA ***");
            System.out.println("Ingrese el numero 1!");
            num1 = INPUT.nextInt();
            System.out.println("Ingrese el numero 2");
            num2 = INPUT.nextInt();
            System.out.println("RESULTADO SUMA: " + (num1 + num2));
            break;

            case "resta":
                System.out.println("*** RESTA ***");
                System.out.println("Ingrese el numero 1");
                num1 = INPUT.nextInt();
                System.out.println("Ingrese el numero 2");
                num2 = INPUT.nextInt();
                System.out.println("RESULTADO RESTA: " + (num1 - num2));
            break;

            default:
            System.out.println("Ingrese una operacion valida!");
            break;
        }

    } while (option!="salir");
    }

}