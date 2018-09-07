public class Musica extends Articulo{
    private String interprete;
    private String formato;

    public Musica(){
        super();
        interprete="";
        formato="";
    }
    public Musica(String c, String t, int a, boolean d,String i, String f){
        super(c,t,a,d);
        interprete=i;
        formato=f;
    }
    public String getCreador(){
        return interprete;
    }
    public String formato(){
        return formato;
    }
    public String toString(){
        return super.toString()+"\nInterprete: "+interprete+"\nFormato: "+formato;
    }
}
