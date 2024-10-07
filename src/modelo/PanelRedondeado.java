
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
/**
 * La clase PanelRedondeado extiende de JPanel y permite dibujar un panel con bordes redondeados.
 * Los arcos que definen las esquinas del panel se pueden personalizar mediante los atributos arcoAncho y arcoAltura.
 * Además, el color del borde también es configurable.
 */
public class PanelRedondeado extends JPanel{
    private double arcoAncho = 50;
    private double arcoAltura = 50;
    private Color colorBorde = new Color(165,40,174);
     /**
     * Sobreescribe el método paintComponent para dibujar un panel con esquinas redondeadas.
     * El panel se rellena con el color de fondo establecido y se dibuja un borde con el color especificado.
     *El objeto Graphics utilizado para renderizar el contenido del panel.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RoundRectangle2D.Double formaRedondeada = new RoundRectangle2D.Double(
                0,0,this.getWidth()-1 ,this.getHeight()-1 ,arcoAncho,arcoAltura
        );
        
        g2.setColor(this.getBackground());
        g2.fill(formaRedondeada);
        g2.setColor(colorBorde);
        g2.draw(formaRedondeada);
        g2.dispose();
    }
    
    
}
