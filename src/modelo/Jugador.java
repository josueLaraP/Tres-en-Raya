
package modelo;
/**
 * La clase Jugador representa a un jugador en el juego de tres en raya.
 * Cada jugador tiene un nombre, un tipo de imagen que lo representa (X o O) y 
 * un tablero que guarda las jugadas que ha realizado.
 * @version 1.0
 * @since 2024
 */
public final class Jugador {
    private String nombre;
    private TipoImagen tipoImagen;
    private int tablero[][];
    /**
     * Constructor por defecto que inicializa el tablero del jugador a una matriz vacía de 3x3
     */
    public Jugador(){
        tablero = new int[3][3];
        limpiar();
    }
    /**
     * Constructor que inicializa el jugador con un tipo de imagen específico (X o O).
     * @param tipoImagen
     */
    public Jugador(TipoImagen tipoImagen){
        this.tipoImagen = tipoImagen;
        tablero = new int[3][3];
        limpiar();
    }
    /*Constructor que inicializa al jugador con un nombre y un tipo de imagen.
     * @param nombre El nombre del jugador.
     * @param tipoImagen El tipo de imagen (X o O) que representa al jugador.
    */
    public Jugador(String nombre,TipoImagen tipoImagen){
        this.nombre = nombre;
        this.tipoImagen = tipoImagen;
          tablero = new int[3][3];
          limpiar();
    }
    
    /**
     * Limpia el tablero del jugador, estableciendo todas las posiciones a 0.
     */
    public void limpiar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=0;
            }
        }
    }
    /**
     * Verifica si el jugador ha hecho un "tres en raya" en alguna de las líneas 
     * del tablero, y devuelve el tipo de imagen que representa esa línea.También verifica si se ha producido un empate.
     * @param jugadorRival
     * @return El tipo de línea formada (horizontal, vertical o diagonal) o 
     *         EMPATE si ningún jugador ha ganado pero el tablero está lleno. 
     *         Devuelve {@code null} si el juego aún no ha terminado.
     */
    public TipoImagen tresEnRaya(Jugador jugadorRival){
        if(tablero[0][0]==1&&tablero[0][1]==1&&tablero[0][2]==1) return TipoImagen.LINEA1;
        if(tablero[1][0]==1&&tablero[1][1]==1&&tablero[1][2]==1) return TipoImagen.LINEA2;
        if(tablero[2][0]==1&&tablero[2][1]==1&&tablero[2][2]==1) return TipoImagen.LINEA3;
        if(tablero[0][0]==1&&tablero[1][0]==1&&tablero[2][0]==1) return TipoImagen.LINEA4;
        if(tablero[0][1]==1&&tablero[1][1]==1&&tablero[2][1]==1) return TipoImagen.LINEA5;
        if(tablero[0][2]==1&&tablero[1][2]==1&&tablero[2][2]==1) return TipoImagen.LINEA6;
        if(tablero[2][0]==1&&tablero[1][1]==1&&tablero[0][2]==1) return TipoImagen.LINEA7;
        if(tablero[0][0]==1&&tablero[1][1]==1&&tablero[2][2]==1) return TipoImagen.LINEA8;
        // Comprobar si hay empate (todos los espacios llenos)
        int contador=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tablero[i][j]==1) contador++;
                if(jugadorRival.getTablero()[i][j]==1) contador++;
            }
        }
        
        if(contador==9) return TipoImagen.EMPATE;
        
        return null;
    }
    /**
     * Obtiene el tablero actual del jugador.
     * @return 
     */
    public int[][] getTablero() {
        return tablero;
    }
    /**
     * Establece el tablero del jugador.Una matriz de enteros de 3x3 que representa el nuevo estado del tablero.
     * @param tablero
     */
    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    /**
     * Obtiene el nombre del jugador.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del jugador.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el tipo de imagen que representa al jugador (X o O).
     * @return 
     */
    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }
    /**
     * Establece el tipo de imagen que representa al jugador (X o O).
     * @param tipoImagen
     */
    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
}
