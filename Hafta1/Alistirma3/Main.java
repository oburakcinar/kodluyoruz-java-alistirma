import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {  
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayi girin: ");
		double num1 = scan.nextDouble();
		System.out.print("Birinci sayi girin: ");
		double num2 = scan.nextDouble();
		System.out.println("Carpim sonucu: " + (num1 * num2));
		scan.close();
	}	
	  
}