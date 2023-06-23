/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.controller;
import fajrin.dao.*;
import fajrin.model.*;
import java.util.*;
import fajrin.view.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP14s FQ2002AU
 */
public class Anggotacontroller {
    FormAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    
    public Anggotacontroller(FormAnggota view){
        this.view = view;
        dao = new AnggotaDaoImpl();
    }
    public void celearFrom(){
        view.getTxtkodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtalamat().setText("");
        view.getCboJeniskelamin().removeAll();
        view.getCboJeniskelamin().addItem("L");
        view.getCboJeniskelamin().addItem("P");
    }
    
  
    public void tampil (){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> List = dao.getAll();
        for (Anggota a : List) {
            Object[] row = {
            a.getKodeAnggota(),
            a.getNamaAnggota(),
            a.getAlamat(),
            a.getJeniskelamin()
        };
        tabelModel.addRow(row);
    }
    }
    public void insert(){
        anggota = new Anggota();
        anggota.setKodeAnggota(view.getTxtkodeAnggota().getText());
        anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtalamat().getText());
        anggota.setJeniskelamin(view.getCboJeniskelamin().getSelectedItem().toString());
        dao.insert(anggota);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    }
     public void update(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota.setKodeAnggota(view.getTxtkodeAnggota().getText());
        anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtalamat().getText());
        anggota.setJeniskelamin(view.getCboJeniskelamin().getSelectedItem().toString());
        dao.update(index, anggota);
        JOptionPane.showMessageDialog(view, "update Data Ok");
    }
    public void delete(){
        int index = view.getTabelAnggota().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete Data Ok");
    }
    public void getAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        anggota = dao.getAnggota(index);
        view.getTxtkodeAnggota().setText(anggota.getKodeAnggota());
        view.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
        view.getTxtalamat().setText(anggota.getAlamat());
        view.getCboJeniskelamin().setSelectedItem(anggota.getJeniskelamin());
   }
   
}
