import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		System.out.println("Girilen sayı: " + scan.nextInt());
		scan.close();
	}

}
