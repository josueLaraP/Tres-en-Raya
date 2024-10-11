
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * La clase Cuadro representa una celda dentro del tablero del juego de tres en raya.
 * Cada cuadro tiene un tamaño, un color de fondo, y puede contener una imagen (Círculo o X)
 * que representa el movimiento de un jugador o una línea ganadora.
 * 
 * Extiende de JPanel para poder dibujar los elementos gráficos del cuadro.
 */
public class Cuadro extends JPanel{
    private int ancho;
    private int altura;
    private Color color;
    private TipoImagen tipoImagen;
    private boolean dibujado;
    private int i;
    private int j;
     /**
     * Constructor de la clase Cuadro.Inicializa un cuadro con las dimensiones y color especificados.El ancho del cuadro.La altura del cuadro. El color de fondo del cuadro.
     * @param ancho
     * @param altura
     * @param color
     */
    public Cuadro(int ancho,int altura,Color color){
        this.ancho=ancho;
        this.altura=altura;
        this.color=color;
        dibujado = false;
        init();
    }
    /**
     * Inicializa los parámetros visuales del cuadro, como su tamaño y color de fondo.
     */
    private void init(){
        setSize(ancho,altura);
        setBackground(color);
    }
    /**
     * Sobreescribe el método paintComponent para dibujar una imagen dentro del cuadro,
     * dependiendo del valor del atributo.Las imágenes corresponden
     * a los movimientos de los jugadores (Círculo o X) o a las líneas ganadoras. El objeto Graphics utilizado para dibujar el contenido del cuadro.
     * @param gg
     */
    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D)gg;
        
        ImageIcon imagen = new ImageIcon();
        if(null!=tipoImagen)
            switch (tipoImagen) {
            case CIRCULO -> imagen=new ImageIcon(getClass().getResource(Ruta.CIRCULO));
            case EQUIS -> imagen=new ImageIcon(getClass().getResource(Ruta.EQUIS));
            case LINEA1 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA1));
            case LINEA2 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA2));
            case LINEA3 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA3));
            case LINEA4 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA4));
            case LINEA5 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA5));
            case LINEA6 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA6));
            case LINEA7 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA7));
            case LINEA8 -> imagen=new ImageIcon(getClass().getResource(Ruta.LINEA8));
            default -> {
            }
        }
        
        g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
    }
     /**
     * Obtiene el índice de fila del cuadro en el tablero.
     *
     * @return  */
    public int getI() {
        return i;
    }
    /**
     * Establece el índice de fila del cuadro en el tablero.
     *
     * @param i */
    public void setI(int i) {
        this.i = i;
    }
    /**
     * Obtiene el índice de columna del cuadro en el tablero.
     * @return 
     */
    public int getJ() {
        return j;
    }
     /**
     * Establece el índice de columna del cuadro en el tablero.
     *
     * @param j */
    public void setJ(int j) {
        this.j = j;
    }
     /**
     * Verifica si el cuadro ya ha sido dibujado.
     * @return 
     */
    public boolean isDibujado() {
        return dibujado;
    }
    /**
     * Establece si el cuadro ha sido dibujado o no.
     *
     * @param dibujado */
    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }
    /**
     * Obtiene el ancho del cuadro.
     *
     * @return  */
    public int getAncho() {
        return ancho;
    }
    /**
     * Establece el ancho del cuadro.
     * @param ancho
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    /**
     * Obtiene la altura del cuadro.
     *
     * @return  */
    public int getAltura() {
        return altura;
    }
     /**
     * Establece la altura del cuadro.
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Obtiene el color de fondo del cuadro.
     * @return 
     */
    public Color getColor() {
        return color;
    }
    /**
     * Establece el color de fondo del cuadro
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }
     /**
     * Obtiene el tipo de imagen que debe mostrarse en el cuadro (Círculo, X, o línea ganadora).
     * @return 
     */
    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }
    /**
     * Establece el tipo de imagen que debe mostrarse en el cuadro.
     * @param tipoImagen
     */
    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
}
