package amw.informatyka.zadanie1;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Student.java
//  @ Date : 2017-12-22
//  @ Author : ?
//
//




public class Student extends Osoba {
	public long indeksNr;
	public boolean dzienny;
	
	public Student(long pesel, String imie, String nazwisko, long indeks) {
		super(pesel, imie, nazwisko);
		this.indeksNr = indeks;
	}
	public void addOcena() {
	
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " indeks:"+indeksNr;
	}
	
	
}
