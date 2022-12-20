//Jass Õunapuu
package KT;
import java.util.Scanner;

public class H23 {

	public static void main(String[] args) {
		
		//Annan muutujatele väärtused
		int max = 99;
		int min = 1;
		int ipunkt = 0;
		int apunkt = 0;
		int peata = 0;
		Scanner skan = new Scanner(System.in);
		
		//Kasutan do{}while, et kood korduks, kuid ainult nii kaua, kui kasutaja soovib
		do {
		
		int inimene =(int)(Math.random()*(max-min+1)+min);
		System.out.println("sina veeretasid "+inimene);
		
		int arvuti =(int)(Math.random()*(max-min+1)+min);
		System.out.println("arvuti veeretas "+arvuti);
		
		
		if (arvuti < inimene) {;
		ipunkt ++;
		System.out.println("sina võitsid, said ühe punkti juurde, sul on "+ipunkt+" punkt(i), arvutil on "+apunkt+" punkt(i)");
		System.out.println("Kirjuta 1, kui tahad edasi mängida, 2 kui soovid lõpetada: ");
		
		String kusimus = skan.nextLine();
		int result = Integer.parseInt(kusimus);
		
		if (result == 1){peata = 0;}
		if (result == 2){System.out.println("Mängu lõpp");peata = 1; if(apunkt > ipunkt) {System.out.println("Arvuti võitis ):");}else{System.out.println("Sina võitsid (:");};}
		}
		else {
		apunkt ++;
		System.out.println("arvuti võitis, ta sai punkti juurde, sul on "+ipunkt+" punkt(i), arvutil on "+apunkt+" punkt(i)");
		System.out.println("Kirjuta 1, kui tahad edasi mängida, 2 kui soovid lõpetada: ");
		
		String kusimus = skan.nextLine();
		int result = Integer.parseInt(kusimus);
		
		if (result == 1){peata = 0;}
		if (result == 2){System.out.println("Mängu lõpp");peata = 1; if(apunkt > ipunkt) {System.out.println("Arvuti võitis ):");}else{System.out.println("Sina võitsid (:");}; }
		}
		
		}
		while (peata == 0);
		
		
	}

}
