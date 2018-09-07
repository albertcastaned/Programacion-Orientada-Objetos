public class PorHora extends Empleado {
    protected int horasTrabajo;
    protected double horaCuota;

    public PorHora(){
        super();
        horasTrabajo=0;
        horaCuota=0;
    }
    public PorHora(int i,String n,int ht, double hc){
        super(i,n);
        horasTrabajo=ht;
        horaCuota=hc;
    }

    public int gethorasTrabajo(){
        return horasTrabajo;
    }

    public void setHorasTrabajo(int h){
        horasTrabajo=h;
    }
    public double gethoraCuota(){
        return horaCuota;
    }
    public void setHoraCuota(double h){
        horaCuota=h;
    }
    public String toString(){
        return super.toString()+"Horas trabajadas: "+horasTrabajo+"\nCuota por hora: "+horaCuota+"\n";
    }
}
