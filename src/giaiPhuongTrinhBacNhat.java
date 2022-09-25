import java.util.Scanner;

public class giaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải  phương trình bậc nhất");
        System.out.println("Cho phương trình 'a * x + b = c', vui lòng nhập a, b , c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0 ) {
            double x = (c-b)/a;
            System.out.println("Phương trình có nghiệm duy nhất là: x = " + x);
        } else {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
