package pl.javafirstapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while(shouldContinue){
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();
            /*Starsza wersja javy przykład switch

            switch (userChoice){
                case 1:
                    System.out.println("Wybrano 1");
                    break;
                case 2:
                    System.out.println("Wybrano 2");
                    break;
                case 3:
                    System.out.println("Wybrano 3");
                    break;
                case 4:
                    System.out.println("Wybrano 4");
                    break;
                case 5:
                    shouldContinue = false;
            }
            */

            switch (userChoice){
                case 1 -> System.out.println("Wybrano 1");
                case 2 -> System.out.println("Wybrano 2");
                case 3 -> System.out.println("Wybrano 3");
                case 4 -> System.out.println("Wybrano 4");
                case 5 -> shouldContinue = false;
            }
        }
    }
}
