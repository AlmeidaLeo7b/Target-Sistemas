import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("informado um numero: ");
        n = scanner.nextInt();

        Fibonacci fb = new Fibonacci(n);

        System.out.println("Sequência de Fibonacci com " + n + " termos: \n");

        for (int i = 0; i < n; i++) {
            System.out.print(fb.calcularFibonacci(i) + " ");
        }
        fb.pertenceFibonacci(n);
    }
}
