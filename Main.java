import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creamos un ArrayList que pueda guardar tanto empleados fijos como empleados por horas jeje
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new EmpleadoFijo("Rafa Islas", 15000));
        listaEmpleados.add(new EmpleadoPorHoras("Chema Cadeza", 76, 85.5));
        listaEmpleados.add(new EmpleadoFijo("Brandon Tiscañero", 18500));
        listaEmpleados.add(new EmpleadoPorHoras("Ailton Gaytan", 67, 80.2));

        //Con el for, recorremos la lista para que muestre el metodo uwu
        for (Empleado empleado : listaEmpleados) {
            empleado.mostrarInformacion();
        }
    }
}