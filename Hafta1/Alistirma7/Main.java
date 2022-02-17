import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {  
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		int num = scan.nextInt();
		
		List<Integer> digits = new ArrayList<>();
		
		while(num > 0) {
			digits.add(num % 10);
			num /= 10;
		}
		
		int sum = 0;
		for(int i = 0; i < digits.size(); i++) {
			sum += digits.get(i);
		}
		
		System.out.println("Girilen sayinin basamaklari toplami : " + sum);
		
		scan.close();
	}	
	  
}