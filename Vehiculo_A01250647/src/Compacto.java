public class Compacto extends Vehiculo {
    private boolean tipoCombustible; //0 electrico, 1 gasolina
    public Compacto()
    {
        super();
        tipoCombustible=false;
    }
    public Compacto(String m, String f, double c, double r, double p, int t)
    {
        super(m,f,c,r,p);
        if(t==1)
            tipoCombustible=true;
        else
            tipoCombustible=false;
    }
    public double rendimientoTotal(){
        double total;
        if(tipoCombustible==false)
        {
            total=capacidad*rendimiento;
        }else{
            total=(capacidad*100)/rendimiento;
        }
        return total;
    }

    public String toString(){
        return super.toString()+"\nTipo de combustible: "+ (tipoCombustible ? "Gasolina" : "Electrico");
    }
}

