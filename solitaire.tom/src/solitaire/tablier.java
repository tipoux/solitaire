package solitaire;

public class tablier extends StructureTablier
{
	private String PLEINE = "(Y)";
	private String VIDE = "( )";
	private String INTERDIT = "   ";
	
	public tablier(int nbL, int nbC) 
	{
		super(nbL, nbC);
	}
	
	public void affiche()
	{
		for (int i = 0; i < getNbL(); i++) 
		{
			for( int j = 0; j < getNbC(); j++) 
			{
				String pion = "   ";
				
				switch(getTablierAnglais(i,j))
				{// TODO créer une fonction toChar(i, j)
					case 0 : pion = INTERDIT;
						break;
					case 1 : pion = PLEINE;
						break;
					case 2 : pion = VIDE;
						break;
				}
				System.out.print(pion);
			}
			System.out.println("");
		}
	}
}