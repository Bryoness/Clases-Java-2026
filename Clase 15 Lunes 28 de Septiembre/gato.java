package com.mycompany.repasoprueba;

/**
 *
 * @author pv-alumno
 */
public class gato extends mascota {
    boolean exterior;

    public gato() {
    }

    public gato(boolean exterior) {
        this.exterior = exterior;
    }

    public gato(boolean exterior, int edad, double peso) {
        super(edad, peso);
        this.exterior = exterior;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }

    @Override
    public String toString() {
        return super.toString()+"gato{" + "exterior=" + exterior + '}';
    }
    
    @Override
    public void calcularCostoConsulta(){
        int precioBase=12000;
        
        if (this.exterior) {
            precioBase+=3000;
    
    System.out.println("El precio de la consulta por gato es: $" + precioBase);
    }
 }
}
