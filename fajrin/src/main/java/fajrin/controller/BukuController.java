/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.controller;
import fajrin.dao.BukuDao;
import fajrin.dao.BukuDaoImpl;
import fajrin.model.Buku;
import fajrin.view.FromBuku;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP14s FQ2002AU
 */
public class BukuController {
    FromBuku view;
    Buku buku;
    BukuDao dao;
    
    public BukuController(FromBuku view){
        this.view = view;
        dao = new BukuDaoImpl();
    }
    public void celearFrom(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
         view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
       }
     public void tampil (){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> List = dao.getAll();
        for (Buku a : List) {
            Object[] row = {
            a.getKodeBuku(),
            a.getNamaBuku(),
            a.getPengarang(),
            a.getPenerbit()
        };
        tabelModel.addRow(row);
    }
    }
      public void insert(){
        buku = new Buku();
        buku.setKodeBuku(view.getTxtKodeBuku().getText());
        buku.setNamaBuku(view.getTxtJudulBuku().getText());
        buku.setPengarang(view.getTxtPengarang().getText());
        buku.setPenerbit(view.getTxtPenerbit().getText());
        dao.insert(buku);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    }
        public void update(){
            
        int index = view.getTabelBuku().getSelectedRow();
        buku.setKodeBuku(view.getTxtKodeBuku().getText());
        buku.setNamaBuku(view.getTxtJudulBuku().getText());
        buku.setPengarang(view.getTxtPengarang().getText());
        buku.setPenerbit(view.getTxtPenerbit().getText());
        dao.update(index, buku);
        JOptionPane.showMessageDialog(view, "update Data Ok");
    }
      public void delete(){
        int index = view.getTabelBuku().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete Data Ok");
    }
      public void getBuku(){
        int index = view.getTabelBuku().getSelectedRow();
        buku = dao.getBuku(index);
        view.getTxtKodeBuku().setText(buku.getKodeBuku());
        view.getTxtJudulBuku().setText(buku.getNamaBuku());
        view.getTxtPengarang().setText(buku.getPengarang());
        view.getTxtPenerbit().setText(buku.getPenerbit());
   }
   
        
}
