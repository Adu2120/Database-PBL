package main;

import DB.Create;
import DB.Insert;
import DB.Select;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		String[] event = new String[5];
		String[] participent = new String[5];
		Create c = new Create(); 
		while(true) {
			System.out.println("1. Organizer : ");
			System.out.println("2. registration team : ");
			System.out.println("3. Display participents : ");
			System.out.println("4. Display Events: ");
			System.out.println("5. Exit : ");
			System.out.println("Choose any one : ");
			int op = sk.nextInt();
			switch(op) {
				case 1:
					System.out.println("1. Event id: ");
					event[0] = sk.nextLine();
					event[0] = sk.nextLine();
					System.out.println("2. Event Name: ");
					event[1] = sk.nextLine();
//					event[1] = sk.nextLine();
					System.out.println("3. Event Date(dd-mm-yyyy): ");
					event[2] = sk.nextLine();
//					event[2] = sk.nextLine();
					System.out.println("4. Year: ");
					event[3] = sk.nextLine();
//					event[3] = sk.nextLine();
					System.out.println("5. Venue: ");
					event[4] = sk.nextLine();
//					event[4] = sk.nextLine();
					Insert i = new Insert(event[0], event[1], event[2], event[3], event[4],true);
				break;
				
				case 2:
					System.out.println("1. Participent Name: ");
					participent[0] = sk.nextLine();
					participent[0] = sk.nextLine();
					System.out.println("2. Contact Number: ");
					participent[1] = sk.next();
					System.out.println("3. Name of College: ");
					participent[2] = sk.nextLine();
					participent[2] = sk.nextLine();
					System.out.println("4. Email: ");
					participent[3] = sk.next();
					System.out.println("5. Event Name: ");
					participent[4] = sk.nextLine();
					participent[4] = sk.nextLine();
					Insert j = new Insert(participent[0],participent[1], participent[2],participent[3],participent[4]);
				break;
				
				case 3:
					try {
						Select i1 = new Select("Participent");
					}catch(Exception e) {
						e.printStackTrace();
					}
				break;
				
				case 4:
					try {
						Select i2 = new Select("Event");
					}catch(Exception e) {
						e.printStackTrace();
					}
				break;
				
				case 5:
					System.exit(0);
				
				default:
					System.out.println("You have choosen wrong option. please try again");
			}		
			
		}
	}
}
