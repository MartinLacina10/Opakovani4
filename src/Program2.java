import java.util.*;
public class Program2 {
    public static void main(String args[]) {
        String ods, obratit = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Napiš string, abych ho mohl obrátit:");
        ods = in.nextLine();
        int delka = ods.length();

        for (int i = delka- 1 ; i >= 0 ; i--)
            obratit = obratit + ods.charAt(i);

        System.out.println("Obracený string je: " + obratit);
    }
}
