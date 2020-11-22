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
public class Tabung implements BangunRuang{
    private int r,tinggi;
    //tinggi = 21 r = 10
    public Tabung(int r, int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return 3.14285714286*(r*r)*tinggi;
    }
 
    @Override
    public void tampil() {
        System.out.printf("Hasil : V = %.1f%n", hitungVolume());
    }

}