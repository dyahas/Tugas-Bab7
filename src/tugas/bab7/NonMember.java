package mainsalonk;

public class NonMember extends keanggotaan {

    double diskon;

    public NonMember(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }

    @Override
    public double diskonLayanan() {
        return 0;
    }

    @Override
    public double diskonProduk() {
        diskon = 0;
        return diskon;
    }

    @Override
    public void anggota() {
        System.out.println("Maaf, Anda tidak mendapat diskon");
    }

    @Override
    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaProduk() * diskonProduk();
        return total;
    }
}
