public class perro extends mascota {
    String raza;

    public perro() {
    }

    public perro(String raza) {
        this.raza = raza;
    }

    public perro(String raza, int edad, double peso) {
        super(edad, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString()+"perro{" + "raza=" + raza + '}';
    }
    
    @Override
    public void calcularCostoConsulta(){
        int precioBase=15000;
        
        if (getPeso() > 20 ) {
            precioBase+=5000;
    
    System.out.println("El precio de la consulta por perro es: $" + precioBase);
    }
        
    }

}
