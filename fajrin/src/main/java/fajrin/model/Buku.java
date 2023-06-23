/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.model;

/**
 *
 * @author HP14s FQ2002AU
 */
public class Buku {
    private String kodeBuku;
    private String namaBuku;
    private String Pengarang;
    private String Penerbit;

    public Buku(){
        
    }

    public Buku(String kodeBuku, String namaBuku, String Pengarang, String Penerbit) {
        this.kodeBuku = kodeBuku;
        this.namaBuku = namaBuku;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

   
    
}
