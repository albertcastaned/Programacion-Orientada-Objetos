public class Saxofon extends Instrumento{
    private int tipo;
    public Saxofon(){
        super();
        tipo=0;
    }
    public Saxofon(String c, int lug, double cost,int t)
    {
        super(c,lug,cost);
        tipo=t;
    }
    public void setTipo(int t)
    {
        tipo=t;
    }
    public int getTipo(){
        return tipo;
    }
    public String toString(){
        String string="";
        if(tipo==1)
            string="Codigo: "+codigo+"\nLugar: "+lugar+"\nCosto: "+costo+"\nTipo de saxofon: Tenor";
        else if(tipo==2)
            string="Codigo: "+codigo+"\nLugar: "+lugar+"\nCosto: "+costo+"\nTipo de saxofon: Soprano";
        else if(tipo==3)
            string="Codigo: "+codigo+"\nLugar: "+lugar+"\nCosto: "+costo+"\nTipo de saxofon: Baritono";
        return string;
    }

}

