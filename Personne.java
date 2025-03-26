//Rayane WATTEEUW Etudiant BTS SIO Option SLAM/Developpeur
//Lycee Réne Descartes Champs sur marne 77420, France
//25/03/2025
import java.io.Serializable;

public class Personne implements Serializable{

	private String nom,adresse,numtel;
	static private int nbdePersonne;

	public Personne(String n , String a, String num) {
		nom = n;
		adresse = a ;
		numtel = num;
		nbdePersonne++;
	}

	public static int getNbdePersonne() {
		return nbdePersonne;
	}

	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getNumtel() {
		return numtel;
	}
	
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println("Nom : "+nom+" Adresse : "+adresse+" Numero de telephone : "+numtel);
	}

	
}
