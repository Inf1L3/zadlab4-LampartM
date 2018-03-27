package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Maciek
 */
public class main {

    public static void main(String[] args) {
        int a, b, c, x;
        x = 1;

        while (x != 0) {
            System.out.println("Podaj numer figury, 0 konczy program:");
            System.out.println("1.Kwadrat");
            System.out.println("2.Prostokat");
            System.out.println("3.Kolo");
            System.out.println("4.Kula");
            System.out.println("5.Stozek");
            System.out.println("6.Szescian");
            System.out.println("7.Prostopoadloscian");

            Scanner odczyt = new Scanner(System.in);
            x = odczyt.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Podaj bok kwadratu");
                    a = odczyt.nextInt();

                    Kwadrat Kwadrat1 = new Kwadrat(a);
                    Kwadrat1.WyswietlDane();
                    break;

                case 2:
                    System.out.println("Podaj boki prosokata");
                    a = odczyt.nextInt();
                    b = odczyt.nextInt();
                    
                    Prostokat Prostokat = new Prostokat(a, b);
                    Prostokat.WyswietlDane();
                    break;

                case 3:
                    System.out.println("Podaj promień koła");
                    a = odczyt.nextInt();
                    
                    Kolo Kolo1 = new Kolo(a);
                    Kolo1.WyswietlDane();
                    break;

                case 4:
                    System.out.println("Podaj promień kuli");
                    a = odczyt.nextInt();
                    
                    Kula Kula1 = new Kula(a);
                    Kula1.WyswietlDane();
                    break;

                case 5:
                    System.out.println("Podaj promień podstawy i wysokość");
                    a = odczyt.nextInt();
                    b = odczyt.nextInt();
                    
                    Stozek Stozek1 = new Stozek(a, b);
                    Stozek1.WyswietlDane();
                    break;

                case 6:
                    System.out.println("Podaj długośc krawędzi");
                    a = odczyt.nextInt();
                    
                    Szescian Szescian1 = new Szescian(a);
                    Szescian1.WyswietlDane();
                    break;

                case 7:
                    System.out.println("Podaj krawedzie prostopadłościanu.");
                    a = odczyt.nextInt();
                    b = odczyt.nextInt();
                    c = odczyt.nextInt();
                    
                    Prostopadloscian Prostop = new Prostopadloscian(a, b, c);
                    Prostop.WyswietlDane();
                    break;
            }
        }
    }
}
