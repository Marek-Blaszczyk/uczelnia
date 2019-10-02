package amw.informatyka.zadanie1.runtime;

import amw.informatyka.zadanie1.GrSzkoleniowa;
import amw.informatyka.zadanie1.Indeks;
import amw.informatyka.zadanie1.Osoba;
import amw.informatyka.zadanie1.Pracownik;
import amw.informatyka.zadanie1.PracownikNaukowy;
import amw.informatyka.zadanie1.Student;

public class Test1 {
	
	public void printOsoby() {
		Osoba osoba2 = new Pracownik(92061591870L,"Leon","Kuœmierczyk", "Wyk³adowca");

		PracownikNaukowy pracownikN = new PracownikNaukowy(92061591870L,"Adam","Rapczyñski", "Wyk³adowca","mgr in¿.");

		Student student = new Student(92061591870L,"Krzysztof","Lewicki", 12334L);
		
		// dodaæ osoby do tablicy
		
		
		//wyœwietliæ zawartoœæ tablicy
		
	}

	public static void main(String[] args) {
		System.out.println("Start");
		GrSzkoleniowa grupa = new GrSzkoleniowa();
		grupa.setNazwa("161 Nawigacja Cywilna gr. B2");
		grupa.setSymbol("161NCB2");
		
		Indeks indeks = new Indeks();
		Indeks indeks1 = new Indeks();
		
		
		Osoba osoba2 = new Pracownik(92061591870L,"Leon","Kuœmierczyk", "Wyk³adowca");

		PracownikNaukowy pracownikN = new PracownikNaukowy(92061591870L,"Adam","Rapczyñski", "Wyk³adowca","mgr in¿.");

		Student student = new Student(92061591870L,"Krzysztof","Lewicki", 12334L);

		System.out.println("grupa:"+grupa);
		System.out.println("indeks:"+indeks);
		System.out.println("indeks1:"+indeks1);

		System.out.println("osoba2:"+osoba2);
		System.out.println("pracownik naukowy:"+pracownikN);
		System.out.println("student:"+student);
		

		System.out.println("studentów:"+grupa.getLstudentow());
		grupa.addStudent(student);
		grupa.addStudent(student);
		grupa.addStudent(student);
		grupa.addStudent(student);
		System.out.println("studentów:"+grupa.getLstudentow());
		grupa.printStudenci();

	}

}
