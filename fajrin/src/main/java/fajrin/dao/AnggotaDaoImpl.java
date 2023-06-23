/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.dao;
import fajrin.model.Anggota;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP14s FQ2002AU
 */
public class AnggotaDaoImpl implements AnggotaDao{
    private List<Anggota> data= new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data.add(new Anggota("A001","fajrin","sibuhuan","L"));
        data.add(new Anggota("A002","faisal","sibuhuan","L"));
    }
    
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove( index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota>getAll(){
        return data;
    }

}