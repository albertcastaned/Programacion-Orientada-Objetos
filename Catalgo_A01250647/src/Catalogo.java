
import java.util.Scanner;
public class Catalogo {
     private int opcion,an,noP,tamanio,posicion;
     private String cod,tit,au,in,fo;
     private Articulo[] arr;

    private Scanner input = new Scanner(System.in);
    public Catalogo(){
        tamanio=50;
        posicion=0;
        arr = new Articulo[tamanio];
    }

    public void agregar(){
        System.out.println("1. Agregar libro\n2. Agregar cancion\nOpcion:");
        opcion = input.nextInt();
        input.nextLine();
        System.out.println("Escriba el codigo\n");
        cod = input.nextLine();
        System.out.println("Escriba el titulo\n");
        tit = input.nextLine();
        System.out.println("Escriba el año de publicacion\n");
        an = input.nextInt();
        input.nextLine();
        if(opcion==1)
        {
            System.out.println("Escriba el nombre del autor\n");
            au = input.nextLine();
            System.out.println("Escriba el numero de paginas\n");
            noP = input.nextInt();
            input.nextLine();
            arr[posicion] = new Libro(cod,tit,an,true,au,noP);
            posicion++;
        }else{
            System.out.println("Escriba el nombre del interprete\n");
            in = input.nextLine();
            System.out.println("Escriba el formato\n");
            fo = input.nextLine();
            arr[posicion] = new Musica(cod,tit,an,true,in,fo);
            posicion++;
        }
        System.out.println("Articulo agregado\n");
    }

    public void quitar(String c){
        int pos=0,flag=0;
        for(int i=0;i<posicion;i++){
            if(arr[i].getCodigo().equals(c)) {
                pos = i;
                flag = 1;
            }
        }
        if(flag==1) {
            for (int i = pos; i < posicion; i++) {
                arr[i] = arr[i + 1];
            }
            arr[posicion] = null;
            posicion--;
        }else{
            System.out.println("No se encontro el articulo\n");
        }

    }

    public void buscarAutor(String a){
        int flag=0;
    for(int i=0;i<posicion;i++){
        if(arr[i] instanceof Libro) {
            if (arr[i].getCreador().equals(a)) {
                System.out.println(arr[i].toString());
                flag = 1;
            }
        }
        }
        if(flag==0)
            System.out.println("No se encontro resultados");

    }
    public String buscarCancion(String c){
        int flag=0;
        for(int i=0;i<posicion;i++)
        {
            if(arr[i] instanceof Musica) {
                if (arr[i].getTitulo().equals(c)) {
                    String cod = arr[i].getCodigo();
                    flag=1;
                }

            }
        }
        if(flag==0)
                return "No se encontro ningun resultado";
        else
            return cod;
    }

    public void imprimirLibros(){
        for(int i=0;i<posicion;i++){
            if(arr[i] instanceof Libro) {
                System.out.println(arr[i].toString());
                System.out.println("-------------------------------------------------\n");
            }
        }
    }
    public void imprimirMusica(){
        for(int i=0;i<posicion;i++){
            if(arr[i] instanceof Musica) {
                System.out.println(arr[i].toString());
                System.out.println("-------------------------------------------------\n");
            }
        }
    }

}
