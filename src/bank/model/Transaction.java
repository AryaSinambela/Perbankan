package bank.model;

import java.time.LocalDateTime;

public class Transaction {
    private String tipe; // DEPOSIT / WITHDRAW
    private double jumlah;
    private LocalDateTime waktu;

    // Constructor
    public Transaction(String tipe, double jumlah) {
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.waktu = LocalDateTime.now();
    }

    // Getter
    public String getTipe() {
        return tipe;
    }

    public double getJumlah() {
        return jumlah;
    }

    public LocalDateTime getWaktu() {
        return waktu;
    }

    // Menampilkan transaksi
    public void tampilkanTransaksi() {
        System.out.println(tipe + " | " + jumlah + " | " + waktu);
    }
}
