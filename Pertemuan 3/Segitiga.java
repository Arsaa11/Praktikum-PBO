/**
* File : Segitiga.java 08/03/2023
* Penulis : Darrel Arsa Putranto
* NIM : 24060121140155
* Deskripsi : Representasi dari objek segitiga, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas,tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return (alas * tinggi)/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga memiliki jumlah sisi "+this.getJumlahSisi());
    }
}