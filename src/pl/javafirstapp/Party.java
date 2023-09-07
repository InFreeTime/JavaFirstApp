package pl.javafirstapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private List<Guest> guests = new ArrayList<>(); // pole klasy musi być prywatne
    Scanner scanner = new Scanner(System.in);

    public  void addGuest() { // Metoda dodawania gości
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if (isVeganString.equals("Y")){
            isVegan = true;
        }else{
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber,isVegan);


        guests.add(guest);
    }

    public void displayGuests(){ //metoda wyswietlajaca listę gości
        for (Guest guest : guests) {
            guest.displayGuestInformation();
            System.out.println();
        }
    }
}
