public class Libro extends Articulo{
    private String autor;
    private int noPaginas;

    public Libro(){
        super();
        autor="";
        noPaginas=0;
    }
    public Libro(String c, String t, int a, boolean d,String au,int n){
        super(c,t,a,d);
        autor=au;
        noPaginas=n;
    }
    public String getCreador(){
        return autor;
    }
    public int getNoPaginas(){
        return noPaginas;
    }
    public String toString()
    {
        return super.toString()+"\nAutor: "+autor+"\nNumero de paginas: "+noPaginas;
    }
}
