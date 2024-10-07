
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
     * Constructor de la clase Cuadro. Inicializa un cuadro con las dimensiones y color especificados. 
     * El ancho del cuadro.
     * La altura del cuadro.
     * El color de fondo del cuadro.
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
     * dependiendo del valor del atributo. Las imágenes corresponden
     * a los movimientos de los jugadores (Círculo o X) o a las líneas ganadoras.
     * El objeto Graphics utilizado para dibujar el contenido del cuadro.
     */
    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D)gg;
        
        ImageIcon imagen = new ImageIcon();
        if(tipoImagen==TipoImagen.CIRCULO)
            imagen=new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if(tipoImagen==TipoImagen.EQUIS)
            imagen=new ImageIcon(getClass().getResource(Ruta.EQUIS));
        else if(tipoImagen==TipoImagen.LINEA1)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA1));
        else if(tipoImagen==TipoImagen.LINEA2)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA2));
        else if(tipoImagen==TipoImagen.LINEA3)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA3));
        else if(tipoImagen==TipoImagen.LINEA4)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA4));
        else if(tipoImagen==TipoImagen.LINEA5)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA5));
        else if(tipoImagen==TipoImagen.LINEA6)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA6));
        else if(tipoImagen==TipoImagen.LINEA7)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA7));
        else if(tipoImagen==TipoImagen.LINEA8)
            imagen=new ImageIcon(getClass().getResource(Ruta.LINEA8));
        
        g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
    }
     /**
     * Obtiene el índice de fila del cuadro en el tablero.
     * */
    public int getI() {
        return i;
    }
    /**
     * Establece el índice de fila del cuadro en el tablero.
     * */
    public void setI(int i) {
        this.i = i;
    }
    /**
     * Obtiene el índice de columna del cuadro en el tablero.
     */
    public int getJ() {
        return j;
    }
     /**
     * Establece el índice de columna del cuadro en el tablero.
     * */
    public void setJ(int j) {
        this.j = j;
    }
     /**
     * Verifica si el cuadro ya ha sido dibujado.
     */
    public boolean isDibujado() {
        return dibujado;
    }
    /**
     * Establece si el cuadro ha sido dibujado o no.
     * */
    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }
    /**
     * Obtiene el ancho del cuadro.
     * */
    public int getAncho() {
        return ancho;
    }
    /**
     * Establece el ancho del cuadro.
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    /**
     * Obtiene la altura del cuadro.
     * */
    public int getAltura() {
        return altura;
    }
     /**
     * Establece la altura del cuadro.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Obtiene el color de fondo del cuadro.
     */
    public Color getColor() {
        return color;
    }
    /**
     * Establece el color de fondo del cuadro
     */
    public void setColor(Color color) {
        this.color = color;
    }
     /**
     * Obtiene el tipo de imagen que debe mostrarse en el cuadro (Círculo, X, o línea ganadora).
     */
    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }
    /**
     * Establece el tipo de imagen que debe mostrarse en el cuadro.
     */
    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
}
