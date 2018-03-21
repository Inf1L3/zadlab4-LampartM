/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Wpis {

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String imie = input.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = input.nextLine();

        System.out.println("Podaj nr_indeksu: ");
        int nr_indeksu = input.nextInt();

        System.out.println("Podaj nazwa_specjalnosci: ");
        String nazwa_specjalnosci = input.next();

        System.out.println("Podaj rok_studiow: ");
        int rok_studiow = input.nextInt();

        Student student5 = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        student5.pokazDane();
    }

}
