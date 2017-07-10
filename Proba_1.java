package vezbanje_metoda_funkcija;
import java.util.Scanner;
public class Proba_1 {
	
	static void meni() {
		System.out.println("-------MENI-------\n");
		System.out.println("1. Spisak godina");
		System.out.println("2. Spisak meseci");
		System.out.println("3. Spisak dana");
		System.out.println("4. MENI");
		System.out.println("5. Izlaz");
	}
	
	static void prekidac() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nUnesite broj zeljene opcije: \n");
		int a;
		a =sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Godine su: ");
			System.out.println("2010, 2011, 2012, 2013, 2014 ...");
			System.out.println("\nOdaberite: 4. Povratak na MENI ili 5. IZLAZ:\n");
			int b;
			b = sc.nextInt();
			if (b == 4) {
				main(null);
			}else if ( b == 5) {
				System.out.println("Izasli ste iz programa ---- DOVIDJENJA ----");
			} 
			break;
		case 2:
			System.out.println("Meseci su: ");
			System.out.println("Januar, Februar, Mart, April ...");
			System.out.println("\nOdaberite: 4. Povratak na MENI ili 5. IZLAZ:\n");
			int b1;
			b1 = sc.nextInt();
			if (b1 == 4) {
				main(null);
			}else if ( b1 == 5) {
				System.out.println("Izasli ste iz programa ---- DOVIDJENJA ----");
			} 
			break;
		case 3:
			System.out.println("Dani su: ");
			System.out.println("Ponedeljak, Utorak, Sreda, Cetvrtak, ...");
			System.out.println("\nOdaberite: 4. Povratak na MENI ili 5. IZLAZ:\n");
			int b11;
			b11 = sc.nextInt();
			if (b11 == 4) {
				main(null);
			}else if ( b11 == 5) {
				System.out.println("Izasli ste iz programa ---- DOVIDJENJA ----");
			} 
			break;
		case 4:
			main(null);
			break;
		case 5:
			System.out.println("Izasli ste iz programa ---- DOVIDJENJA ----");			
			break;
		default: System.out.println("Uneli ste pogrsan broj!");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		meni();
		
		prekidac();
	}

}
