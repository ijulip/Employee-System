class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;
 
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        setHorasTrabajadas(horasTrabajadas);
        setTarifaPorHora(tarifaPorHora);
    }
 
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
 
    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas >= 0) {
            this.horasTrabajadas = horasTrabajadas;
        }
    }
 
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
 
    public void setTarifaPorHora(double tarifaPorHora) {
        if (tarifaPorHora >= 0) {
            this.tarifaPorHora = tarifaPorHora;
        }
    }


    //Sobreescribimos el metodo con el polimorfismo pa q calculo las horas por su tarifa, y ya
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
 
    @Override
    public String getTipo() {
        return "Empleado por horas";
    }
}