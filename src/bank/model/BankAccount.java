package bank.model;

import java.util.ArrayList;

public class BankAccount {
    private String namaPemilik;
    private String nomorRekening;
    private double saldo;
    private ArrayList<Transaction> riwayat;

    // Constructor
    public BankAccount(String namaPemilik, String nomorRekening, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
        this.riwayat = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    // Setor
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            riwayat.add(new Transaction("DEPOSIT", jumlah));
            System.out.println("Setor berhasil!");
        } else {
            System.out.println("Jumlah tidak valid!");
        }
    }

    // Tarik
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            riwayat.add(new Transaction("WITHDRAW", jumlah));
            System.out.println("Penarikan berhasil!");
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    // Tampilkan riwayat
    public void tampilkanRiwayat() {
        if (riwayat.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            System.out.println("=== RIWAYAT TRANSAKSI ===");
            for (Transaction t : riwayat) {
                t.tampilkanTransaksi();
            }
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + namaPemilik);
        System.out.println("No Rekening : " + nomorRekening);
        System.out.println("Saldo : " + saldo);
    }
}
