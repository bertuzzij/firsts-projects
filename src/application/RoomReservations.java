package application;

import entities.Guest;
import java.util.Scanner;

public class RoomReservations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Guest[] vect = new Guest[10];// instanciado um vetor de 10 posições nulos

		System.out.printf("How many rooms will be rented? ");
		int rooms = scan.nextInt();

		for (int i = 1; i <= rooms; i++) {
			scan.nextLine();
			System.out.printf("Rent #" + i);
			System.out.printf("%nInsert a name for the reservation: ");
			String name = scan.nextLine();

			System.out.printf("Insert a email: ");
			String email = scan.nextLine();

			System.out.printf("Select your room (1 -10): ");
			int room = scan.nextInt();

			vect[room] = new Guest(name, email);// instanciado um vetor a partir dos quartos reservados
		}

		System.out.printf("%nBusy rooms: %n");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

// Marcação para eu não esquecer esse raciocínio {
//        String reservation = "";
//        for (int i = 0; i < n; i++) {
//        reservation = vect[i].getName()
//        			+" , E-mail: "+ vect[i].getEmail()
//					+" , Room: "+room;
//        
//        System.out.printf(reservation+"%n");
//        }
//		}

			scan.close();
		}
	}
}
