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
public class Bola implements BangunRuang {
    private int r;
    // r = 7
    public Bola(int r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return (4.0/3.0)*3.14285714286*(r*r*r);
    }

    @Override
    public void tampil() {
        System.out.printf("Hasil : V = %.1f%n", hitungVolume());
    }
}
