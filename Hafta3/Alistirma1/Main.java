import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyelini bulmak istediğiniz sayıyı giriniz: ");
        int initialNum = scan.nextInt();
        int num = initialNum;
        int result = 1;
        while (num > 1) {
            result *= num;
            num --;
        }
        System.out.println(initialNum + "! = " + result);  
        
        scan.close();
    }
}