public class Familiar extends Vehiculo{
    private int DVD; //0 no, 1 si
    public Familiar()
    {
        super();
        DVD=0;
    }

    public Familiar(String m, String f, double c, double r, double p, int d)
    {
        super(m,f,c,r,p);
        DVD=d;
    }

    public String toString(){
        return super.toString()+(DVD==1 ? "\nDVD incluido" : "\nDVD no incluido");
    }
}

