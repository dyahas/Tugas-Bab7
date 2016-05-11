package mainsalonk;

public abstract class keanggotaan {

    public abstract double diskonLayanan();

    public abstract double diskonProduk();
    public String nama;
    public String produk, layanan;
    public double hargaJ, hargaP;

    public keanggotaan(String produk, String jasa, double hargaP, double hargaJ, String nama) {
        this.produk = produk;
        this.layanan = jasa;
        this.hargaP = hargaP;
        this.hargaJ = hargaJ;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getProduk() {
        return produk;
    }

    public String getLayanan() {
        return layanan;
    }

    public double getHargaLayanan() {
        return hargaJ;
    }

    public double getHargaProduk() {
        return hargaP;
    }

    public void anggota() {
        System.out.println("");
    }

    public void tampilkan() {
        System.out.println("Nama                              : " + nama);
        System.out.println("Nama Produk                       : " + produk);
        System.out.println("Harga Produk                      : " + hargaP);
        System.out.println("Layanan                           : " + layanan);
        System.out.println("Harga Layanan                     : " + hargaJ);
    }

    public double bayar() {
        double total;
        total = getHargaProduk() + getHargaLayanan();
        return total;
    }
}
