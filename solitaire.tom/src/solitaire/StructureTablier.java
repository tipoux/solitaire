package solitaire;

public class StructureTablier
{
	private int[][] tablierAnglais;
	private int nbL, nbC;
	
	public StructureTablier(int nbL, int nbC)
	{
		this.setNbL(nbL);
		this.setNbC(nbC);
		setTablierAnglais(new int[nbL][nbC]);
	}

	public int getNbL() 
	{
		return nbL;
	}

	public void setNbL(int nbL) 
	{
		this.nbL = nbL;
	}

	public int getNbC() 
	{
		return nbC;
	}

	public void setNbC(int nbC) 
	{
		this.nbC = nbC;
	}

	public int[][] getTablierAnglais() 
	{
		return tablierAnglais;
	}

	public void setTablierAnglais(int[][] tablierAnglais) 
	{
		this.tablierAnglais = tablierAnglais;
	}
	
	public void Structure()
	{	
		for (int i = 0; i < getNbL(); i++) 
		{
			for( int j = 0; j < getNbC(); j++)  
				getTablierAnglais()[i][j] = 1;
		}
		
		/*for (int i = 0; i < 2; i++) 
		{
			for( int j = 2; j < 5; j++)  
				getTablierAnglais()[i][j] = 1;
		}
		
		for (int i = 2 ;i < 5; i++) 
		{
			for( int j = 0; j < getNbC(); j++)  
				getTablierAnglais()[i][j] = 1;
		}
		
		for (int i = 5; i < getNbL(); i++) 
		{
			for( int j = 2; j < 5; j++)  
				getTablierAnglais()[i][j] = 1;
		}*/
		
		getTablierAnglais()[getNbL()/2][getNbC()/2] = 2;
	}
}
