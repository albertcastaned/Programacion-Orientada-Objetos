
public class Nomina {
    private int indice;
    private Empleado[] empleados;

    public Nomina(){
        indice=0;
        empleados = new Empleado[10];
        for(int i=0;i<10;i++)
            empleados[i]=null;
    }


    public void agregarEmpleado(Empleado e){
        if(indice<10){
            empleados[indice]=e;
            indice++;
        }else{
            System.out.println("No hay espacio para otro empleado\n");
        }
    }

    public void borrarEmpleado(int id){
        int pos=0;
        boolean flag=false;
        for(int i=0;i<indice;i++){
            if(empleados[i].getID()==id){
                pos=i;
                flag=true;
            }
        }
        if(flag){
            for(int i=pos;i<indice;i++)
            {
                empleados[i]=empleados[i+1];
            }
            empleados[indice]=null;
            indice--;
        }else{
            System.out.println("No se encontro");
        }
    }


    public double pagoMensual(){
        double total=0;
        for(int i=0;i<indice;i++) {
            if(empleados[i] instanceof Planta)
            total += ((Planta) empleados[i]).pagoMensual();
        }
        return total;
    }

    public void incrementarPago(double porcentaje){
        double total;
        for(int i=0;i<indice;i++){
            if(empleados[i] instanceof Planta){
                total=(((Planta)empleados[i]).getSalarioMensual())+((((Planta)empleados[i]).getSalarioMensual())*(porcentaje/100));
                ((Planta)empleados[i]).setSalarioMensual(total);
            }
        }
    }

    public String toString(){
        String returnstring = "";
        for(int i=0;i<indice;i++)
        {
            returnstring+=empleados[i].toString() + "\n";
        }
        return returnstring;
    }
    public int horasExtra(){
        int count=0;

        for(int i=0;i<indice;i++){
            if(empleados[i] instanceof PorHora){
                if((((PorHora)empleados[i]).gethorasTrabajo())>40)
                    count++;
            }
        }

        return count;
    }

}
