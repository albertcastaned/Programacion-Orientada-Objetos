
public class Planta extends Empleado{
    protected double salarioMensual;

    public Planta(){
        super();
        salarioMensual=0;
    }
    public Planta(int i, String n, double s){
        super(i,n);
        salarioMensual=s;
    }
    public double getSalarioMensual(){
        return salarioMensual;
    }
    public void setSalarioMensual(double x){
        salarioMensual=x;
    }
    public double pagoMensual(){
        return salarioMensual;
    }
    public String toString(){
        return super.toString()+"Pago mensual: "+salarioMensual+"\n";
    }

}
