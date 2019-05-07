import java.util.Scanner;

public class Main {

    public static void zad1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }


    public static int zad2(int a, int b) {
        int min = a < b ? a : b;
        int max = a < b ? b : a;
        int nwd = 1;
        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                nwd = i;
            }
        }
        return nwd;
    }

    public static int zad3(int a) {
        int silnia = 1;
        for (int i = 1; i <= a; i++) {
            silnia *= i;
        }
        return silnia;
    }

    public static void zad4(int[] a, int przesunO) {
        int[] tab1 = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i < przesunO) {
                tab1[i] = a[a.length - przesunO + i];
            } else {
                tab1[i] = a[i - przesunO];
            }
        }

        for (int i = 0; i < tab1.length; i++) {
            System.out.println(a[i] + "\t" + tab1[i]);
        }
    }

    public static int zad5(int a) {
        int wynik = 0;
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            wynik = zad5(a - 1) + zad5(a - 2);
        }
        return wynik;
    }

    public static boolean zad6(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void zad7() {
        String wiersz = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj szerokosc:");
        int b = scan.nextInt();
        System.out.println("Podaj wysokosc:");
        int a = scan.nextInt();
        if (a < 3 || b < 3) {
            System.out.println("Nieprawidłowe dane.");
        } else {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == 0 || i == a - 1) {
                        wiersz += "#";
                    } else if (j == 0 || j == b - 1) {
                        wiersz += "#";
                    } else {
                        wiersz += " ";
                    }
                }
                System.out.println(wiersz);
                wiersz = "";
            }
        }

    }

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Zad 1:\nLiczby podzielne przez 3 lub 5:");
        zad1();
        System.out.println("\nZad 2:\nNajwiększy wspólny dzielnik to: " + zad2(966, 48));
        System.out.println("\nZad 3:\nSilnia wynosi: " + zad3(6));
        System.out.println("\nZad 4:");
        zad4(tab, 1);
        System.out.println("\nZad 5:\nŻądany element ciągu Fibonacchiego wynosi: " + zad5(11));
        System.out.println("\nZad 6:\n" + zad6(tab));
        System.out.println("\nZad 7:");
        zad7();
    }
}

