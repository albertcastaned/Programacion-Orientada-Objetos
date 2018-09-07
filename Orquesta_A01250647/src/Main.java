
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Orquesta orq = new Orquesta();
        int opcion;
        do {
            System.out.println("MENU\n1. Agregar Instrumento\n2. Borrar primer de cierto instrumento\n" +
                    "3. Imprimir informacion de todos los instrumentos\n4. Costo total\n5. Mostrar saxofones soprano\n" +
                    "6. Checar si hay instrumento\n7. Salir\nOpcion: ");

             opcion = input.nextInt();

             switch(opcion)
             {
                 case 1:
                     System.out.println("Escriba el codigo del instrumento\n");
                     String codigo = input.next();
                     System.out.println("Escriba el lugar del instrumento");
                     int lugar = input.nextInt();
                     System.out.println("Escriba el costo del instrumento");
                     double precio = input.nextDouble();

                     System.out.println("Eliga tipo de instrumento\n1. Saxofon\n2. Violin\n");
                     int instrumento = input.nextInt();
                     if(instrumento==1)
                     {
                         System.out.println("Eliga el tipo de saxofon\n1. Tenor\n2. Soprano\n3. Baritono\n");
                         int tipo = input.nextInt();
                                 orq.agrega(new Saxofon(codigo,lugar,precio,tipo));
                     }
                     else{
                         System.out.println("Escriba el numero de cuerdas\n");
                         int cuerdas = input.nextInt();
                         orq.agrega(new Violin(codigo,lugar,precio,cuerdas));
                     }

                     break;


                 case 2:
                     System.out.println("Eliga un instrumento\n1. Saxofon\n2. Violin");
                     int instrumento2 = input.nextInt();
                     if(instrumento2==1)
                     {
                         orq.baja(Saxofon.class);
                     }else{
                         orq.baja(Violin.class);
                     }

                     break;

                 case 3:
                     System.out.println(orq.toString());
                     break;


                 case 4:
                     System.out.println(orq.costoTotal());
                     break;

                 case 5:
                     orq.saxofonesSoprano();
                     break;


                 case 6:
                     System.out.println("Escriba un instrumento\n1. Saxofon\n2. Violin");
                     int instrumento3 = input.nextInt();
                     if(instrumento3==1) {
                         if(orq.checaLugar(Saxofon.class))
                             System.out.println("Se encontro el instrumento");
                         else
                             System.out.println("No se encontro el instrumento");
                     }else{
                         if(orq.checaLugar(Violin.class))
                             System.out.println("Se encontro el instrumento");
                         else
                             System.out.println("No se encontro el instrumento");
                     }




             }

        }while(opcion!=7);
    }
}
