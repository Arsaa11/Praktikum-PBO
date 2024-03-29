/*
* Nama File : Poligon.java 
* Nama      : Darrel Arsa Putranto
* NIM       : 24060121140155
* Tanggal   : 16/03/2023
* Deskripsi : Representasi dasar dari objek poligon (segi banyak)
* Lab		: B1
*/

package org.poligon; 
 
public class Poligon{ 
	protected int jumlahSisi; 
	public Poligon(){ 
		this.jumlahSisi = 0; 
	} 
	
	public int getJumlahSisi(){ 
		return this.jumlahSisi; 
	} 
	
	public void setJumlahSisi(int sisi){ 
		this.jumlahSisi = sisi; 
	} 
}