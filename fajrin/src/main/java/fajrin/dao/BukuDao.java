/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.dao;
import fajrin.model.Buku;
import java.util.List;

/**
 *
 * @author HP14s FQ2002AU
 */
public interface BukuDao {
    void insert(Buku buku);
    void update(int index, Buku Buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku>getAll();
    
}
