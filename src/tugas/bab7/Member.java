package mainsalonk;

public class Member extends keanggotaan {

    public Member(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }

    @Override
    public double diskonProduk() {
        return 0.1;
    }

    @Override
    public void anggota() {
        System.out.println("Anda adalah member.");
        System.out.println("Dapatkan diskon Anda");
    }

    @Override
    public double diskonLayanan() {
        return 0;
    }

    @Override
    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaProduk() * diskonProduk();
        return total;
    }
}
