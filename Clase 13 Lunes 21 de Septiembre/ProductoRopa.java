/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajoclases;

/**
 *
 * @author pv-alumno
 */
public class ProductoRopa extends Producto implements SII {
    String talla;

    public ProductoRopa() {
    }

    public ProductoRopa(String Talla) {
        this.talla = Talla;
    }

    public ProductoRopa(String Talla, String Nombre, double precio, int cantidad) {
        super(Nombre, precio, cantidad);
        this.talla = Talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String Talla) {
        this.talla = Talla;
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoRopa{" + "Talla=" + talla + '}';
    }
    
    
    
}
