/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author WINDOWS 10
 */
public class Proizvod {
    private int id;
    private String naziv;
    private double cena;
    private String opis;
    private Kategorija kategorija;

    public Proizvod(int id, String naziv, double cena, String opis, Kategorija kategorija) {
        this.id = id;
        this.naziv = naziv;
        this.cena = cena;
        this.opis = opis;
        this.kategorija = kategorija;
    }

    public Proizvod() {
        this.id = 0;
        this.naziv = "/";
        this.cena = 0.0;
        this.opis = "/";
        this.kategorija = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }
    
    
}
