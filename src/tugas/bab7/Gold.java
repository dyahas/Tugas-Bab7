package mainsalonk;

public class Gold extends Member {

    double diskon;

    public Gold(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }

    @Override
    public double diskonLayanan() {
        return 0.15;
    }

    @Override
    public double diskonProduk() {
        return super.diskonProduk();
    }

    @Override
    public void anggota() {
        super.anggota();
        System.out.println("Selamat, Anda mendapatkan Diskon!");
        System.out.println("15% untuk layanan");
        System.out.println("10% untuk pembelian produk");
    }

    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaLayanan() * diskonLayanan();
        return total;
    }
}
