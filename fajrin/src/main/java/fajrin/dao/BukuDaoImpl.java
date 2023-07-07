/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.dao;
import fajrin.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP14s FQ2002AU
 */
public class BukuDaoImpl implements BukuDao{
    private List<Buku> data= new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("B001","Perogram","fajrin","Fajrin"));
        data.add(new Buku("B002","java","fajrin","Fajrin"));
       
    }
 public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    public void delete(int index){
        data.remove( index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku>getAll(){
        return data;
    }    
}
