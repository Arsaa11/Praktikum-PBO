/*
* Nama File : OperasiTitik.java 
* Nama/NIM  : Darrel Arsa Putranto/24060121140155
* Tanggal   : 07/03/2023
*/

class OperasiTitik {
	public void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	public void refleksiSumbuY (Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
}