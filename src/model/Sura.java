package model;
public class Sura extends Prepagada{
	//Atributes 
	private int minimunRank;
	private int maxRank;

	//Method 
	public Sura(String name,String lastName,int age, String id, int affiliation, String entityNam, String entityNum,int minimun,int max){
		super(name,lastName,age,id,affiliation,entityNam,entityNum);
		minimunRank=minimun;
		maxRank=max;
	}

	public void setMinimunRank(int minimunRank){
		this.minimunRank=minimunRank;
	}
	public int getMinimunRank(){
		return minimunRank;
	}

	public void setMaxRank(int maxRank){
		this.maxRank=maxRank;
	}
	public int getMaxRank(){
		return maxRank;
	}
	public String toString(){
		return super.toString()+		
				"\nValor minimo del rango de cubrimiento: "+minimunRank+
				"\nValor maximo del rango de cubrimiento: "+maxRank+
				"\n*************************************************";
	}
}