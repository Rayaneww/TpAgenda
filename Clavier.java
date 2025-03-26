import java.io.*;

class Clavier 
{
	public static String lire_String()
	{
		String ligne_lue = null;
		try 
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			ligne_lue = br.readLine();
		}
		catch (IOException e) {System.err.println(e);}
		
		return ligne_lue;
	}
	
	public static int lire_int()
	{
		return Integer.parseInt(lire_String());
	}
	
	public static double lire_double()
	{
		return Double.parseDouble(lire_String());
	}
	
	public static char lire_char()
	{
		return lire_String().charAt(0);
	}

}
