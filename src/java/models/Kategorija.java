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
public class Kategorija {
    private int id;
    private String naziv;

    public Kategorija(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public Kategorija() {
        this.id = 0;
        this.naziv = "/";
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
    
}
