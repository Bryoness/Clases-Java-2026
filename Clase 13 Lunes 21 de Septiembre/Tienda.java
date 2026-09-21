/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajoclases;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author pv-alumno
 */
public class Tienda {
    ArrayList<Producto> productos;
    
    public void agregar(Producto prod){
        this.productos.add(prod);
    }

    public void sacarBoleta(){
    
    }
    
    public void calcularDescuento(double precio, int desc){
        
    }
    
    public void crearProducto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que producto desea crear? 1.- Ropa      2.- Comestible");
        int prod = scan.nextInt();
        
        System.out.println("Ingrese el nombre: ");
        String nombre=scan.next();
        
        System.out.println("Ingrese el precio: ");
        double precio=scan.nextDouble();
        
        System.out.println("Ingrese la cantidad: ");
        int cantidad=scan.nextInt();
        
        if (prod==1){
            System.out.println("Ingrese la talla: ");
            String talla = scan.next();
            ProductoRopa pr= new ProductoRopa(talla, nombre, precio, cantidad); 
            this.agregar(pr);
        }else{
            System.out.println("Ingrese la fecha de vencimiento: ");
            String fecha = scan.next();
            ProductoComestible pc= new ProductoComestible(fecha, nombre, precio, cantidad); 
            this.agregar(pc);
            
        }
        System.out.println("Producto Creado");
        
    }
    public void crearProductoRopa(){
        ProductoRopa prod = new ProductoRopa("L", "Pantalon", 20000, 250);
        System.out.println(prod);
        
    }
    
    public void crearProductoComestible(){
        ProductoComestible prod = new ProductoComestible("31/12/2026", "Doritos", 2500, 200);
        System.out.println(prod);
        
    }
    
    
    public Tienda(ArrayList<Producto> productos) {      //Para crear un array vacío, líneas 35, 36 y 37
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "productos=" + productos + '}';
    }
    
    
}
