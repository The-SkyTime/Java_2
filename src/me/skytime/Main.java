package me.skytime;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hello World!");
//        System.out.println((10.5 + 2 * 3) / (45 - 3.5));

        // Opd 1.1
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n\n");

        // Opdr 1.2
        System.out.println("Java is geweldig");
        System.out.println("Java is geweldig");
        System.out.println("Java is geweldig");
        System.out.println("Java is geweldig");
        System.out.println("Java is geweldig\n\n");

        // Opdr 1.3
        System.out.println("a\ta^2\ta^3\ta^4\n");
        System.out.println("1\t1\t1\t1\n");
        System.out.println("2\t4\t8\t16\n");
        System.out.println("3\t9\t27\t81\n");
        System.out.println("4\t16\t64\t256\n\n");

        // Opdr 1.4
        double teller = 7.5 * 6.5 - 4.5 * 3;
        double noemer = 47.5 * 5.5;
        double getal = teller / noemer;
        System.out.println(getal + "\n\n");

        // Opdr 1.5
        int opsom = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(opsom + "\n\n");

        // Opdr 1.6
        double benvapi = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println(benvapi + "\n\n");

        // Opdr 1.7
        double straal = 6.5;
        double pi = 3.14159;
        double opp =  straal * straal * pi;
        double omt = 2 * straal * pi;
        System.out.println("opp = " + opp);
        System.out.println("omt = " + omt + "\n\n");

        // Opdr 1.89
        double lengt = 5.3;
        double with = 8.6;
        opp = lengt * with;
        omt = 2 * (lengt + with);
        System.out.println("opp = " + opp);
        System.out.println("omt = " + omt + "\n\n");

        // Opdr 2.1
        System.out.println("Aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        int tuss = (int) (kilometers * 10);
        kilometers = tuss / 10.0;
        System.out.println(mijlen + " mijlen is " + kilometers + " kilometer\n\n");

        // Opdr 2.2
        System.out.println("Hoe oud ben je? ");
        int leeftijdJaren = scanner.nextInt();
        System.out.println("En hoeveel maanden? ");
        int leeftijdMaanden = scanner.nextInt();
        int leeftijdMinuten = leeftijdJaren * 365 * 24 * 60 + leeftijdMaanden * 30 * 24 * 60;
        System.out.println("Je bent ongeveer " + leeftijdMinuten + " min oud\n\n");

        // Opdr 2.3
        System.out.println("Startbedrag: ");
        double startbedrag = scanner.nextDouble();
        System.out.println("Rentepercentage: ");
        double renteperc = scanner.nextDouble();
        double rentbedrag = renteperc / 100 * startbedrag;
        double totaalbedrag = startbedrag + rentbedrag;
        System.out.println("Rente is " + rentbedrag + " en totaalbedrag is " + totaalbedrag + "\n\n");

        // Opdr 2.4
        System.out.println("Kies getal tuss 10 en 100: ");
        int userIn = scanner.nextInt();
        int get1 = userIn - 2;
        int get2 = userIn - 1;
        int get3 = userIn + 1;
        int get4 = userIn + 2;
        System.out.println("Getallen zijn " + get1 + " - " + get2 + " - " + userIn + " - " + get3 + " - " + get4 + "\n\n");

        // Opdr 2.5
        System.out.println("Kies getal tuss 10 en 1000: ");
        userIn = scanner.nextInt();
        if(userIn >= 100) {
            int lastDig = userIn % 10;
            userIn = userIn / 10;
            int middDig = userIn % 10;
            userIn = userIn / 10;
            int firstDig = userIn;
            int prod = firstDig * middDig * lastDig;
            System.out.println("Vermenigvuldiging van cijfers: " + firstDig + " x " + middDig + " x " + lastDig + " = " + prod + "\n\n");
        } else if (userIn >= 10 && userIn <= 100) {
            int lastDig = userIn % 10;
            userIn = userIn / 10;
            int firstDig = userIn;
            int prod = firstDig * lastDig;
            System.out.println("Vermenigvuldiging van cijfers: " + firstDig + " x " + lastDig + " = " + prod + "\n\n");
        } else if (userIn >= 0 && userIn <= 10) {
            int firstDig = userIn;
            int prod = firstDig ;
            System.out.println("Vermenigvuldiging van cijfers: " + firstDig + " = " + prod + "\n\n");
        } else {
            System.out.println("Getal niet tussen 0 en 1000.");
        }

        // Opdr 3.1
        int rand1 = (int) (Math.random() * 10 + 1);
        int rand2 = (int) (Math.random() * 10 + 1);
        System.out.print("Hvl is " + rand1 + " + " + rand2 + " ? ");
        userIn = scanner.nextInt();
        int res = rand1 + rand2;
        if( userIn == res) {
            System.out.println("Klopt" + "\n\n");
        } else {
            System.out.println("Fout, juiste antw is " + res + "\n\n");
        }

        // Opdr 3.2

        rand1 = (int) (Math.random() * 10 + 1);
        rand2 = (int) (Math.random() * 10 + 1);
        int rand3 = (int) (Math.random() * 10 + 1);
        System.out.print("Hvl is " + rand1 + " x " + rand2 + " x " + rand3 + " ? ");
        userIn = scanner.nextInt();
        res = rand1 * rand2 * rand3;
        if( userIn == res) {
            System.out.println("Goed" + "\n\n");
        } else {
            System.out.println("Fout, juiste antw is " + res + "\n\n");
        }

        // Opdr 3.3
        rand1 = (int) (Math.random() * 12 + 1);
        String month = "Unknown";
        switch (rand1) {
            case 1: month = "januari"; break;
            case 2: month = "februari"; break;
            case 3: month = "maart"; break;
            case 4: month = "april"; break;
            case 5: month = "mei"; break;
            case 6: month = "juni"; break;
            case 7: month = "juli"; break;
            case 8: month = "augustus"; break;
            case 9: month = "september"; break;
            case 10: month = "oktober"; break;
            case 11: month = "november"; break;
            case 12: month = "december"; break;
        }
        System.out.println("Random getal is " + rand1 + "en maand is " + month + "\n\n");

        // Opdr 3.4
        System.out.println("Welke dag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo\n");
        int dag = scanner.nextInt();
        System.out.println("En hvl dagen wil je berekenen?\n");
        int dagNext = scanner.nextInt();
        res = dag + dagNext;
        if (res > 7) {
            res = res % 7;
        }
        String[] dagen = {"onbekend","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
        System.out.println("Vandaag is " + dagen[dag] + " en over " + dagNext + " dagen is het " + dagen[res] + "\n\n");

        // Opdr 3.5
        System.out.println("Gewicht (kg) ? ");
        double gewicht = scanner.nextDouble();
        System.out.println("Lengte (m) ? ");
        double lengte = scanner.nextDouble();
        teller = gewicht;
        noemer = lengte * lengte;
        double bmi = teller / noemer;
        int tusStap = (int) (bmi * 100);
        bmi = tusStap / 100.0;
        System.out.println("BMI is " + bmi);
        String conclusie = "onbekend";
        if (bmi < 18.5) {
            conclusie = "ondergewicht heeft";
        } else if (bmi < 25) {
            conclusie = "een normaal gewicht heeft";
        } else if (bmi < 30) {
            conclusie = "overgewicht heeft";
        } else {
            conclusie = "zwaar overgewicht heeft";
        }
        System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + conclusie + "\n\n");

        // Opdr 3.6
        System.out.println("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.println("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.println("Getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1, getal2, getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);

        // Opdr 4.1
        System.out.print("Karakter ASCII waarde weten? ");
        char userInp = scanner.nextLine().charAt(0);
        int asciiVal = (int) userInp;
        System.out.println("ASCII waarde " + userInp + " is " + asciiVal + "\n\n");

        // Opdr 4.2
        System.out.print("Karakter getal is?  ");
        userInp = scanner.nextLine().charAt(0);
        if(Character.isLetter(userInp)) {
            System.out.println("");
        }

    }
}
