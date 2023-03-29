import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0, elma, armut, muz, patlican, domates, toplam;

        System.out.print("Alinan elmanin kilosunu girin:");
        elma = in.nextDouble();
        System.out.print("Alinan armutun kilosunu girin:");
        armut = in.nextDouble();
        System.out.print("Alinan domatesin kilosunu girin:");
        domates = in.nextDouble();
        System.out.print("Alinan muzun kilosunu girin:");
        muz = in.nextDouble();
        System.out.print("Alinan patlicanin kilosunu girin:");
        patlican = in.nextDouble();

        toplam = (elmaFiyat * elma) + (armutFiyat * armut) + (muzFiyat * muz) + (patlicanFiyat * patlican) + (domatesFiyat * domates);

        System.out.println("toplam tutar" + toplam + " tl");
    }
}
