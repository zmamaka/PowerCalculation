import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, p, total = 1;

        System.out.print("Taban değeri giriniz => ");
        n = scan.nextInt();

        System.out.print("Kuvvet değeri giriniz => ");
        p = scan.nextInt();

        for (int i = 1; i <= p; i++)
            total *= n;

        System.out.println(total);

    }
}
