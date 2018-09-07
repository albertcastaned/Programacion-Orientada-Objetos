public abstract class Instrumento {
    protected String codigo;
    protected int lugar;
    protected double costo;
    public Instrumento(){
        codigo="";
        lugar=0;
        costo=0;
    }
    public Instrumento(String cod, int lug, double cost)
    {
        codigo=cod;
        lugar=lug;
        costo=cost;
    }
    public void setCodigo(String c)
    {
        codigo = c;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setLugar(int l)
    {
        lugar = l;
    }
    public int getLugar(){
        return lugar;
    }
    public void setCosto(double cost)
    {
        costo = cost;
    }
    public double getCosto(){
        return costo;
    }
    public void tocar()
    {
        System.out.println("Tocando el instrumento: "+codigo);
    }
    public void afinar()
    {
        System.out.println("Afinando el instrumento: "+codigo);
    }
    public abstract String toString();

    public boolean equals(Object obj)
    {
        if(obj==this)
            return true;
        else
            return false;
    }


}
