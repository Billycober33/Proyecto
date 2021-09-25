/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yamero;

import java.util.Scanner;

/**
 *
 * @author Elian Cordova
 */
public class YAMERO {


    public static void main(String[] args) {
        // TODO code application logic here
        int opcion, opcion2, s ;
         String KO = null;
        boolean salir = false;
        Scanner scan= new Scanner (System.in);
         while (!salir){
       System.out.println("----------------------------------------"
               + "-------   CONCESIONARIO DE AUTOS---------------------- ");// 
       System.out.println("----------------------------------------"
               + "-------     MENU PRINCIPAL---------------------- ");
       
       System.out.println("1. seleccionar Automovil");
       
       System.out.println("2. Salir");
        
       
       System.out.println("Ingrese la opcion que desea ejecutar:");
       opcion = scan.nextInt();
       
       switch (opcion){
           case 1:
               System.out.println(" ------- SELECCIONE EL GAMA ----- ");
               System.out.println(" 1 -  sedan Economico  ");
               System.out.println(" 2- sedan ");
               System.out.println(" 3- deportivo ");
               System.out.println(" 4- hibrido ");
               System.out.println(" 5- coupe ");
               System.out.println(" 6- coupe deportivo ");
               System.out.println(" 7- compacto ");
               System.out.println(" 8- hatchback ");
               System.out.println(" 9- economico version rally");
               System.out.println(" 10- regresar  a menu principal  ");
               
               System.out.println("Ingrese gama de vehiculo  ");
               opcion2 = scan.nextInt();
                switch (opcion2){
                    case 1:
           System.out.println(" 1 -  sedan Economico    = Q. 18,940.00  ");
        System.out.println("has seleccionado la gama: sedan economico:");
        int sd= 18940;
        System.out.println("Deseas agregar amendiades S/N");
           KO = scan.next();
         if ("s".equals(KO)){
           System.out.println("Tipos de amenidades");
           System.out.println("Tipo de Transmision");
           System.out.println("color de pintura");
           System.out.println("Aros");
           System.out.println("Accesorios exeriores ");
           System.out.println("Accesorios electronicos");
           System.out.println("Regresar a seleccion de gama de vehiculo ");
           
         } else {
          System.out.println("gama seleccionada: sedan economico ");
          
          System.out.println(" amenidades: ninguna");
          
          System.out.println(" total; 18940");
         }
     
         break;

         case 2 :
        System.out.println(" 2- sedan =   Q. 23570.00  ");
        System.out.println("has seleccionado la gama: sedan:");
       
        break;
        case 3:
            System.out.println(" 3 -  Deportivo  = Q. 24,100");
         System.out.println("has seleccionado la gama: deportivo :");
                                break;
         case 4:
         System.out.println(" 4- Hibrido = Q. 25100.00 ");
           System.out.println("has seleccionado la gama: hibrido:");
          break;
         case 5:
         System.out.println(" 5-  coupe = Q. 19350.00 ");
         System.out.println("has seleccionado la gama: coupe");
          break;
           case 6:
          System.out.println(" 6- coupe deportivo= Q. 24100 ");
         System.out.println("has seleccionado la gama: coupe deportivo");
           break;
           case 7:
          System.out.println(" 7 - compacto= Q. 16,190.00 ");
       System.out.println("has seleccionado la gama: compacto");
           break;
          case 8 :
         System.out.println(" 8 - Hatchback = Q. 20150.00 ");
          System.out.println("has seleccionado la gama: Hatchback");
           break;
           case 9:
        System.out.println(" 9 - Economico version =Q34,700 ");
        System.out.println("has seleccionado la gama: Economico version");
         break;
         case 10 :
          int nb= 0;
          while (nb <=10){
          
   System.out.println("----------------------------------------"
               + "-------   CONCESIONARIO DE AUTOS---------------------- ");// 
       System.out.println("----------------------------------------"
               + "-------     MENU PRINCIPAL---------------------- ");
       
       System.out.println("1. seleccionar Automovil");
       
       System.out.println("2. Salir");
        
       
       System.out.println("Ingrese la opcion que desea ejecutar:");
       opcion = scan.nextInt();
        }
    break;      

      case 11:
                        
                        
        }

                 
    
           case 2:
               salir = true;
       }
       
       
       
       }
       }
    
   
    
    }
   
    

