package bank.driver;

import java.util.Scanner;
import bank.model.BankAccount;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount akun = new BankAccount("Arya", "123456", 100000);

        int pilihan;

        do {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Info Akun");
            System.out.println("5. Riwayat Transaksi");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo: " + akun.getSaldo());
                    break;

                case 2:
                    System.out.print("Jumlah setor: ");
                    akun.setor(input.nextDouble());
                    break;

                case 3:
                    System.out.print("Jumlah tarik: ");
                    akun.tarik(input.nextDouble());
                    break;

                case 4:
                    akun.tampilkanInfo();
                    break;

                case 5:
                    akun.tampilkanRiwayat();
                    break;

                case 6:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 6);

        input.close();
    }
}
