/**
* File : MPoligon.java 08/03/2023
* Penulis : Darrel Arsa Putranto
* NIM : 24060121140155
* Deskripsi : Driver class untuk poligon dan persegi panjang
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
		Segitiga segitiga = new Segitiga(6,26,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
	}
}