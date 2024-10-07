
package principal;

import vista.FormInicio;
import vista.Login;
import vista.Registro;
 
/**Esta clase inicia con el Login del programa
 * craendo un Formulario Login
 * @author josue lara
 */

 public class Principal {
    
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
    
}
