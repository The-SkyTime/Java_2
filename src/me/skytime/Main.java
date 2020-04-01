package me.skytime;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char userInp;
        int userIn;
        String userInput;

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
        userIn = scanner.nextInt();
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
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2] + "\n\n");

        // Opdr 4.1
        System.out.print("Karakter ASCII waarde weten? ");
        userInp = scanner.nextLine().charAt(0);
        int asciiVal = (int) userInp;
        System.out.println("ASCII waarde " + userInp + " is " + asciiVal + "\n\n");

        // Opdr 4.2
        System.out.print("Karakter getal is?  ");
        userInp = scanner.nextLine().charAt(0);
        if(Character.isLetter(userInp)) {
            System.out.println("De " + userInp + " is een letter\n\n");
        } else if (Character.isDigit(userInp)){
            System.out.println("De " + userInp + " is een getal\n\n");
        } else {
            System.out.println("De" + userInp + "is geen getal of nummer \n\n");
        }

        // Opdr 4.3
        System.out.println("Welke letter is klinker?");
        userInp = scanner.nextLine().charAt(0);
        if (userInp == 'a' || userInp == 's' || userInp == 'd' || userInp == 'g' || userInp == 'h' || userInp == 'j' || userInp == 'k' || userInp == 'l') {
            System.out.println("De " + userInp + " is een klinker\n\n");
        } else {
            System.out.println("De " + userInp + " is een medeklinker\n\n");
        }

        // Opdr 4.4
        System.out.println("Welk letter van nummer wil je weten?");
        userInp = scanner.nextLine().charAt(0);
        if (userInp == 'a' || userInp == 'b' || userInp == 'c') {
            System.out.println("Letter " + userInp + " staat op 2e toets\n\n");
        } else if (userInp == 'd' || userInp == 'e' || userInp == 'f') {
            System.out.println("Letter " + userInp + " staat op 3e toets\n\n");
        } else if (userInp == 'g' || userInp == 'h' || userInp == 'i') {
            System.out.println("Letter " + userInp + " staat op 4e toets\n\n");
        } else if (userInp == 'j' || userInp == 'k' || userInp == 'l') {
            System.out.println("Letter " + userInp + " staat op 5e toets\n\n");
        } else if (userInp == 'm' || userInp == 'n' || userInp == 'o') {
            System.out.println("Letter " + userInp + " staat op 6e toets\n\n");
        } else if (userInp == 'p' || userInp == 'q' || userInp == 'r' || userInp == 's') {
            System.out.println("Letter " + userInp + " staat op 7e toets\n\n");
        } else if (userInp == 't' || userInp == 'u' || userInp == 'v') {
            System.out.println("Letter " + userInp + " staat op 8e toets\n\n");
        } else if (userInp == 'p' || userInp == 'q' || userInp == 'r' || userInp == 's') {
            System.out.println("Letter " + userInp + " staat op 7e toets\n\n");
        }

        // Opdr 4.5
        int randNum = (int) (Math.random() * 26 + 97);
        char asci = (char) randNum;
        System.out.println("Willekeurig letter is de '" + asci + "'\n\n");

        // Opdr 4.6
        System.out.println("Typ string: ");
        String usStr = scanner.nextLine();
        int length = usStr.length();
        System.out.println("Lengte string is " + lengt);
        char firChr = usStr.charAt(0);
        System.out.println("Karakter 1 is " + firChr);
        char lstChr = usStr.charAt(length - 1);
        System.out.println("Karakter 2 is " + lstChr + "\n\n");

        // Opdr 4.7
        System.out.println("Land 1: ");
        String land1 = scanner.nextLine();
        System.out.println("Land 2: ");
        String land2 = scanner.nextLine();
        System.out.println("Land 3: ");
        String land3 = scanner.nextLine();
        String[] land = {land1, land2, land3};
        Arrays.sort(land);
        System.out.println(land[0] + " - " + land[1] + " - " + land[2] + "\n\n");

        // Opdr 5.1
        boolean verder = true;
        while (verder) {
            System.out.println("Toetscijfer? ");
            double cijfer = scanner.nextDouble();
            if (cijfer == -1) {
                System.out.println("Tot ziens\n\n");
                verder = false;
                continue;
            } else if (cijfer >= 5.5) {
                System.out.println("Voldoende\n\n");
            } else {
                System.out.println("Onvoldoende\n\n");
            }
        }

        // Opdr 5.2
        int score = 0;
        for (int i = 0; i < 10; i++) {
            get1 = (int) (Math.random() * 10 + 1);
            get2 = (int) (Math.random() * 10 + 1);
            int optel = get1 + get2;
            System.out.println("Hoeveel is " + get1 + " + " + get2 + "?");
            userIn = scanner.nextInt();
            if (userIn == optel) {
                System.out.println("Goed");
                score++;
            } else {
                System.out.println("Fout, antwoord was " + optel);
            }
        }
        System.out.println("Toets is klaar. Score is " + score + "\n\n");

        // Opdr 5.3
        for (int i = 1; i <= 10; i++) {
            int prod = i * 7;
            System.out.println(i + " x 7 = " + prod);
        }

        // Opdr 5.4
        int lowNum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Typ getal: ");
            int num = scanner.nextInt();
            if (i == 0) {
                lowNum = num;
            } else {
                if (num < lowNum) {
                    lowNum = num;
                }
            }
        }
        System.out.println("Laagst getypte getal is " + lowNum + "\n\n");

        // Opdr 5.5
        double highGrade = 0;
        String stud = "unknown";
        for (int i = 1; i < 5; i++) {
            System.out.println("Naam " + i + " student? ");
            String name = scanner.nextLine();
            System.out.println("Cijfer?");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            if (i == 0) {
                highGrade = grade;
                stud = name;
            } else {
                if (grade > highGrade) {
                    highGrade = grade;
                    stud = name;
                }
            }
        }
        System.out.println("Hoogste cijfer door: " + stud);
        System.out.println("Cijfer is: " + highGrade + "\n\n");

        // Opdr 5.6

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + "\n\n");
            }
        }

        // Opdr 5.7
        verder = true;
        int counter = 0;
        while (verder) {
            int square = counter * counter;
            if (square < 1000) {
                System.out.println("Getals is " + counter);
                System.out.println("Kwadraat is " + square + "\n\n");
                counter++;
            } else {
                verder = false;
            }
        }

        // Opdr 6.1
        printZinnetje();

        // Opdr 6.2
        System.out.println("Welk zinnetje printen? ");
        userInput = scanner.nextLine();
        printZinnetje(userInput + "\n\n");

        // Opdr 6.3
        getal1 = (int) (Math.random() * 10 + 1);
        getal2 = (int) (Math.random() * 10 + 1);
        int product = berekenProduct(getal1, getal2);
        System.out.println("Product van " + getal1 + " en " + getal2 + " is " + product + "\n\n");

        // Opdr 6.4
        System.out.println("2 Getallen vermenigvuldigen ");
        System.out.println("Getal 1: ");
        getal1 = scanner.nextInt();
        System.out.println("Getal 2: ");
        getal2 = scanner.nextInt();
        product = berekenProduct(getal1, getal2);
        System.out.println("Product van " + getal1 + " en " + getal2 + " is " + product + "\n\n");

        // Opdr 6.5
        System.out.println("Welk getal werkdag weten? ");
        getal1 = scanner.nextInt();
        String day = bepaalDag(getal1);
        System.out.println("Nummer " + getal1 + " is dag " + day + "\n\n");

        // Opdr 6.6
        System.out.println("Welk getal weten of even getal is? ");
        getal1 = scanner.nextInt();
        boolean isEven = isEvenGetal(getal1);
        if (isEven) {
            System.out.println("Getal " + getal1 + " is een even getal\n\n");
        } else {
            System.out.println("Getal " + getal1 + " is geen even getal\n\n");
        }

        // Opdr 6.7
        System.out.println("Welk getal weten of priemgetal is? ");
        getal1 = scanner.nextInt();
        boolean isPriem = isPriemGetal(getal1);
        if (isPriem) {
            System.out.println("Getal " + getal1 + " is priemgetal\n\n");
        } else {
            System.out.println("Getal " + getal1 + " is geen priemgetal\n\n");
        }

        // Opdr 7.1
        System.out.println("100 Worpen met een dobblesteen:\n");
        int[] dobbleworp = new int[100];
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 6 + 1);
            dobbleworp[i] = random;
        }
        int count = 1;
        for (int w : dobbleworp) {
            System.out.print(w + " ");
            if (count % 10 == 0) {
                System.out.println("\n\n");
            }
            count++;
        }

        // Opdr 7.2
        System.out.println("Geef 9 integers: ");
        getallen = new int[9];
        for (int i = 0; i < 9; i++) {
            getallen[i] = scanner.nextInt();
        }
        System.out.println("Omgekeerde volgorde: \n");
        for (int i = 8; i >= 0; i--) {
            System.out.print(getallen[i] + " \n\n");
        }

        // Opdr 7.3
        System.out.println("10 doubles, bereken en tel ik cijfers hoger zijn");
        double[] userInpu = new double[10];
        for (int i = 0; i < 10; i++) {
            userInpu[i] = scanner.nextDouble();
        }
        opp = 0;
        for (double waarde : userInpu) {
            opp += waarde;
        }
        double gem = opp / 10;
        System.out.println("Gemiddelde is " + gem);
        count = 0;
        for (double waarde : userInpu) {
            if (waarde > gem) {
                count++;
            }
        }
        System.out.println("Gemiddelde doubles boven is: " + count);
    }

    public static void printZinnetje() {
        System.out.println("Hello world \n\n");
    }

    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje);
    }

    public static int berekenProduct(int getal1, int getal2) {
        return getal1 * getal2;
    }

    public static String bepaalDag(int dagnummer) {
        String[] days = {"onbekend", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        if (dagnummer <= 7 && dagnummer >= 1) {
            return days[dagnummer];
        } else {
            return "onbekend";
        }
    }

    public static boolean isEvenGetal(int getal) {
        if (getal % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPriemGetal(int getal) {
        if (getal < 2) {
            return false;
        }
        if (getal == 2 || getal == 3) {
            return true;
        }
        for (int i = 2; i <= (getal / 2); i++) {
            if (getal % i == 0) {
                return false;
            }
        }
        return true;
    }
}
