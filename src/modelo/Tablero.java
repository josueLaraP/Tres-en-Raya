
package modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;
import vista.FormResultado;
import vista.FormTikTacToe;
/**
 * La clase Tablero representa el área de juego donde se visualizan los cuadros y los jugadores
 * interactúan. Se encarga de inicializar el tablero, gestionar el estado de los jugadores, 
 * y pintar el tablero con colores definidos. El tablero maneja una lista de cuadros que 
 * forman la estructura del área de juego, así como el jugador actual y el turno de la partida.
 *
 * Características principales:
 * - Establece las dimensiones y colores de las celdas y el tablero.
 * - Administra los jugadores y su turno en la partida.
 * - Almacena una lista de cuadros que componen el tablero.
 *
 * Esta clase extiende de JPanel para poder dibujar los componentes gráficos del tablero.
 */
public class Tablero extends JPanel{
    private int anchoCI;
    private int alturaCI;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    private TipoImagen jugadorActual;
    private TipoImagen turnoPartida;
    
    private Jugador jugador1;
    private Jugador jugador2;
    
    private ArrayList<Cuadro> cuadros;
    private Cuadro cuadroFrontal;
    /**
     * Constructor de la clase Tablero. Inicializa los valores y jugadores.
     */
    public Tablero(){
        init();
    }
     /**
     * Método init que inicializa los valores por defecto del tablero y los jugadores.
     */
    private void init(){
        anchoCI=80;
        alturaCI=80;
        colorCI=Color.BLUE;
        colorTablero =Color.RED;
        margen=6;
        jugador1 = new Jugador();
        jugador2 = new Jugador();
        cuadros = new ArrayList();
        jugadorActual = TipoImagen.EQUIS;
        turnoPartida = TipoImagen.EQUIS;
    }
    /**
     * Crea el tablero de juego, configurando su tamaño, diseño y cuadros.
     */
    public void crearTablero(){
        setLayout(null);
        setSize(anchoCI*3+margen*4,alturaCI*3+margen*4);
        setBackground(colorTablero);
        cuadroFrontal = new Cuadro(this.getWidth(),this.getHeight(),Color.RED);
        cuadroFrontal.setLocation(0,0);
        cuadroFrontal.setOpaque(false);
        cuadroFrontal.setEnabled(false);
        add(cuadroFrontal);
        crearCuadrosInternos();
        
    }
     /**
     * Crea los cuadros internos (las casillas) del tablero y les asigna eventos.
     */
    private void crearCuadrosInternos(){
        int x = margen;
        int y = margen;
        
        for (int i = 0; i < 3; i++) {
            x=margen;
            for (int j = 0; j < 3; j++) {
                Cuadro cuadro =new Cuadro(anchoCI,alturaCI,colorCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x,y);
                cuadro.setI(i);
                cuadro.setJ(j);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadro(cuadro);
                
                x+=(anchoCI+margen);
            }
            y+=(alturaCI+margen);
        }
    }
      /**
     * Crea los eventos para los cuadros, como los clics para marcar una casilla.
     *cuadro Cuadro al cual se le asignan los eventos.
     */
    public void crearEventosCuadro(Cuadro cuadro){
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            @Override
            public void mousePressed(MouseEvent e) {
                
                if(cuadro.isDibujado()) return;
                
                TipoImagen tipoImagenResultado = null;
                if(jugadorActual==TipoImagen.EQUIS){
                    cuadro.setTipoImagen(TipoImagen.EQUIS);
                    jugador1.getTablero()[cuadro.getI()][cuadro.getJ()]=1;
                    tipoImagenResultado = jugador1.tresEnRaya(jugador2);
                    resultado(tipoImagenResultado,TipoImagen.EQUIS);
                    jugadorActual=TipoImagen.CIRCULO;
                    cambiarEstilos(TipoImagen.CIRCULO);
                    
                }else if(jugadorActual==TipoImagen.CIRCULO){
                    cuadro.setTipoImagen(TipoImagen.CIRCULO);
                    jugador2.getTablero()[cuadro.getI()][cuadro.getJ()]=1;
                    tipoImagenResultado= jugador2.tresEnRaya(jugador1);
                    resultado(tipoImagenResultado,TipoImagen.CIRCULO);
                    jugadorActual=TipoImagen.EQUIS;
                    cambiarEstilos(TipoImagen.EQUIS);
                }
                
                cuadro.setDibujado(true);
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                
            }
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        cuadro.addMouseListener(evento);
        
    }
    /**
     * Cambia los estilos visuales según el jugador actual.
     *jugadorAct El jugador actual (EQUIS o CIRCULO).
     */
    public void cambiarEstilos(TipoImagen jugadorAct){
        if(jugadorAct==TipoImagen.CIRCULO){
            FormTikTacToe.imgJugadorEquis.setRuta(Ruta.JUGADORAUXILLAR);
            FormTikTacToe.imgJugadorEquis.repaint();
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(240,240,240,100));
            
            FormTikTacToe.imgJugadorCirculo.setRuta(Ruta.JUGADORCIRCULO);
            FormTikTacToe.imgJugadorCirculo.repaint();
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(255,200,255));
        }else if(jugadorAct==TipoImagen.EQUIS){
            FormTikTacToe.imgJugadorCirculo.setRuta(Ruta.JUGADORAUXILLAR);
            FormTikTacToe.imgJugadorCirculo.repaint();
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(240,240,240,100));
            
            FormTikTacToe.imgJugadorEquis.setRuta(Ruta.JUGADOREQUIS);
            FormTikTacToe.imgJugadorEquis.repaint();
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(180,232,255));
        }
    }
    /**
     * Muestra el resultado del juego (ganador o empate) y maneja el final de la partida.
     * tipoImagenResultado El resultado del juego (EMPATE o imagen del ganador).
     * jugadorGanador El jugador ganador.
     */
    public void resultado(TipoImagen tipoImagenResultado,TipoImagen jugadorGanador){
          
          if(tipoImagenResultado==TipoImagen.EMPATE){
               
              
              Tablero tablero = this;
              Timer timer = new Timer();
              TimerTask tarea = new TimerTask() {
                  @Override
                  public void run() {
                    FormResultado formResultado = new FormResultado(TipoImagen.EMPATE,tablero);
                    formResultado.setVisible(true);
                  }
              };
              timer.schedule(tarea,800);
          }
          else if(tipoImagenResultado!=null) {
              Ruta.cambiarRutas(jugadorGanador);
              cuadroFrontal.setTipoImagen(tipoImagenResultado);
              desactivarCuadros(true);
             
              Tablero tablero = this;
              Timer timer = new Timer();
              TimerTask tarea = new TimerTask() {
                  @Override
                  public void run() {
                      FormResultado formResultado = new FormResultado(jugadorGanador,tablero);
                       formResultado.setVisible(true);
                  }
              };
              timer.schedule(tarea,800);
          }
    }
     /**
     * Reinicia el tablero para una nueva partida, actualizando puntajes y el turno.
     * ganador El jugador ganador de la partida actual.
     */
    public void reiniciarTablero(TipoImagen ganador){
        desactivarCuadros(false);
        borrarImagenes();
        cuadroFrontal.setTipoImagen(null);
        if(ganador==TipoImagen.EQUIS){
            int puntajeNuevo= Integer.parseInt(FormTikTacToe.puntajeEquis.getText())+1;
            FormTikTacToe.puntajeEquis.setText(String.valueOf(puntajeNuevo));
        }
        else if(ganador==TipoImagen.CIRCULO){
             int puntajeNuevo= Integer.parseInt(FormTikTacToe.puntajeCirculo.getText())+1;
            FormTikTacToe.puntajeCirculo.setText(String.valueOf(puntajeNuevo));
        }
        
        if(turnoPartida==TipoImagen.EQUIS){
            jugadorActual = TipoImagen.CIRCULO;
            turnoPartida = TipoImagen.CIRCULO;
        }
        else if(turnoPartida==TipoImagen.CIRCULO){
            jugadorActual = TipoImagen.EQUIS;
            turnoPartida = TipoImagen.EQUIS;
        }
        cambiarEstilos(jugadorActual);
        jugador1.limpiar();
        jugador2.limpiar();
        repaint();
            
    }
    /**
     * Desactiva o activa los cuadros, dependiendo del valor booleano.
     */
    public void desactivarCuadros(boolean valor){
        for(Cuadro cuadro : cuadros){
            cuadro.setDibujado(valor);
        }
    }
    public void borrarImagenes(){
        for(Cuadro cuadro : cuadros){
            cuadro.setTipoImagen(null);
        }
    }

    public TipoImagen getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(TipoImagen jugadorActual) {
        this.jugadorActual = jugadorActual;
    }
    
    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    
}
