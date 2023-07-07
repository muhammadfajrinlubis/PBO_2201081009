/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.controller;

import fajrin.dao.AnggotaDao;
import fajrin.dao.AnggotaDaoImpl;
import fajrin.dao.BukuDao;
import fajrin.dao.BukuDaoImpl;
import fajrin.dao.peminjamDao;
import fajrin.dao.peminjamDaoImpl;
import fajrin.model.Anggota;
import fajrin.model.Buku;
import fajrin.model.peminjam;
import fajrin.view.Frompeminjam;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP14s FQ2002AU
 */
public class peminjamcontroller {
    Frompeminjam view;
    peminjam Peminjam;
    peminjamDao dao;
    AnggotaDao anggotaDao;
    BukuDao bukudao;
    
    
    public peminjamcontroller(Frompeminjam view){
        this.view = view;
        dao = new peminjamDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukudao = new  BukuDaoImpl();
    }
    public void celearFrom(){
       view.getTanggalPinjam().setText("");
        view.getTglbalik().setText("");
       }
    public void isicombo(){
    view.getCboAnggota().removeAllItems();
    List<Anggota>listAnggota = anggotaDao.getAll();
    for(Anggota anggota : listAnggota){
        view.getCboAnggota().addItem(anggota.getKodeAnggota());
    }
    
    view.getCboBuku().removeAllItems();
    List<Buku>listBuku = bukudao.getAll();
    for(Buku buku : listBuku){
        view.getCboBuku().addItem(buku.getKodeBuku());
    }
    
}
     public void tampil (){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelbuku().getModel();
        tabelModel.setRowCount(0);
        List<peminjam> List = dao.getAll();
        for (peminjam a : List) {
            Object[] row = {
            a.getKodeanggota(),
            a.getKodebuku(),
            a.getTglpinjam(),
            a.getTglkembali(),
            a.getSelisih()
        };
        tabelModel.addRow(row);
    }
    }
      public void insert(){
        Peminjam = new peminjam("A001", "B001", "10-juli-2023", "13-juli-2023");
        Peminjam.setKodebuku(view.getCboAnggota().getSelectedItem().toString());
        Peminjam.setKodeanggota(view.getCboBuku().getSelectedItem().toString());
        Peminjam.setTglpinjam(view.getTanggalPinjam().getText());
        Peminjam.setTglkembali(view.getTglbalik().getText());
        dao.insert(Peminjam);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    }
        public void update(){
            
        int index = view.getTabelbuku().getSelectedRow();
        Peminjam.setKodebuku(view.getCboAnggota().getSelectedItem().toString());
        Peminjam.setKodeanggota(view.getCboBuku().getSelectedItem().toString());
        Peminjam.setTglpinjam(view.getTanggalPinjam().getText());
        Peminjam.setTglkembali(view.getTglbalik().getText());
        dao.update(index,Peminjam);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    }
      public void delete(){
        int index = view.getTabelbuku().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete Data Ok");
    }
      public void getpeminjam(){
        int index = view.getTabelbuku().getSelectedRow();
        Peminjam = dao.getpeminjam(index);
        view.getCboAnggota().setSelectedItem(Peminjam.getKodeanggota());
        view.getCboBuku().setSelectedItem(Peminjam.getKodebuku());
        view.getTanggalPinjam().setText(Peminjam.getTglpinjam());
        view.getTglbalik().setText(Peminjam.getTglkembali());
   }
   
        
}

