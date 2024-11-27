public class main345 {
    public static void main(String[] args) {
        EmpleadoRegular345 empleado = new EmpleadoRegular345("Juan Pérez", "juan@ejemplo.com");
        Supervisor345 supervisor = new Supervisor345("Ana García", "ana@ejemplo.com");
        admistrador345 administrador = new admistrador345("Pedro López", "pedro@ejemplo.com");

        empleado.mostrarDetalles();
        supervisor.mostrarDetalles();
        supervisor.supervisarEmpleado(empleado);
        administrador.mostrarDetalles();
        administrador.agregarUsuario(empleado);

    }
}
