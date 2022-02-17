import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {  
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		int n = scan.nextInt();
		int sum = (n * (n + 1)) / 2;
		System.out.println("1 ile " + n + " arasindaki sayilarin toplami: " + sum);
		
		scan.close();
	}	
	  
}