package pl.javafirstapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private List<String> guests = new ArrayList<>(); // pole klasy musi być prywatne
    Scanner scanner = new Scanner(System.in);

    public  void addGuest() { // Metoda dodawania gości
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
        guests.add(name);
    }

    public void displayGuests(){ //metoda wyswietlajaca listę gości
        for (String guest : guests) {
            System.out.println(guest);
        }
    
    }

}
