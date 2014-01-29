package solitaire;

import java.util.Scanner;

public class DeplacementTablier extends tablier
{
	private int ligne1, colon1, ligne2, colon2;
	private Scanner sc;
	private int nbPions = (getNbL() * getNbC()) - 1;

	public DeplacementTablier(int nbL, int nbC) 
	{
		super(nbL, nbC);
	}
	
	public void Saisis()
	{
		sc = new Scanner(System.in);
		System.out.println("Rentrez la ligne de depart :");
	    ligne1 = sc.nextInt();
	   
	    System.out.println("Rentrez la colonne de depart :");
	    colon1 = sc.nextInt();
	    
	    System.out.println("Rentrez la ligne d'arrivee :");
	    ligne2 = sc.nextInt();
	    
	    System.out.println("Rentrez la colonne d'arrivee :");
	    colon2 = sc.nextInt();
	}
	
	public boolean jouer()
	{	
		Saisis();
		
	    int absLigne = Math.abs(ligne1 - ligne2);
		int absColon = Math.abs(colon1 - colon2);
		int millieuLigne = (ligne1 + ligne2)/2;
		int millieuColon = (colon1 + colon2)/2;
		
		if((ligne1 == ligne2 && absColon == 2) || (colon1 == colon2 && absLigne == 2))
		{
			boolean joue = getTablierAnglais()[millieuLigne][millieuColon] == 1 && getTablierAnglais()[ligne2][colon2] == 2;
			{
				getTablierAnglais()[millieuLigne][millieuColon] = 2;
				getTablierAnglais()[ligne1][colon1] = 2;
				getTablierAnglais()[ligne2][colon2] = 1;
				nbPions--;
			}
			System.out.println("Nombre de pions restant : "+nbPions);
			return joue;
		}
		else
		{
			System.out.println("Coup impossible");
			System.out.println("Nombre de pions restant : "+nbPions);
			return false;
		}
	}
}
