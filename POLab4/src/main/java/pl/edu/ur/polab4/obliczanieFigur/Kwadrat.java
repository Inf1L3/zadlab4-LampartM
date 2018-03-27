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
public class Kwadrat {

    public int bok;
    public int pole;
    public int obwod;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public void Pole() {
        this.pole = this.bok * this.bok;
    }

    public void Obwod() {
        this.obwod = this.bok * 4;
    }

    public void WyswietlDane() {
        this.Pole();
        this.Obwod();
        System.out.println("--- Kwadrat ---");
        System.out.println("Bok: " + this.bok);
        System.out.println("Pole: " + this.pole);
        System.out.println("Obwód: " + this.obwod);
    }
}
