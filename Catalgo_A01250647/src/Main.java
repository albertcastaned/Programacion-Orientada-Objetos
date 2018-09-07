import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        int opcion;
        do {
            System.out.println("MENU\n1. Agregar articulo\n2. Eliminar Articulo\n3. Buscar autor" +
                    "\n4. Buscar cancion\n5. Mostrar todos los libros\n6. Mostrar todas las canciones\n7. Salir\nOpcion: ");

            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    catalogo.agregar();
                    break;
                case 2:
                    System.out.println("Escriba el codigo del articulo\n");
                    String codigo = input.next();
                    catalogo.quitar(codigo);
                    break;
                case 3:
                    System.out.println("Escriba el nombre del autor");
                    String nom = input.next();
                    catalogo.buscarAutor(nom);
                    break;
                case 4:
                    System.out.println("Escriba el nombre de la cancion");
                    String tit = input.next();
                    System.out.println("Codigo: "+catalogo.buscarCancion(tit));
                    break;
                case 5:
                    catalogo.imprimirLibros();
                    break;
                case 6:
                    catalogo.imprimirMusica();
                    break;
            }

        }while(opcion!=7);
    }
}
