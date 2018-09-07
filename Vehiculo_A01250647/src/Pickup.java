public class Pickup extends Vehiculo{
    private double ancho;
    private double largo;
    private double alto;
    private int cargo;
    public Pickup(){
        super();
        ancho=0;
        largo=0;
        alto=0;
        cargo=0;
    }
    public Pickup(String m, String f, double c, double r, double p, double a,double l, double al,int car)
    {
        super(m,f,c,r,p);
        ancho=a;
        largo=l;
        alto=al;
        cargo=car;
    }
    public double rendimientoTotal(int peso){
        double total;
        total=capacidad*rendimiento;
        if(peso>cargo)
        {
            total*=.30;
        }
        return total;
    }
    public double volumen(){
        double total;
        total=ancho*largo*alto;
        return total;
    }
    public String toString(){
        return super.toString()+"\nAncho de caja:  "+ancho+"\nLargo de caja: "+largo+"\nAlto de caja: "+alto+"\nCapacidad de caja: "+cargo+"\nVolumen de caja: "+volumen()+"\n\n";

    }
}

