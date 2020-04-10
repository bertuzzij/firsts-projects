package application;

import entities.Guest;

import java.util.Scanner;

public class RoomReservations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("How many rooms will be rented? ");
        int rooms = scan.nextInt();

        Guest[] vect = new Guest[rooms];

        for (int i = 0; i < vect.length; i++){
            scan.nextLine();
            System.out.printf("Insert a name for the reservation: ");
            String name = scan.nextLine();
            System.out.printf("Insert a email: ");
            String email = scan.nextLine();
            System.out.printf("Select your room (1 -10): ");
            int room = scan.nextInt();
            vect[i] = new Guest(name, room, email);

            //vect[i].getRoom();
        }

        System.out.println();

        scan.close();
    }
}
