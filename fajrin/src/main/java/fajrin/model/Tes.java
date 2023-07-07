/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin.model;

/**
 *
 * @author HP14s FQ2002AU
 */
public class Tes {
    public static void main(String[] args) {
        try{
            System.out.println(args[0]);
            System.out.println(1 / 0);
            }catch(Exception ex){
                System.err.println("Error :" +ex.getMessage());
            }
    }
    
}
