package amw.informatyka.zadanie1;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Indeks.java
//  @ Date : 2017-12-22
//  @ Author : 
//
//




public class Indeks {
	public long numer;
	public float[] stopnie;
	public boolean zaliczenie;
	
	static long liczba = 1;
	
	
	
	public Indeks() {
		super();
		this.numer = liczba++;
		//liczba++;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nr:"+numer;
	}

}
