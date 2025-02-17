import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean pr = true;
        while (true) {
            Scanner string = new Scanner(System.in);
            System.out.println("Введіть строку: ");
            String str = string.nextLine();
            Perevirka(str);
        }
    }
    public static String Perevirka(String bykvi) {
        String[] str1 = bykvi.split(" ");
        if (str1.length < 2) {
            System.out.println("Замало слів");
        } else if(str1.length >= 2) {
            for (int i = 0; i < str1.length; i++) {
                if(str1[i].length() < 3) {
                    System.out.println("Мало букв в слові");
                } else {
                    System.out.println("Все гуд");
                }
            }
        }
        return bykvi;
    }

}