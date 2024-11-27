public class Usuario345 {
    public String nombre;
    public String email;
    public String rol;

    // Constructor




    public Usuario345(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    // Método común


    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Rol: " + rol);
    }
}

