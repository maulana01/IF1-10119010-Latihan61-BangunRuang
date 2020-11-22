/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan61.bangunruang;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan bangun ruang bola, tabung, kerucut
 *                     dengan konsep OOP
 */
public class IF110119010Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        Tabung t = new Tabung(10,21);
        Kerucut k = new Kerucut(14,9);
        
        b.tampilBangunRuang();
        t.tampilBangunRuang();
        k.tampilBangunRuang();
    }   
}
