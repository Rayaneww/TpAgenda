//Rayane WATTEEUW Etudiant BTS SIO Option SLAM/Developpeur
//Lycee Réne Descartes Champs sur marne 77420, France
//25/03/2025

import java.util.Vector;
import java.io.Serializable;

public class Gestion_Agenda implements Serializable {

	private Vector<Personne> agenda;
	
	
	public Gestion_Agenda() {
		agenda = new Vector();
	}
	
	public void ajoutAgenda() {
		
		System.out.println("Entrez le nom : ");
		String n = Clavier.lire_String();
		
		System.out.println("Entrez l'adresse : ");
		String adresse = Clavier.lire_String();
		
		System.out.println("Entrez le numero de telephone : ");
		String num = Clavier.lire_String();
		
		Personne test = new Personne(n, adresse, num);
		agenda.add(test);
		System.out.println("Personne ajoutée avec succès !");
	}
	
	public void afficherAgenda() {
		System.out.println("Voici les personnes");
		for (Personne test :agenda ) {
			test.affiche();
		}
	}
	public void rechercheAgenda() {
		System.out.println("Qui voulez vous rechercher : ");
		String recherche = Clavier.lire_String();
		for(Personne test : agenda) {
			if (test.getNom().equalsIgnoreCase(recherche)) {
				System.out.println("Personne trouver ! \nNom : "+test.getNom()+"Adresse : "+test.getAdresse()+" Numero de telephone : "+ test.getNumtel());
				break;
			}
				else {
				System.out.println("Personne non trouver ! \nVerifier la syntaxe de la recherche !");	
				}
			}
		}
	
	public void menuAgenda() {
	    while (true) {
	        int choix;
	        System.out.println("1-Ajouter une Personne.");
	        System.out.println("2-Afficher toute les Personne.");
	        System.out.println("3-Rechercher une Personnes.");
	        System.out.println("4-Quitter");
	        System.out.print("Votre choix: ");
	        choix = Clavier.lire_int() ;
	        
	        while (choix < 1 || choix > 4) {
	            System.out.print("Choix incorrect. ");
	            System.out.print("Votre choix: ");
	            choix = Clavier.lire_int()  ;
	        }

	        if (choix == 1) {
	        	ajoutAgenda();
	        } else if (choix == 2) {
	            afficherAgenda();;
	        } else if (choix == 3) {
	            rechercheAgenda();
	        } else if (choix == 4) {
	            System.err.println("Au revoir");
	            break;
	        }
	        System.out.println("-------------------------------------------------------------");
	       }
	}
}
