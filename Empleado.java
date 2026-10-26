class Empleado {
    private String nombre;
 
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        //Es para vaidar que el espacio del nombre no este vacio owo
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }
 
    //Este metodo es el q se sobrescribe en las clases hijas Bv
    public double calcularSueldo() {
        return 0;
    }
 
    public String getTipo() {
        return "Empleado";
    }
 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Sueldo mensual: $" + calcularSueldo());
    }
}