package mainsalonk;

import java.util.Scanner;

public class MainSalonK {

    public static String line = "=============================================";
    public static String ln = "---------------------------------------------";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String produk, layanan, nama;
        double hargaP, hargaL;
        int pilih;
        do {
            System.out.println(line);
            System.out.println("        SELAMAT DATANG DI BEAUTY SALON");
            System.out.println(line);
            System.out.println("LAYANAN");
            System.out.println(ln);
            System.out.println("1. Haircut                      Rp 20.000");
            System.out.println("2. Facial                       Rp 30.000");
            System.out.println("3. Creambath                    Rp 30.000");
            System.out.println(ln);
            System.out.println("PRODUK");
            System.out.println(ln);
            System.out.println("4. Lulur                        Rp 30.000");
            System.out.println("5. VitaminRambut                Rp 20.000");
            System.out.println("6. BodyLotion                   Rp 30.000");
            System.out.println(line);
            System.out.println("KEANGGOTAAN");
            System.out.println(ln);
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Non-anggota");
            System.out.print("Masukkan pilihan anda             :  ");
            pilih = in.nextInt();
            System.out.println(line);
            System.out.print("Masukkan nama                     : ");
            nama = in.next();
            System.out.print("Masukkan produk yang dibeli       : ");
            produk = in.next();
            System.out.print("Masukkan harga produk             : ");
            hargaP = in.nextDouble();
            System.out.print("Masukkan layanan                  : ");
            layanan = in.next();
            System.out.print("Masukkan harga layanan            : ");
            hargaL = in.nextDouble();
            switch (pilih) {
                case 1:
                    keanggotaan pr = new Premium(produk, layanan, hargaP, hargaL, nama);
                    pr.anggota();
                    System.out.println(ln);
                    pr.tampilkan();
                    System.out.println("Total Harga                       : " + pr.bayar());
                    System.out.println();
                    break;
                case 2:
                    keanggotaan gd = new Gold(produk, layanan, hargaP, hargaL, nama);
                    gd.anggota();
                    System.out.println(ln);
                    gd.tampilkan();
                    System.out.println("Total Harga                       : " + gd.bayar());
                    System.out.println();
                    break;
                case 3:
                    keanggotaan sv = new Silver(produk, layanan, hargaP, hargaL, nama);
                    sv.anggota();
                    System.out.println(ln);
                    sv.tampilkan();
                    System.out.println("Total Harga                       : " + sv.bayar());
                    System.out.println();
                    break;
                case 4:
                    keanggotaan nm = new NonMember(produk, layanan, hargaP, hargaL, nama);
                    nm.anggota();
                    System.out.println(ln);
                    nm.tampilkan();
                    System.out.println("Total Harga                       : " + nm.bayar());
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih >= 1 && pilih < 5);
    }

}
