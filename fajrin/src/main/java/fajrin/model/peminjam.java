/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.model;

/**
 *
 * @author HP14s FQ2002AU
 */
public class peminjam {
        
    private String kodeanggota;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public peminjam(){
        
    }
    
  public peminjam(String kodeanggota, String kodebuku, String tglpinjam, String tglkembali){
     this.kodeanggota = kodeanggota;
        this.kodebuku= kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali= tglkembali;
    }
  
    
    
    
    
    public String getKodeanggota() {
        return kodeanggota;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
    public int getSelisih(){
        return 1;
    }
    
}