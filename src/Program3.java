import java.util.*;
public class Program3 {
    public static void main(String args[])
    {
        String ods, obratit = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Napiš string:");
        ods = in.nextLine();
        int delka = ods.length();

        for (int i = delka - 1; i >= 0; i--)
            obratit = obratit + ods.charAt(i);

        if (ods.equals(obratit))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
