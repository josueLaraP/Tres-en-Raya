
package modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * La clase Imagen extiende de JLabel y permite mostrar imágenes en una etiqueta.
 * La imagen se carga desde una ruta especificada y se ajusta al tamaño del componente.
 */
public class Imagen extends JLabel{
    private String ruta = "";
 /**
     * Sobreescribe el método {@code paintComponent} para dibujar una imagen
     * en la etiqueta, utilizando una ruta especificada.El objeto utilizado para renderizar la imagen.
     * @param gg
     */
    @Override
    protected void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D)gg;
        URL rutaAbsoluta =  getClass().getResource(ruta);
        
        if(rutaAbsoluta!=null){
            ImageIcon imagen = new ImageIcon(rutaAbsoluta);
            g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
        }
        g.dispose();
    }

    /** Obtiene la ruta actual de la imagen que se debe mostrar en la etiqueta.
     * @return 
    */
    public String getRuta() {
        return ruta;
    }
    /** Establece la ruta de la imagen que debe mostrarse en la etiqueta.
     * @param ruta
    */ 
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
