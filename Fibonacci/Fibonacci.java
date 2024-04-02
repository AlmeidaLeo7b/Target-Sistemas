public class Fibonacci {
    private int i;

    public Fibonacci(int i) {
        this.i = i;
    }

    public int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public int pertenceFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                System.out.println("\n O numero " + num + " pertence na sequencia de Fibonacci");
                return 0;
            }
            int temp = a;
            a = b;
            b = temp + b;

        }
        System.out.println("\n O numero " + num + " nao pertence na sequencia de Fibonacci");
        return 0;
    }
}
