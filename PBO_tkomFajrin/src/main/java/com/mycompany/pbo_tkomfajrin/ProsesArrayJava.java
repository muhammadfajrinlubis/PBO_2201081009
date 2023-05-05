/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_tkomfajrin;

/**
 *
 * @author HP14s FQ2002AU
 */
import java.util.Scanner;
import java.util.Random;// 1.import random
public class ProsesArrayJava {
    public static void main(String[] args)
    {
        int[] nilai;
        int n,i,sum;
        double rata;
        int max,imax,min,imin;
        Random rand = new Random(); // membuat objek random
        
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan bayak data :");
        n = in.nextInt();
        nilai = new int[n]; //membuat array ukuran n
        //mengisi array
        for (i=0;i<n;i++)
        {
           // System.out.print("Nilai ke- "+(i+1)+" = ");
           // nilai[i] = in.nextInt();
            nilai[i] = rand.nextInt(100);//0-99
        }
        // peroses isi array
        sum = nilai[0];
        max = nilai[0]; imax = 0;
        min = nilai[0]; imin = 0;
        for(i=1;i<n;i++)
        {
            sum = sum + nilai[i];
            if(nilai[i]>max)
            {
                max = nilai[i];
                imax = i;
            }
            if(nilai[i]<min)
            {
                min = nilai[i];
                imin = i;
            }
        }
        rata = (double)sum/n;
        //menampilkan isi array 
        System.out.println("\n====Daftar Nilai====");
        for(i=0;i<n;i++)
        {
            System.out.println("Nilai ke- "+(i+1)+" = "+nilai[i]);
        }
         System.out.println("Jumlah nilai = "+sum);
         System.out.println("rata - rata nilai = "+rata);
         System.out.println("nilai terbesar = "+max);
         System.out.println("NIlai terbesar adalah nilai ke - "+(imax+i)+"dengan nilai"+max);
         System.out.println("Nilai terkecil =  "+min);
         System.out.println("Nilai terkecil adalah Nilai ke- "+(imin+1)+"dengan nilai "+min);
    }
    
    
}
    

