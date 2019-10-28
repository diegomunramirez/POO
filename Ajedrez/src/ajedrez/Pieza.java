package ajedrez;

import javax.swing.ImageIcon;

public interface Pieza {
    boolean validaMovimiento(PosicionTablero posicionOrigen, PosicionTablero posicionDestino);
    ImageIcon obtenerImagen(int ancho, int alto);
}
