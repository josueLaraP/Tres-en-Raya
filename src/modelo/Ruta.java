
package modelo;
/**
 * La clase Ruta proporciona las rutas de acceso a los recursos gráficos utilizados en el juego,
 * como imágenes de los jugadores (equis y círculo) y las diferentes líneas para indicar un tres en raya.
 * Esta clase también permite cambiar dinámicamente las rutas de las líneas en función del jugador actual.
 */
public class Ruta {
    /**
     * Ruta de la imagen que representa la figura "Equis" (X).
     */
    public static final String EQUIS = "/resources/Equis.png";
    /**
     * Ruta de la imagen que representa la figura "Círculo" (O).
     */
    public static final String CIRCULO = "/resources/Circulo.png";
    /**
     * Ruta de la imagen que representa al jugador con la figura "Equis" (X).
     */
    public static final String JUGADOREQUIS = "/resources/JugadorEquis.png";
   /**
     * Ruta de la imagen que representa al jugador con la figura "Círculo" (O).
     */
    public static final String JUGADORCIRCULO = "/resources/JugadorCirculo.png";
   /**
     * Ruta de la imagen que representa un jugador auxiliar.
     */
    public static final String JUGADORAUXILLAR = "/resources/JugadorAuxillar.png";
    /**
     * Ruta de la imagen de la línea 1 que indica una combinación ganadora con círculos.
     */
    public static String LINEA1 = "/resources/CirculoLinea1.png";
    /**
     * Ruta de la imagen de la línea 2 que indica una combinación ganadora con círculos.
     */
    public static String LINEA2 = "/resources/CirculoLinea2.png";
     /**
     * Ruta de la imagen de la línea 3 que indica una combinación ganadora con círculos.
     */
    public static String LINEA3 = "/resources/CirculoLinea3.png";
    /**
     * Ruta de la imagen de la línea 4 que indica una combinación ganadora con círculos.
     */
    public static String LINEA4 = "/resources/CirculoLinea4.png";
    /**
     * Ruta de la imagen de la línea 5 que indica una combinación ganadora con círculos.
     */
    public static String LINEA5 = "/resources/CirculoLinea5.png";
    /**
     * Ruta de la imagen de la línea 6 que indica una combinación ganadora con círculos.
     */
    public static String LINEA6 = "/resources/CirculoLinea6.png";
    /**
     * Ruta de la imagen de la línea 7 que indica una combinación ganadora con círculos.
     */
   
   public static String LINEA7 = "/resources/CirculoLinea7.png";
    /**
     * Ruta de la imagen de la línea 8 que indica una combinación ganadora con círculos.
     */
   public static String LINEA8 = "/resources/CirculoLinea8.png";
     /**
     * Cambia las rutas de las líneas del tres en raya dependiendo del tipo de jugador
     * (círculo o equis). Esto permite que las imágenes de las líneas sean personalizadas
     * para cada símbolo según el jugador que esté jugando.
     * El tipo de imagen (CÍRCULO o EQUIS) que determina las rutas de las líneas.
     */
    public static void cambiarRutas(TipoImagen tipoImagen){
        if(tipoImagen==TipoImagen.CIRCULO){
           LINEA1 = "/resources/CirculoLinea1.png";
           LINEA2 = "/resources/CirculoLinea2.png";
           LINEA3 = "/resources/CirculoLinea3.png";
           LINEA4 = "/resources/CirculoLinea4.png";
           LINEA5 = "/resources/CirculoLinea5.png";
           LINEA6 = "/resources/CirculoLinea6.png";
           LINEA7 = "/resources/CirculoLinea7.png";
           LINEA8 = "/resources/CirculoLinea8.png";
        }
        else if(tipoImagen==TipoImagen.EQUIS){
            LINEA1 = "/resources/EquisLinea1.png";
           LINEA2 = "/resources/EquisLinea2.png";
           LINEA3 = "/resources/EquisLinea3.png";
           LINEA4 = "/resources/EquisLinea4.png";
           LINEA5 = "/resources/EquisLinea5.png";
           LINEA6 = "/resources/EquisLinea6.png";
           LINEA7 = "/resources/EquisLinea7.png";
           LINEA8 = "/resources/EquisLinea8.png";
        }
    }
}
