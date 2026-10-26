class EmpleadoFijo extends Empleado {
    private double sueldoMensual;
 
    public EmpleadoFijo(String nombre, double sueldoMensual) {
        super(nombre); 
        setSueldoMensual(sueldoMensual);
    }
 
    public double getSueldoMensual() {
        return sueldoMensual;
    }
 
    public void setSueldoMensual(double sueldoMensual) {
        if (sueldoMensual >= 0) {
            this.sueldoMensual = sueldoMensual;
        }
    }

    //Sobreescribimos ell metodo con el metodo Override
    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
 
    @Override
    public String getTipo() {
        return "Empleado fijo";
    }
}