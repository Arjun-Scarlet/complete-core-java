package e_oopsConcepts.Encapsulation;

import java.util.Scanner;
public class MobileDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mobile m = null;
		boolean choice = true;
		
		do {
			System.out.println("1. Add Mobile\n2. Fetch Details\n3. Price\n4. Change Color\n5. Exit\n");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.print("Enter mobile name: ");
					String name = sc.next();
					System.out.print("Enter RAM: ");
					int ram = sc.nextInt();
					System.out.print("Enter ROM: ");
					int rom = sc.nextInt();
					System.out.print("Enter color: ");
					String color = sc.next();
					System.out.print("Enter price: ");
					double price = sc.nextDouble();
			
					m = new Mobile(name, ram, rom, color, price);
					break;
				case 2:
					if(m==null) System.out.println("Mobile is not Added!");
					else System.out.println(m);
					break;
				case 3:
					if(m==null) System.out.println("Mobile is not Added!");
					else System.out.println(m.getPrice());
					break;
				case 4:
					if(m==null) System.out.println("Mobile is not Added!");
					else {
						System.out.println("Old color: "+m.getColor());
						System.out.print("Enter new color: ");
						String newColor = sc.next();
						m.setColor(newColor);
						System.out.print("New color: "+m.getColor());
					}
					break;
				case 5:
					choice = false;
					System.out.println("Thank You!");
					break;
				default:
					System.out.println("Invalid Choice!");
			}
		}while(choice);
		sc.close();
	}
}
