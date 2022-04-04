
package bangunruang;

public class BangunRuang {
     double volume;
     
//     volume balok
     void volume (double panjang , double lebar , double tinggi ){
         volume = panjang * lebar * tinggi;
            System.out.println("volume pertama = "+volume);
    }
    
//     volume kubus
     void volume ( int sisi ){
         volume = sisi * sisi * sisi;
            System.out.println("volume kedua = "+volume);
    }
            
}
