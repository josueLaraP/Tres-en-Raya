
package principal;

import vista.FormInicio;
import vista.Login;
import vista.Registro;
 
/**
 * Clase principal de la aplicación.
 * <p>
 * La clase {@code Principal} contiene el método principal de la aplicación que inicia la interfaz gráfica de usuario.
 * El punto de entrada de la aplicación es el método {@link #main(String[])}.
 * </p>
 */

 public class Principal {
    /**
 * Método principal de la aplicación.
 * <p>
 * Este método es el punto de entrada para la ejecución de la aplicación. Crea una instancia
 * de la ventana de inicio de sesión ({@link Login}) y la hace visible.
 * </p>
 *
 * @param args Los argumentos de la línea de comandos (no se utilizan en esta aplicación).
 */
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
    
}
