package main.menu;

import main.operaciones.*;

import java.util.Scanner;

public class Menu {

    /*/////////////VARIABLES GLOBALES//////////////////*/
    static int entrada1;
    static int entrada2;

    /*/////////////METODOS//////////////////*/
    // SCANNER REUTILIZABLE
    private static String keyInt (){
        return new Scanner(System.in).next();
    }
    //MENU PRINCIPAL
    public static void menu(){
        boolean quit= false;
        while (!quit){
            System.out.println("Hola, esto es una Samicalculadora. \n Que operacion quieres hacer? \n 1)operaciones.Suma\n 2)operaciones.Resta\n 3)Multiplicacion \n 4)Division\n 5)Salir");
            int op = Integer.parseInt(keyInt());
            switch (op){
                case 1:
                    opMenu("Suma");
                    break;
                case 2:
                    opMenu("Resta");
                    break;
                case 3:
                    opMenu("Multi");
                    break;
                case 4:
                    opMenu("Divi");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println("Quieres salir? Y= si/ Any key=no");
            if ((keyInt()).equalsIgnoreCase("Y")){
                quit = true;
            }
        }
    }
    // Menu de operacion
    public static void opMenu(String modo){
        //inicializas a la interface
        Operaciones op  = getOperacion(modo);//metodo para retornar tipo de operacion
        System.out.println("Indica tu numero 1:");
        entrada1 = Integer.parseInt(keyInt());
        System.out.println("Indica tu numero 2:");
        entrada2 = Integer.parseInt(keyInt());
        System.out.println("El resultado es: " + op.calcular(entrada1,entrada2));
    }
    // Seleccionar operacion para la interfaz
    public static Operaciones getOperacion(String modo){
        if (modo.equals("Suma")){
            return new Suma();
        } else if (modo.equals(("Resta"))) {
            return new Resta();
        }else if (modo.equals(("Multi"))) {
            return new Multi();
        }else if (modo.equals(("Divi"))) {
            return new Divi();
        }
        return null;
    }
}
