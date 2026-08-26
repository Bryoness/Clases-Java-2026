/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author pv-alumno
 */
public class Tienda {
    static Scanner scan =new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        menuPro();


        ArrayList<String>   frutas = new ArrayList<>();
        frutas.add("pera");
        frutas.add("uva");
        frutas.add("mora");
        System.out.println(frutas);
        System.out.println(frutas.size());              //Largo del array
        System.out.println(frutas.get(1));         //Obtengo el valor a través del índice
        System.out.println(frutas.indexOf("pera"));   //Obtengo el índice de ese valor
        System.out.println(frutas.isEmpty());           //Verifica si está vacío
        frutas.clear();                                   //Eliminar la lista
        System.out.println("La lista está vacia: "+frutas);
    
        
Arrays();        
    }
    public static void menuPro(){
        Producto p1=new Producto("Kapo", 100, 20);
        Producto p2=new Producto("Sandia", 5000, 30);
        Producto p3=new Producto("Chocapic", 4000, 25);
        float total=0;
        int op=0;
        while(op!=3){
            
        
        System.out.println("Que desea hacer?");
        System.out.println("1.- Mostrar productos");
        System.out.println("2.- Mostrar total");
        System.out.println("3.- Salir");
        op=scan.nextInt();
        switch(op){
            case 1:     
                        int opc=0;
                        while(opc!=4){
                                
                        System.out.println("Que Producto comprará");
                        System.out.println("1.-"+p1);
                        System.out.println("2.-"+p2);
                        System.out.println("3.-"+p3);
                        System.out.println("4.- Salir");
                        opc=scan.nextInt();
                        switch(opc){
                           case 1: 
                               System.out.println("Usted ha comprado "+p1.getNombre());
                               total=total+p1.getPrecio();
                               p1.setCant(p1.getCant()-1); 
                               break;
                           case 2: 
                               System.out.println("Usted ha comprado "+p2.getNombre());
                               break;
                           case 3: 
                               System.out.println("Usted ha comprado "+p3.getNombre());
                               break;
                           default:
                               System.out.println("Opcion invalida");
                               break;
                            }
                        }
                    
                break;
            case 2:
                System.out.println("El total a pagar es: " +(total*1.19));
                break;
            case 3:
                
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
        }
        
        
    }
    
    
    
public static void tablaMultiplicar(){
    for (int i = 1; i <=3; i++) {       //i++ significa i+1      
        System.out.println("Punisher "+i);

    }
    }

public static void tablaNum() {
//Pedir un numero al usuario
//Y mostar esa tabla de multiplicar
    int total = 0;
    System.out.println("Ingresa el numero: ");
    int num=scan.nextInt();
    for (int i = 1; i <= num; i++){
        System.out.println("Ingresa el numero: "+i);
        int nume=scan.nextInt();
        total=total+nume;
    }
    System.out.println("El total de ls numeros es: "+total);
}


public static void promedio() {
//Pedir cantidad de notas
//pedir cada nota individualmente
//mostrar el promedio de notas
//mostrar si aprueba o no.
        double total = 0;
        System.out.println("Ingresa la cantidad de notas: ");
        int cantNotas=scan.nextInt();
        for (int i = 1; i <= cantNotas; i++){
            System.out.println("Ingresa la nota: "+i);
            double nota=scan.nextDouble();
            total=total+nota;
    }
        double prom=total/cantNotas;
        System.out.println("Su promedio es : " + prom);
    if (prom >=4 ) {
        System.out.println("Has aprobado.");
    } else {
        System.out.println("Has reprobado.");
    }
    }    


public static void Arrays(){
//Arrays
//1. Agregar elemento
//2. Mostrar lista
//3. Eliminar elemento
//4. Vaciar Lista
//5. Salir

ArrayList<String>   nombres = new ArrayList<>();
nombres.add("Pedro");
nombres.add("Juan");
nombres.add("Pablo");
nombres.add("Santiago");
nombres.add("Felipe");

        while (true)    {
            System.out.println("1. Agregar Entidad");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Eliminar Elemento");
            System.out.println("4. Vaciar Lista");
            System.out.println("5. Salir");
            int op = scan.nextInt();
            
            if (op==5){
                System.out.println("Saliendo");
                break;
            }
                switch (op){
                    case 1:
                        System.out.println("Ha elegido: Agregar Entidad");
                        String agregar = scan.next();
                        nombres.add(agregar);
                        break;
                    case 2:
                        System.out.println("Ha elegido: Mostrar lista");
                        if (nombres.isEmpty()){
                            System.out.println("Lista vacía.");
                        } else {
                        System.out.println(nombres);
                        }
                        break;
                    case 3:
                        System.out.println("Ha elegido: Eliminar elemento");
                        System.out.println("Los disponibles para eliminar son: ");
                        System.out.println(nombres);
                        System.out.println("¿Cual va a eliminar?");
                        int eliminar = scan.nextInt();
                        nombres.remove(eliminar);
                        break;
                    case 4:
                        System.out.println("Ha elegido: Vaciar la lista");
                        nombres.clear();
                        break;

                    default:
                        System.out.println("Elección Invalida.");
                    
                }
        }
}


}
