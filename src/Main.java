import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        System.out.print("Введіть кількість генерованих символів: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Task1(n);
        System.out.println("Задача 2:");
        System.out.print("Введіть перше число: ");
        double a = scan.nextDouble();
        System.out.print("Введіть друге число: ");
        double b = scan.nextDouble();
        Task2(a,b);
    }

    public static void Task1(int n)
    {
        for (int i = 0; i < n; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("иногда гласная");
                    break;
                default:
                    System.out.println("согласная");
            }

        }
    }
    public static void Task2(double a, double b)
    {
        double c = Math.hypot(a,b);
        System.out.format("Гіпотенуза = %.3f\n", c);
        System.out.format("Арксинус кута c у радіанах: %.3f\n", Math.asin(c));
        System.out.format("Значення c-радіан у градуси: %.3f", Math.toDegrees(c));
    }
}