package mainsalonk;

public class Silver extends Member {

    double diskon;

    public Silver(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }

    @Override
    public double diskonLayanan() {
        return 0.1;
    }

    @Override
    public double diskonProduk() {
        return super.diskonProduk();
    }

    @Override
    public void anggota() {
        super.anggota();
        System.out.println("Selamat, Anda mendapatkan Diskon!");
        System.out.println("10% untuk layanan");
        System.out.println("10% untuk pembelian produk");
    }

    @Override
    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaLayanan() * diskonLayanan();
        return total;
    }
}
