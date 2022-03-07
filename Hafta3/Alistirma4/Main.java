import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();
        System.out.println("Stringde harf dışındaki karakter ve rakamlar: ");
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(!((c >= 65 && c <= 90) || (c >= 97 && c <= 122))) {
                System.out.print(c + " ");
            }
        }
    }   
}