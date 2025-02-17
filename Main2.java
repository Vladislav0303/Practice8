import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Введіть строку: ");
        String str = string.nextLine();
        System.out.println(Povorot(str));

    }
    public static String Povorot(String stroka) {
        if (stroka.length() <= 1)
            return stroka;

        return Povorot(stroka.substring(1)) + stroka.charAt(0);
    }
}
