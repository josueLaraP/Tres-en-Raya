
package modelo;
/**
 * La clase Usuario representa un usuario con un nombre y una contraseña.
 * Se utiliza para almacenar y gestionar la información básica de autenticación
 * de un usuario en el sistema.
 */
public class Usuario {
    private String nombre;
    private String contraseña;

    public Usuario() {
    }
   /* Constructor que permite inicializar un usuario con un nombre y una contraseña.
    */
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    /**
     * Obtiene el nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }
    /**
     * Establece la contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
   

