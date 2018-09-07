import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int opcion;
        Agencia age = new Agencia();
        do {
            System.out.println("MENU\n1. Agregar carro\n2. Eliminar carro\n3. Buscar tipo de carro\n4. Buscar carro con presupuesto" +
                    "\n5. Carro con mejor rendimiento\n6. Imprimir lista de carros\n7. Mostrar pickups\n8. Salir\nOpcion: ");

             opcion = input.nextInt();
             input.nextLine();
             switch(opcion){
                 case 1:
                     System.out.println("Eliga un tipo de carro\n1. Compacto\n2. Familiar\n3. Pickup");
                     int car = input.nextInt();
                     input.nextLine();
                     System.out.println("Escriba el modelo");
                     String nam = input.nextLine();
                     System.out.println("Escriba el fabricante");
                     String fab = input.nextLine();
                     System.out.println("Escriba la capacidad de combustible");
                     double cap = input.nextDouble();
                     System.out.println("Escriba el rendimiento en km/lt o kwh/100km");
                     double ren = input.nextDouble();
                     System.out.println("Escriba el precio");
                     double pre = input.nextDouble();
                     switch(car){
                         case 1:
                             System.out.println("Eliga tipo de combustible\n1. Gasolina\n2. Electrico");
                             int co = input.nextInt();
                             age.agregarCarro(new Compacto(nam,fab,cap,ren,pre,co));
                             break;

                         case 2:
                             System.out.println("Eliga\n1. Con DVD\n2. Sin DVD");
                             int dvd = input.nextInt();
                             age.agregarCarro(new Familiar(nam,fab,cap,ren,pre,dvd));
                             break;

                         case 3:
                             System.out.println("Escriba el ancho de caja");
                             double an = input.nextDouble();
                             System.out.println("Escriba el largo de caja");
                             double la = input.nextDouble();
                             System.out.println("Escriba el alto de caja");
                             double alt = input.nextDouble();
                             System.out.println("Escriba la capacidad de carga");
                             int carg = input.nextInt();
                             age.agregarCarro(new Pickup(nam,fab,cap,ren,pre,an,la,alt,carg));
                             break;


                     }
                     break;

                 case 2:
                     System.out.println(age.toString());
                     System.out.println("Escriba el numero del carro a eliminar");
                     int op = input.nextInt();
                     age.borrarCarro(op);
                     break;


                 case 3:
                     System.out.println("Escriba el tipo del vehiculo\n1. Compacto\n2. Pickup\n3. Familiar");
                     int tipo = input.nextInt();
                             if(age.existencia(tipo))
                                 System.out.println("Se encontro el carro en el sistema");
                             else
                                 System.out.println("No se encontro el carro en el sistema");

                     break;

                 case 4:
                     System.out.println("Escriba un presupuesto");
                     double presu = input.nextDouble();
                     age.carrosAdquiribles(presu);
                     break;

                 case 5:
                     age.mayorRendimiento();
                     break;

                 case 6:
                     System.out.println(age.toString());
                     break;


                 case 7:
                     age.muestraPickups();
                     break;




             }


        }while(opcion!=8);




    }
}
