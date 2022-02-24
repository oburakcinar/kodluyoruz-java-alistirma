import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Toplamak istediğiniz 10 sayıyı aralarında 1 boşluk bırakacak şekilde giriniz ");
        String[] nums = scan.nextLine().split(" ");
        while(nums.length != 10) {
            System.out.print("Lütfen 10 sayı girdiğinizden emin olun" );
            nums = scan.nextLine().split(" ");
        }
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);    
        }  
        
        System.out.println("Toplam: " + sum);

        scan.close();
    }
}