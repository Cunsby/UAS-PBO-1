# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana Sistem Rental PS dan Game Center yang dibuat menggunakan bahasa Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data pelanggan yang melakukan penyewaan PlayStation. Pengguna dapat memasukkan data pelanggan seperti nama, umur, lama sewa, serta status member.

Program kemudian akan menghitung biaya penyewaan berdasarkan lama waktu sewa. Pelanggan yang berstatus member akan mendapatkan diskon khusus sesuai aturan yang telah ditentukan.

Aplikasi ini mengimplementasikan berbagai konsep penting dalam Pemrograman Berorientasi Objek (PBO) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

## Penjelasan Kode

### 1. Class

Class merupakan blueprint atau cetak biru yang digunakan untuk membuat object. Pada program ini terdapat class:

```java
Rental_Ps
Pelanggan
Member
```

### 2. Object

Object merupakan hasil instansiasi dari sebuah class.

```java
pelanggan[i] = new Pelanggan(nama, umur, lamaSewa);

pelanggan[i] = new Member(nama, umur, lamaSewa);
```

### 3. Atribut

Atribut merupakan variabel yang dimiliki oleh class untuk menyimpan data.

```java
private String nama;
private int umur;
private int lamaSewa;
```

### 4. Constructor

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

```java
public Pelanggan(String nama, int umur, int lamaSewa) {
    this.nama = nama;
    this.umur = umur;
    this.lamaSewa = lamaSewa;
}
```

### 5. Mutator

Mutator atau setter digunakan untuk mengubah nilai atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(int umur) {
    this.umur = umur;
}

public void setLamaSewa(int lamaSewa) {
    this.lamaSewa = lamaSewa;
}
```

### 6. Accessor

Accessor atau getter digunakan untuk mengambil nilai atribut.

```java
public String getNama() {
    return nama;
}

public int getUmur() {
    return umur;
}

public int getLamaSewa() {
    return lamaSewa;
}
```

### 7. Encapsulation

Encapsulation diterapkan dengan menggunakan modifier private pada atribut sehingga data tidak dapat diakses langsung dari luar class.

```java
private String nama;
private int umur;
private int lamaSewa;
```

Data hanya dapat diakses melalui getter dan setter.

### 8. Inheritance

Inheritance diterapkan pada class Member yang mewarisi class Pelanggan.

```java
public class Member extends Pelanggan {
    ...
}
```

### 9. Polymorphism

Polymorphism diterapkan melalui method overriding pada method hitungBiaya().

```java
@Override
public double hitungBiaya() {
    return getLamaSewa() * 5000 * 0.9;
}
```

Method tersebut memberikan perilaku berbeda untuk pelanggan member berupa diskon 10%.

### 10. Seleksi

Seleksi digunakan untuk menentukan apakah pelanggan merupakan member atau bukan.

```java
if(status.equalsIgnoreCase("y")) {
    pelanggan[i] = new Member(nama, umur, lamaSewa);
} else {
    pelanggan[i] = new Pelanggan(nama, umur, lamaSewa);
}
```

### 11. Perulangan

Perulangan digunakan untuk melakukan input dan menampilkan data pelanggan.

```java
for(int i = 0; i < jumlah; i++) {
    ...
}
```

### 12. Input Output Sederhana

Program menggunakan Scanner untuk menerima input dari pengguna dan System.out.println untuk menampilkan output.

```java
Scanner input = new Scanner(System.in);
System.out.println();
```

### 13. Array

Array digunakan untuk menyimpan beberapa object pelanggan.

```java
Pelanggan[] pelanggan = new Pelanggan[jumlah];
```

### 14. Error Handling

Error handling digunakan untuk menangani kesalahan input.

```java
try {
    ...
} catch(Exception e) {
    System.out.println("Input tidak valid!");
}
```

## Cara Menjalankan Program

1. Buka project menggunakan NetBeans 8.2.
2. Jalankan file Rental_Ps.java.
3. Masukkan jumlah pelanggan.
4. Masukkan data pelanggan yang terdiri dari nama, umur, lama sewa, dan status member.
5. Program akan menampilkan data pelanggan beserta total biaya penyewaan.

## Usulan Nilai

| No | Materi         | Nilai   |
| -- | -------------- | ------- |
| 1  | Class          | 5       |
| 2  | Object         | 5       |
| 3  | Atribut        | 5       |
| 4  | Constructor    | 5       |
| 5  | Mutator        | 5       |
| 6  | Accessor       | 5       |
| 7  | Encapsulation  | 5       |
| 8  | Inheritance    | 5       |
| 9  | Polymorphism   | 10      |
| 10 | Seleksi        | 5       |
| 11 | Perulangan     | 5       |
| 12 | IO Sederhana   | 10      |
| 13 | Array          | 15      |
| 14 | Error Handling | 15      |
|    | **TOTAL**      | **100** |

## Pembuat

Nama : Dimas By
Mata Kuliah : Pemrograman Berbasis Objek 1
Studi Kasus : Sistem Rental PS dan Game Center
