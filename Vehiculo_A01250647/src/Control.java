public class Control {

    //Declaracion de variables
    private int nivel;
    private int porcentajeAzul;
    private int porcentajeRojo;
    private int porcentajeAmarillo;
    private int porcentajeMagenta;
    private int porcentajeMetalico;

//Constructores
    public Control(){
        nivel=1;
        porcentajeAzul=70;
        porcentajeRojo=15;
        porcentajeAmarillo=10;
        porcentajeMagenta=4;
        porcentajeMetalico=1;

    }

    public Control(int n, int a, int r, int am, int m, int me)
    {
        nivel=n;
        porcentajeAzul=a;
        porcentajeRojo=r;
        porcentajeAmarillo=am;
        porcentajeMagenta=m;
        porcentajeMetalico=me;
    }

//Setters y getters
    public void setNivel(int n)
    {
        nivel=n;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setPorcentajeAzul(int p)
    {
        porcentajeAzul=p;
    }

    public int getPorcentajeAzul()
    {
        return porcentajeAzul;
    }

    public void setPorcentajeRojo(int p)
    {
        porcentajeRojo=p;
    }

    public int getPorcentajeRojo()
    {
        return porcentajeRojo;
    }

    public void setPorcentajeAmarillo(int p)
    {
        porcentajeAmarillo=p;
    }

    public int getPorcentajeAmarillo()
    {
        return porcentajeAmarillo;
    }

    public void setPorcentajeMagenta(int p)
    {
        porcentajeMagenta=p;
    }

    public int getPorcentajeMagenta()
    {
        return porcentajeMagenta;
    }
    public void setPorcentajeMetalico(int p)
    {
        porcentajeMetalico=p;
    }

    public int getPorcentajeMetalico()
    {
        return porcentajeMetalico;
    }

    public void empezar(){

    }

    public boolean enContacto(Object x, Object y)
    {
        if(((x.posx-y.posx)<5)&&((x.posy-y.posy)<5))
            return true;
        else
            return false;
    }

    public void cambiarNivel(){
        nivel++;
    }

    public void reiniciar(){

    }


}
