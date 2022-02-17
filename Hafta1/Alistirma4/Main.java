import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--Degisimden once--");
		System.out.print("Birinci sayi = ");
		double num1 = scan.nextDouble();
		System.out.print("Ikinci sayi = ");
		double num2 = scan.nextDouble();
		
		double temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("--Degisimden sonra--");
		System.out.println("Birinci sayi = " + num1);
		System.out.println("Ikinci sayi = " + num2);
		
		scan.close();
	}	
	  
}