package amw.informatyka.zadanie1;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Pracownik.java
//  @ Date : 2017-12-22
//  @ Author : 
//
//




public class Pracownik extends Osoba {
	public String stanowisko;
	public int etat;
	
	
	
	public Pracownik(long pesel, String imie, String nazwisko, String stanowisko) {
		super(pesel, imie, nazwisko);
		this.stanowisko = stanowisko;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+stanowisko;
	}
	
	
}