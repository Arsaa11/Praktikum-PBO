/*
* Nama File : AngkaSialException.java
* Nama      : Darrel Arsa Putranto
* NIM       : 24060121140155
* Tanggal   : 29/03/2023
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
* Lab		: B1
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}