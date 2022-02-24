public class Main {
    public static void main(String[] args) {
        System.out.println("Bilgisayar rastgele 10 sayı belirliyor...");
        int odd = 0;
        int even = 0;

        for(int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 1000);
            if(random % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Bu sayılardan " + even + " tanesi çift, " + odd + " tanesi tek");
    }
}