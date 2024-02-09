package poojav;

import java.util.Scanner;

public class Etudiant {
	private String nom;
	private String prenom;
	private int matricule;
	private double note;
	public Etudiant(String n, String p , int m ,double nt) {
		nom=n;
		prenom=p;
		matricule=m;
		note=nt;
		
	}
	public void ajouter_note(double nt) {
		Scanner note= new Scanner(System.in);

		System.out.println("Entre la note: "); 
	    nt = note.nextInt();  
	}
	public void supprimer_note(double nt) {
		System.out.print("notes supprimer est"+nt);
	}

}
