/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.dao;
import java.util.ArrayList;
import java.util.List;
import fajrin.model.peminjam;


/**
 *
 * @author HP14s FQ2002AU
 */
public class peminjamDaoImpl implements peminjamDao{
     private List<peminjam>data= new ArrayList<>();
    
    public peminjamDaoImpl(){
         data.add(new peminjam("A001","B001","10-juli-2023","13-juli-2023"));
         
         }
        
     
 public void insert(peminjam Peminjam){
        data.add(Peminjam);
    }
    
    public void update(int index, peminjam Peminjam){
        data.set(index, Peminjam);
    }
    public void delete(int index){
        data.remove( index);
    }
    public peminjam getpeminjam(int index){
        return data.get(index);
    }
    public List<peminjam>getAll(){
        return data;
    }    
}