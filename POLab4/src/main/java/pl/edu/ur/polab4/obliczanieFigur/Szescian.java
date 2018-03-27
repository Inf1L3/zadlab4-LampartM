/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Maciek
 */
public class Szescian {

    public int bok;
    public double powierzchnia;
    public double objetosc;

    public Szescian(int bok) {
        this.bok = bok;
    }

    public void powierzchnia() {
        this.powierzchnia = Math.pow(bok, 2) * 6;
    }

    public void objetosc() {
        this.objetosc = Math.pow(bok, 3);
    }

    public void WyswietlDane() {
        this.powierzchnia();
        this.objetosc();
        System.out.println("--- Sześcian ---");
        System.out.println("Bok: " + this.bok);
        System.out.println("Powierzchnia: " + this.powierzchnia);
        System.out.println("Objętość: " + this.objetosc);
    }
}
