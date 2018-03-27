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
public class Prostokat {

    public int bok1;
    public int bok2;
    public int pole;
    public int obwod;

    public Prostokat(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public void Pole() {
        this.pole = this.bok1 * this.bok2;
    }

    public void Obwod() {
        this.obwod = (this.bok1 * 2) + (this.bok2 * 2);
    }

    public void WyswietlDane() {
        this.Pole();
        this.Obwod();
        System.out.println("--- Prostokąt ---");
        System.out.println("Bok1: " + this.bok1);
        System.out.println("Bok2: " + this.bok2);
        System.out.println("Pole: " + this.pole);
        System.out.println("Obwód: " + this.obwod);
    }
}
