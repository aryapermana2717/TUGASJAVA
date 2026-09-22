public class Buku {

    // Atribut private
    private String kodeBuku;
    private String judul;
    private String penulis;
    private Double harga;
    private Integer stok;

    // Constructor
    public Buku(String kodeBuku, String judul, String penulis, Double harga, Integer stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public Double getHarga() {
        return harga;
    }

    public Integer getStok() {
        return stok;
    }

    // Setter
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    // Method menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("Stok      : " + stok);
        System.out.println("----------------------------");
    }

    // Method menambah stok
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    // Method mengurangi stok
    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}