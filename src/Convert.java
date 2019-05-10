import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND, USD;
        double rate = 23000;
        System.out.println("Nhap USD:");
        USD = scanner.nextDouble();
        VND = USD * rate;
        System.out.println(VND + " VND");
    }
}
