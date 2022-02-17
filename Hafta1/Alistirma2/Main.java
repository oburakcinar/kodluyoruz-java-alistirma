import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Sayilar: ");
		String input = scan.nextLine();
		String[] numArr = (input.split(" "));
		System.out.println("Toplam: " + (Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1])));
		scan.close();    
    }
}


