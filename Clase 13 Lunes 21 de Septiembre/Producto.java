/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajoclases;

/**
 *
 * @author pv-alumno
 */
public abstract class Producto {
    String Nombre;
    double precio;
    int cantidad;

    public Producto() {
    }

    public Producto(String Nombre, double precio, int cantidad) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
