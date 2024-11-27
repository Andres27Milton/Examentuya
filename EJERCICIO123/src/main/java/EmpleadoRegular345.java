public class EmpleadoRegular345 extends Usuario345 {
    // Constructor que llama al constructor de la clase padre

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
    }
    public EmpleadoRegular345(String nombre, String email) {
        super(nombre, email, "Empleado");
    }
}
