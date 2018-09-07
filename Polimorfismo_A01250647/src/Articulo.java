public class Articulo {
    private String codigo;
    private String titulo;
    private int anio;
    private boolean disponible;

    public Articulo(){
        codigo="";
        titulo="";
        anio=0;
        disponible=false;
    }

    public Articulo(String c, String t,int a,boolean d)
    {
        codigo=c;
        titulo=t;
        anio=a;
        disponible=d;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAnio(){
        return anio;
    }
    public boolean isDisponible(){
        return disponible;
    }
    public void setDisponible(){
        disponible=!disponible;
    }
    public String toString(){
        return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAño: "+anio+"\nDisponible: "+disponible;
    }
}
