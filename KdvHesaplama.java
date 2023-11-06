package JavaCalisma;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutari, kdvliTutar;

        Scanner s = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = s.nextDouble();

        kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz tutar :" + tutar);
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Tutarı : " + kdvliTutar);




    }
}
