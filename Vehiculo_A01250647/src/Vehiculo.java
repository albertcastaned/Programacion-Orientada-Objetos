public class Vehiculo {
    protected String modelo;
    protected String fabricante;
    protected double capacidad;
    protected double rendimiento;
    protected double precio;
    public Vehiculo(){
        modelo="";
        fabricante="";
        capacidad=0;
        rendimiento=0;
        precio=0;
    }
    public Vehiculo(String m, String f, double c, double r, double p)
    {
        modelo=m;
        fabricante=f;
        capacidad=c;
        rendimiento=r;
        precio=p;
    }
    public double rendimientoTotal(){
        double total;
        total=capacidad*rendimiento;
        return total;
    }

    public double getPrecio(){
        return precio;
    }

    public String toString(){
        return "Modelo: "+modelo+"\nFabricante: "+fabricante+"\nCapacidad de combustible: "+capacidad+"\nRendimiento: "+rendimiento+"\nPrecio: "+precio;
    }
}
