package tarea1;

import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Repite mensaje");
            System.out.println("2. Media");
            System.out.println("3. Salir");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Dime un número mayor a 0");
                int numberR = scanner.nextInt();
                scanner.nextLine();
                while (numberR <= 0) {
                    System.out.println("Dime un número mayor a 0");
                    numberR = scanner.nextInt();
                    scanner.nextLine();

                }
                System.out.println("Introduce un mensaje");
                String message = scanner.nextLine();
                scanner.nextLine();
                for (int i = 0; i < numberR; i++) {
                    System.out.println("message");
                }
            } else if (option == 2) {
                System.out.println("¿Cúantos números vas a introducir?");
                int numberI = scanner.nextInt();
                while (numberI <= 0) ;
                {
                    System.out.println("El número tiene que ser mayor a 0");
                    numberI = scanner.nextInt();
                    scanner.nextLine();
                }
                int media = 1;
                for (int x = 0; x < numberI; x++) {
                    System.out.println("Dime el número");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();

                    media = media + n1;

                }
                System.out.println("La media de los números introducidos es:" + (media / numberI));

            }

        } while (option != 3);
    }
}
