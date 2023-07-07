/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fajrin260523;

/**
 *
 * @author HP14s FQ2002AU
 */
public class person
{
          protected String name;
          protected String address;
                /**
                * Default constructor
                */
                public person(){
         System.out.println("Inside Person:Constructor");
                name = "";
                address = "";
           }
                /**
             * Constructor dengan dua parameter
     * @param name
     * @param address
                */
        public person( String name, String address ){
                this.name = name;
                this.address = address;
                }
                /**
                * Method accessor
     * @return 
                */
                public String getName(){
                    System.err.println("Parent : getnama");
                return name;
                }
                public String getAddress(){
                return address;
                }
                public void setName( String name ){
                this.name = name;
                }
                public void setAddress( String add ){
                this.address = add;
                }
                }