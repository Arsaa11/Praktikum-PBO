/*
* Nama File : BangunDatar.java
* Nama      : Darrel Arsa Putranto
* NIM       : 24060121140155
* Tanggal   : 27/03/2023
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
* Lab		: B1
*/

package org.bangundatar.BangungDatar;

public abstract class BangunDatar{
	
	protected double luas;
	
	public abstract double hitungLuas (double sisi);
	
	public void setLuas (double a) {
		luas = a;
	}

	public double getLuas (){
		return luas;
	}
}