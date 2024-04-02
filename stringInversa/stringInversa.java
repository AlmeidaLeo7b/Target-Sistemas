
public class stringInversa {
    public String fraseInvertida = "  ";

    public void inverterFrase(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + str.charAt(i);

        }
        System.out.println("A palavra " + str + " ao contrario fica " + fraseInvertida);
    }

}