import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str = scan.nextLine();
        
        System.out.println("Sesli harfler listesi: ");

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' ||  c == 'i' || c == 'u' || c == 'o' ) {
                System.out.print(c + " ");
            }
        }

        scan.close();
    }
}