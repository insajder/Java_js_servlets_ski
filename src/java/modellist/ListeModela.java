/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modellist;

import java.util.ArrayList;
import models.Kategorija;
import models.Proizvod;

/**
 *
 * @author WINDOWS 10
 */
public class ListeModela {
    static Kategorija k1 = new Kategorija(1, "Skije");
    static Kategorija k2 = new Kategorija(2, "Kacige");
    static Kategorija k3 = new Kategorija(3, "Pancerice");
    static Kategorija k4 = new Kategorija(4, "Naocare");
    public static ArrayList<Kategorija> listaKategorija=new ArrayList<>(){
        {
            add(k1);
            add(k2);
            add(k3);
            add(k4);
        }
    };
    
    static Proizvod p1 = new Proizvod(1, "Elan porsche", 90990, "Izgrađen od trkaće DNK, ovaj crossover između kratkih i dugih skija, omogućava vam da odaberete kakav ćete zaokret napraviti sa savršenstvom.", k1);
    static Proizvod p2 = new Proizvod(2, "Nordica dobermann", 60500, "Ako želite parati celi dan po ledenim stazama, ne tražite dalje od Spitfire 72 RB.", k1);
    static Proizvod p3 = new Proizvod(3, "Rossignol", 17600, "Podesivi ventilacioni otvori omogućavaju protok vazduha da bude povećan ili smanjen omogućavajući više kontrole nad temperaturom.", k2);
    static Proizvod p4 = new Proizvod(4, "Scott couloir", 9950, "SCOTT najudobnija kaciga do sada, kaciga koja se prilagođava obliku vaše glave i pruža vam osećaj sigurnosti i usredsređenosti na vožnju.", k2);
    static Proizvod p5 = new Proizvod(5, "Dalbello", 29990, "Idealna ski cipela za srednje i napredne skijaše koji traže širok spektar mogućnosti podešavanja i udobnost.", k3);
    static Proizvod p6 = new Proizvod(6, "Nordica pro", 35990, "Moć koju tražite i udobnost koju želite.", k3);
    static Proizvod p7 = new Proizvod(7, "Oakley flight", 18300, " Potreba da budete hrabri i prkosni kroz ikonične dizajne.", k4);
    static Proizvod p8 = new Proizvod(8, "Downhill", 16490, "Superstil se susreće sa vrhunskim performansama.", k4);
    
    public static ArrayList<Proizvod> listaProizvoda=new ArrayList<>(){
        {
            add(p1);
            add(p2);
            add(p3);
            add(p4);
            add(p5);
            add(p6);
            add(p7);
            add(p8);
        }
    };
    
    static int id_kategorije = 5;
    public static int generisiIdKategorije(){
        id_kategorije++;
        return id_kategorije;
    }

    static int id_proizvoda = 9;
    public static int generisiIdProizvoda(){
        id_proizvoda++;
        return id_proizvoda;
    }
}
