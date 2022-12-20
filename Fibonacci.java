import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i, a = 0, b = 1, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet Fibonacci Sayısı görmek istiyorsunuz : ");
        int n = input.nextInt();
        System.out.print("Fibonacci Sayıları : ");

        for (i = 0; i <= n - 1; i++) {
            a = b;
            b = toplam;
            toplam = a + b;
            System.out.print(toplam + ",");
        }
    }
}
