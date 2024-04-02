import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = scanner.nextLine();
        stringInversa st = new stringInversa();

        st.inverterFrase(frase);

    }
}
