/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin260523;

/**
 *
 * @author HP14s FQ2002AU
 */
public class studen extends person{
    public studen(){
        //super("fajrin","sibuhuan");
        super();
        super.name = "fajrin";
        super.address = "sibuhuann";
        System.out.println("Inside Student : Consturctor");
        //beberapa kode disini
    }
    
        @Override
        public String getName(){
        System.err.println("Student : getNama");
                     return name;
                
      }
    public static void main(String [] args){
        studen fajrin = new studen();
        System.out.println("Nama "+fajrin.name);
        System.out.println("alamar  "+fajrin.address);
    }
    
    
}
