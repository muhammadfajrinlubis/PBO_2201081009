/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.dao;

import fajrin.model.peminjam;
import java.util.List;

/**
 *
 * @author HP14s FQ2002AU
 */
public interface peminjamDao {
     void insert(peminjam Peminjam);
    void update(int index, peminjam Peminjam);
    void delete(int index);
    peminjam getpeminjam(int index);
    List<peminjam>getAll();
    
}