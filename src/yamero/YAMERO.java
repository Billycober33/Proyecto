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
        int opcion, opcion2, opcion3, opcion4 = 0;  // declarar las variables como entero
         String KO = null;
       Scanner enter= new Scanner (System.in); // llamar la libreria Scanner para leer la variable
        boolean salir = false;  // declarar una variable booleen, eso sirve si salir este a 1
        Scanner scan= new Scanner (System.in);
         while (!salir){   // llamar una ciclo while para que se repida las instrucciones
       System.out.println("----------------------------------------"
               + "-------   CONCESIONARIO DE AUTOS---------------------- ");// 
       System.out.println("----------------------------------------"
               + "-------     MENU PRINCIPAL---------------------- ");
       
       System.out.println("1. seleccionar Automovil");
       
       System.out.println("2. Salir");
        
       
       System.out.println("Ingrese la opcion que desea ejecutar:");
       opcion = scan.nextInt(); //llamar la variable opcion para que introduzca un dato
       
       switch (opcion){  // hacer llamado a una introduccion para que cree una serie de casos
           case 1: // son los casos que el cliente va seleccionar 
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
        System.out.println("Deseas agregar amendiades S/N");
           KO = scan.next();
         if ("s".equals(KO)){
          
           System.out.println("Tipos de amenidades");
           System.out.println("1.  Tipo de Transmision"); 
           System.out.println("2.  color de pintura");
           System.out.println("3.   Aros");
           System.out.println("4.   Accesorios exeriores ");
           System.out.println("5.   Accesorios electronicos");
           System.out.println("6.   Regresar a seleccion de gama de vehiculo ");
           
         System.out.println(" Seleccione una amenidad  ");
        opcion3 = scan.nextInt();
         switch (opcion3){
             case 1:
           System.out.println("Has seleccionado tipos de transmicion"); 
           System.out.println("1. manual    Q.  0.00");
           System.out.println("2. CVT        Q. 800.00");
           System.out.println("1. manual con turvo     Q. 0.00");
           System.out.println("1. CVT con turvo Q. 800.00");
           System.out.println(" Seleccione el color del Vehiculo   ");
           
           
         opcion4 = scan.nextInt();
           }
           switch (opcion4){
             case 1 -> {
                 System.out.println(" Has seleccionado la opcion de color de pintura");
                 System.out.println("1.     Cosmic Blue   Q. 0.00");
                 System.out.println("2.    Burgundy Night  Q. 0.00");
                 System.out.println("3.     Rallye Red   Q. 0.00");
                 System.out.println("4.     Crystal Black  Q. 0.00");
                 System.out.println("5.     Modern Stel  Q. 0.00");
                 System.out.println("6.     Taffeta White  Q. 0.00");
                 System.out.println("7.     Energy Green  Q. 0.00");
                 System.out.println("8.     Kona Coffee  Q. 0.00");
                 System.out.println("9.     Orange Fury Q. 0.00");
                 System.out.println("10.    Helios Yellow Q. 0.00");
                 System.out.println("11.    Sony Gray Q. 0.00");
                 System.out.println("11.    Polished MetalQ. 0.00");
               }


               
                
         }
         
         } 
         else {
    System.out.println("gama seleccionada: sedan economico ");      
    System.out.println(" amenidades: ninguna");
    System.out.println(" total; 18940");
         }
     break;
         case 2 :
        System.out.println(" 2- sedan =   Q. 23570.00  ");
        System.out.println("has seleccionado la gama: sedan:");
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
       } 
       else {
    System.out.println("gama seleccionada: sedan  ");      
    System.out.println(" amenidades: ninguna");
    System.out.println(" total; Q. 23570.00");
         }
        break;     
        case 3:
            System.out.println(" 3 -  Deportivo  = Q. 24,100");
         System.out.println("has seleccionado la gama: deportivo :");
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
       } 
       else {
    System.out.println("gama seleccionada: Deportivo ");      
    System.out.println(" amenidades: ninguna");
         System.out.println(" total; Q. 24,100.00");
         } 
         break;
     case 4:
    System.out.println(" 4- Hibrido = Q. 25100.00 ");
    System.out.println(" has seleccionado la gama: hibrido:");
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
       }
       else {
    System.out.println("gama seleccionada: hibrido ");      
    System.out.println(" amenidades: ninguna");
     System.out.println(" total; Q. 25100.00");
         }
  break; 
         case 5:
         System.out.println(" 5-  coupe = Q. 19350.00 ");
         System.out.println("has seleccionado la gama: coupe");
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
       } 
       else {
    System.out.println("gama seleccionada: coupe ");      
    System.out.println(" amenidades: ninguna");
         System.out.println(" total; Q. Q. 19350.00.00");
         }
          break;
     case 6:
       System.out.println(" 6- coupe deportivo= Q. 24100 ");
       System.out.println("has seleccionado la gama: coupe deportivo");
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
       } 
       else {
    System.out.println("gama seleccionada: coupe deportivo ");      
    System.out.println(" amenidades: ninguna");
         System.out.println(" total; Q. Q. 19350.00.00");
         }
           break;
           case 7:
          System.out.println(" 7 - compacto= Q. 16,190.00 ");
       System.out.println("has seleccionado la gama: compacto");
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
       } 
       else {
    System.out.println("gama seleccionada: compacto ");      
    System.out.println(" amenidades: ninguna");
         System.out.println(" total; Q. Q. 16,190.00");
         }
        break;
          case 8 :
         System.out.println(" 8 - Hatchback = Q. 20150.00 ");
          System.out.println("has seleccionado la gama: Hatchback");
         System.out.println("Deseas agregar amendiades S/N");
       KO = scan.next(); // hacer llamar la variable ko para que este lea con el if 
         if ("s".equals(KO)){ // 
           System.out.println("Tipos de amenidades");
           System.out.println("Tipo de Transmision");
           System.out.println("color de pintura");
           System.out.println("Aros");
           System.out.println("Accesorios exeriores ");
           System.out.println("Accesorios electronicos");
           System.out.println("Regresar a seleccion de gama de vehiculo ");
       } 
       else {
    System.out.println("gama seleccionada: Hatchback ");      
    System.out.println(" amenidades: ninguna");
         System.out.println(" total; Q. Q. 20150.00");
         }
           break;
           case 9:
        System.out.println(" 9 - Economico version =Q34,700 ");
        System.out.println("has seleccionado la gama: Economico version");
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
           System.out.println("Regresar a seleccion de gama de vehiculo ");
      } 
       else {
    System.out.println("gama seleccionada: Economico Version Rally ");      
    System.out.println(" amenidades: ninguna");
    System.out.println(" total; Q. Q. 34,700.00");   
    System.out.println(" Presione Enter para continuar");    
    enter.nextLine();
         }
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
                   
        }
           case 2:
               salir = true;
    }   
    }
    }
    }
   
    

