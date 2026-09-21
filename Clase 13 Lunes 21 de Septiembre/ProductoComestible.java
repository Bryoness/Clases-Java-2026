/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajoclases;

/**
 *
 * @author pv-alumno
 */
public class ProductoComestible extends Producto implements SII {
    String fechaCaducidad;

    public ProductoComestible() {
    }

    public ProductoComestible(String FechaCaducidad) {
        this.fechaCaducidad = FechaCaducidad;
    }

    public ProductoComestible(String FechaCaducidad, String Nombre, double precio, int cantidad) {
        super(Nombre, precio, cantidad);
        this.fechaCaducidad = FechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String FechaCaducidad) {
        this.fechaCaducidad = FechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoComestible{" + "FechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
}
