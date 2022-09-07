package SınıfıGeçme;

import java.util.Scanner;

public class sinifigecme {
    
public static void main(String[] args) {
        
Scanner bar = new Scanner(System.in);

int Turkce, Mat, Fizik, Kimya, Muzik;
        
/*
100 ile 85 arası olan olan puanlar : 5 üzerinden sayılır
        
85 ile 70 arası olan puanlar : 4 üzerinden
        
70 ile 55 arası olan puanlar : 3 üzerinden
        
55 ile 40 arası olan puanlar : 2 üzerinden
       
40 ile 10 arası olan puanlar : 1 üzerinden sayıyoruz.
*/

System.out.print("Turkce notunu girin :");
        
Turkce = bar.nextInt();
        
if ((Turkce > 100) || (Turkce < 10)) {
            
System.out.println("Türkçe notunuz : 0");
    }

System.out.print("Matematik notunu girin :");
        
Mat = bar.nextInt();
        
if ((Mat > 100) || (Mat < 10)) {
            
System.out.println("Matematik notunuz : 0");
    }

System.out.print("Fizik notunu girin :");
        
Fizik = bar.nextInt();
        
if ((Fizik > 100) || (Fizik < 10)) {
            
System.out.println("Fizik notunuz : 0");
    }

System.out.print("Kimya notunu girin :");
        
Kimya = bar.nextInt();
        
if ((Kimya > 100) || (Kimya < 10)) {
            
System.out.println("Kimya notunuz : 0");
    }

System.out.print("Muzik notunu girin :");
        
Muzik = bar.nextInt();
        
if ((Muzik > 100) || (Muzik < 10)) {
            
System.out.println("Müzik notunuz : 0");
    }

double toplamortalama = ((Turkce + Mat + Fizik + Kimya + Muzik) / 5);

if ((toplamortalama >= 55)) {
        
System.out.println("Tebrikler , Sınıfı Geçtiniz");
        
    } 
else {

System.out.println("Sınıfta Kaldınız !!");
    }
    }
}
