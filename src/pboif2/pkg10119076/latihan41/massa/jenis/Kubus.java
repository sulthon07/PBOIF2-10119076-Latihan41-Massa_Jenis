/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan41.massa.jenis;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Massa jenis
 */
public class Kubus {
    int sisi,massa;
    
    public int getSisi() {
        return sisi;
    }
    
    public void setSisi (int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return parSisi * parSisi * parSisi;
    }
    
    public int hitungMassaJenis(int parMassa,int volume){
        return parMassa/volume;
    }
}
