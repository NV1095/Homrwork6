public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1");
        int i = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 2");
        int a = 10;
        for (a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        System.out.println("\nЗадача 3");
        int b = 0;
        for (b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        System.out.println("\nЗадача 4");
        int c = 10;
        for (c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        System.out.println("\nЗадача 5");
        int d = 1904;
        for (d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным.");
        }

        System.out.println("\nЗадача 6");
        int e = 7;
        for (e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }

        System.out.println("\nЗадача 7");
        int f = 7;
        for (f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        System.out.println("\nЗадача 8");
        double accumulation = 29000;
        double total = 0;
        for (int l = 1; l <= 12; l++) {
            total = total + accumulation;
            System.out.println("Месяц " + l + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадача 9");
        double contribution = 29000;
        double inTotal = 0;
        for (int g = 1; g <= 12; g++) {
            inTotal = inTotal + inTotal / 100;
            inTotal = inTotal + contribution;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + inTotal + " рублей");
        }

        System.out.println("\nЗадача 10");
        int s = 1;
        for (s = 1; s <= 10; s++) {
            System.out.println("2*" + s + "=" + s * 2);
        }


    }
}

