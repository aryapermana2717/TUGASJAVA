public class TokoBukuApp {

    public static void main(String[] args) {

        // Membuat 2 objek buku
        Buku buku1 = new Buku(
            "B001",
            "Pemrograman Java",
            "Andi",
            75000.0,
            10
        );

        Buku buku2 = new Buku(
            "B002",
            "Belajar PBO",
            "Budi",
            85000.0,
            8
        );

        // Menampilkan informasi awal
        System.out.println("===== INFORMASI AWAL BUKU =====");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        // Menambah stok
        System.out.println("===== MENAMBAH STOK =====");
        buku1.tambahStok(5);
        buku2.tambahStok(3);

        // Mengurangi stok karena penjualan
        System.out.println("===== PENJUALAN =====");
        buku1.kurangiStok(2);
        buku2.kurangiStok(1);

        // Menampilkan informasi akhir
        System.out.println("===== INFORMASI AKHIR BUKU =====");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}