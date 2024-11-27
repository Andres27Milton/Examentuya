
public class Supervisor345 extends Usuario345 {
    // Constructor que llama al constructor de la clase padre

    public Supervisor345(String nombre, String email) {
        super(nombre, email, "Supervisor");
    }

    // Método específico para supervisores
    public void supervisarEmpleado(EmpleadoRegular345 empleado) {
        System.out.println("El supervisor " + this.nombre + " está supervisando a " + empleado.getNombre());
    }
}

