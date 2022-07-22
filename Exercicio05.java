import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String s;

        System.out.printf("Digite uma palavra:");
        s = ler.nextLine();
        ler.close();

        System.out.println();

        System.out.printf("Digite uma palavra: %s\n", s);
        System.out.printf("Palavra digitada..: %s\n", inverterCaracteres(s));

    }

    public static String inverterCaracteres(String s) {
        int i;
        int n;
        String sAux = "";

        n = s.length();

        for (i = (n - 1); i > 0; i--) {
            sAux = sAux + s.charAt(i);
        }
        return sAux;

    }

}