package com.mycompany.repasoprueba;

/**
 *
 * @author pv-alumno
 */
public abstract class mascota {
    int edad;
    double peso;

    public mascota() {
    }

    public mascota(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "mascota{" + "edad=" + edad + ", peso=" + peso + '}';
    }
    
    public abstract void calcularCostoConsulta();
        
        
    
}
