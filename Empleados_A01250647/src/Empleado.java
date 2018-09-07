
public class Empleado {
    protected int ID;
    protected String nombre;

    public Empleado(){
        ID=0;
        nombre="";
    }
    public Empleado(int i,String n){
        ID=i;
        nombre=n;
    }
    public int getID(){
        return ID;
    }

    public void setID(int idNUM){
        ID=idNUM;
    }

    public String getName(){
        return nombre;
    }

    public void setName(String nom){
        nombre=nom;
    }

    public String toString(){
        return "ID: "+ID+"\nNombre: "+nombre+"\n";
    }



}
