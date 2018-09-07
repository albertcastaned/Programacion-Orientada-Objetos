public class Poder {
    //Declarar variables
    private int tiempoDar;
    private double posx;
    private double posy;

    //Constructores
    public Poder(){
        tiempoDar=0;
        posx=0;
        posy=0;
    }

    public Poder(int t, double x, double y)
    {
        tiempoDar=t;
        posx=x;
        posy=y;
    }

    //Setters y getters
    public void setTiempoDar(int t)
    {
        tiempoDar=t;
    }

    public int getTiempoDar()
    {
        return tiempoDar;
    }

    public void setPosx(double x)
    {
        posx=x;
    }

    public double getPosx()
    {
        return posx;
    }

    public void setPosy(double y)
    {
        posy=y;
    }

    public double getPosy()
    {
        return posy;
    }

    public int[] generarPosicion(){

    }

    public int generarValor()
    {
        int x;
        return x;
    }



}
