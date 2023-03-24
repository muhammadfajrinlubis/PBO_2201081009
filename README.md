# PBO_2201081009

class BelajarJava {
   
  static void sapa() {
    System.out.println("Halo");
  }
     
  public static void main(String args[]){
    sapa();
    sapa();
    sapa();
  }
   
}

Function sapa() tidak mengembalikan nilai, sehingga tipeDataKembalian diisi dengan keyword void. Isi dari function sapa() sendiri hanya 1 perintah System.out.println(“Halo Duniailkom”) seperti di baris 4.

Setelah di definisikan, sebuah function bisa dijalankan berkali-kali, inilah yang saya lakukan antara baris 11 – 13. Setiap kali perintah sapa() ditulis, akan tampil teks “Halo ” di layar.

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

setiap baris kode yang berjalan di Java harus berada di dalam file class. Kelas harus selalu dimulai dengan huruf besar pertama.
Catatan: Java bersifat case-sensitive: "MyClass" dan "myclass" memiliki arti yang berbeda.
