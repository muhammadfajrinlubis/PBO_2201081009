/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin260523;

/**
 *
 * @author HP14s FQ2002AU
 */
public class PolimorfisExample {
    public static void main(String[] args) {
        person ref;
        studen studenObjek = new studen();
        Employee employeeObjek = new Employee();
        
        studenObjek.setName("fajrin");
        employeeObjek.setName("faisal");
        
        ref = studenObjek;
        System.out.println("Nama " +ref.getName());
        
        ref = employeeObjek;
        System.out.println("Nama "+ref.getName());
        printInformatika(studenObjek);
        printInformatika(employeeObjek);
        
    }
    
    public static void printInformatika(person ref) {
        if(ref instanceof studen){
            System.out.println("Nama Student"+ref.getName());
            System.out.println("Alamar Student"+ref.getAddress());
        }else if(ref instanceof Employee){
            System.out.println("Nama Employee"+ref.getName());
            System.out.println("Alamar Employee"+ref.getAddress());
        }
        
    }
}
