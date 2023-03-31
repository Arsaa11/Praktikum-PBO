package org.bangundatar;

/*
* Nama File : Lingkaran.java
* Nama      : Darrel Arsa Putranto
* NIM       : 24060121140155
* Tanggal   : 27/03/2023
* Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
* Lab		: B1
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}