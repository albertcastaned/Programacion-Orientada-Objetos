
public class Violin extends Instrumento{
    private int numCuerdas;
    public Violin(){
        super();
        numCuerdas=0;
    }
    public Violin(String c, int lug, double cost,int num){
        super(c,lug,cost);
        numCuerdas=num;
    }
    public int getNumCuerdas(){
        return numCuerdas;
    }
    public void setNumCuerdas(int num)
    {
        numCuerdas=num;
    }

    public String toString(){
        return "Codigo: "+codigo+"\nLugar: "+lugar+"\nCosto: "+costo+"\nNumero de Cuerdas: "+numCuerdas;
    }
}




