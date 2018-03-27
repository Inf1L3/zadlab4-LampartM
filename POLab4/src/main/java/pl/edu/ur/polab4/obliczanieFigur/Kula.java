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
public class Kula {

    public int promien;
    public float objetosc;
    public float powierzchnia;

    public Kula(int promien) {
        this.promien = promien;
    }

    public void objetosc() {
        this.objetosc = (float) ((4 / 3) * (Math.PI * Math.pow(this.promien, 3)));
    }

    public void powierzchnia() {
        this.powierzchnia = (float) (4 * Math.PI * Math.pow(this.promien, 2));
    }

    public void WyswietlDane() {
        this.objetosc();
        this.powierzchnia();
        System.out.println("--- Kula ---");
        System.out.println("Promień: " + this.promien);
        System.out.println("Powierzchnia kuli: " + this.powierzchnia);
        System.out.println("Objętość kuli: " + this.objetosc);
    }
}
