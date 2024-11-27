public class admistrador345 extends Usuario345 {
    // Constructor que llama al constructor de la clase padre
    public admistrador345(String nombre, String email) {
        super(nombre, email, "Administrador");
    }

    // Método específico para administradores
    public void agregarUsuario(Usuario345 usuario) {
        System.out.println("El administrador " + this.nombre + " ha agregado al usuario " + usuario.getNombre());
    }
}










