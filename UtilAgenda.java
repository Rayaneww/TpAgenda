//Rayane WATTEEUW Etudiant BTS SIO Option SLAM/Developpeur
//Lycee Réne Descartes Champs sur marne 77420, France
//25/03/2025
import java.util.*;
import java.io.*;

public class UtilAgenda {

	public static void main(String[] args) {
		Gestion_Agenda agenda = new Gestion_Agenda();
		try     {
			FileInputStream f = new FileInputStream("tabagenda.obj");
			ObjectInputStream s = new ObjectInputStream(f);
			agenda = (Gestion_Agenda)s.readObject();
		}
		catch (IOException e) {
			System.out.println("Fichier charge ");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Probleme !!");
		}
		
		agenda.menuAgenda();

		try {
			FileOutputStream f = new FileOutputStream("tabagenda.obj");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(agenda);
			s.flush();
		}
		catch (IOException e) {
			System.out.println("Probleme IO");
		}
	}
}
