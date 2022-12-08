//Jass Õunapuu
package KT;
public class H15 {

	public static void main(String[] args) {
		
 String kood = ("50504296713");
		int sugu = kood.charAt(0)-48;
		
		int aasta1 = kood.charAt(1)-48;
		int aasta2 = kood.charAt(2)-48;
		
		int kuu1 = kood.charAt(3)-48;
		int kuu2 = kood.charAt(4)-48;
		
		int paev1 = kood.charAt(5)-48;
		int paev2 = kood.charAt(6)-48;
		
		if(sugu % 2 == 0) {System.out.println("naine");}
		else {
		System.out.println("mees");
		}
		System.out.println("sündinud "+paev1+paev2+"."+kuu1+kuu2+".20"+aasta1+aasta2);
		
		
		
	}

}
