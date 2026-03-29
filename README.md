# 💰 Aplikasi Sistem Perbankan Sederhana (Java)

Aplikasi ini merupakan sistem perbankan sederhana berbasis **Java** yang dirancang untuk mengelola saldo dan transaksi pengguna. Project ini dibuat untuk menerapkan konsep **Object-Oriented Programming (OOP)** seperti encapsulation, class, dan method.

---

## 🚀 Fitur Utama

* 👤 Membuat akun bank
* 💵 Melihat saldo
* ➕ Setor uang (Deposit)
* ➖ Tarik uang (Withdraw)
* 📄 Menampilkan informasi akun
* 🧾 (Opsional) Pencatatan transaksi sederhana

---

## 🛠️ Teknologi yang Digunakan

* **Bahasa Pemrograman:** Java
* **Paradigma:** Object-Oriented Programming (OOP)
* **Tools:** Command Line / Terminal

---

## 📂 Struktur Project

```
src/
└── bank/
    ├── model/
    │   ├── BankAccount.java
    │   └── Transaction.java
    │
    └── driver/
        └── Main.java

bin/
README.md
```

---

## ⚙️ Cara Menjalankan Program

### 1. Compile Program

Masuk ke folder `src`, lalu jalankan:

```
javac -d ../bin bank/model/*.java bank/driver/*.java
```

### 2. Jalankan Program

Masuk ke folder `bin`, lalu:

```
cd ../bin
java bank.driver.Main
```

---

## 📌 Contoh Tampilan Program

```
=== MENU BANK ===
1. Lihat Saldo
2. Setor Uang
3. Tarik Uang
4. Info Akun
5. Keluar
```

---

## 🎯 Tujuan Project

Project ini dibuat untuk:

* Melatih pemahaman dasar Java
* Menerapkan konsep OOP dalam kasus nyata
* Simulasi sederhana sistem perbankan

---

## 📈 Pengembangan Selanjutnya

Beberapa fitur yang dapat ditambahkan:

* 🔐 Login & autentikasi pengguna
* 👥 Multi akun (ArrayList)
* 🔄 Transfer antar rekening
* 🧾 Riwayat transaksi
* 💻 GUI (Java Swing / JavaFX)

---
