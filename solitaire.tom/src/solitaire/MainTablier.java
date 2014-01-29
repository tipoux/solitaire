package solitaire;

public class MainTablier
{	
	public static void main(String[] args)
	{	
		DeplacementTablier a = new DeplacementTablier(7,7);
		a.Structure();
		a.affiche();
		for(int i = 0; i < 49; i++)
		{
			a.jouer();
			a.affiche();
		}
	}
}
