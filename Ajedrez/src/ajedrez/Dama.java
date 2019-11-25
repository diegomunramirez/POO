package ajedrez;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Dama implements Pieza {

    UtileriasValidacionDeMovimientos utilerias = new UtileriasValidacionDeMovimientos();

	public static String directorioDeImagenDama = "src/ajedrez/Dama2.png"; //se pone la direccion de la imagen

    @Override
    public boolean validaMovimiento(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        // es un movimiento valido?
        if (origen.getFila() != destino.getFila() &&
            origen.getColumna() != destino.getColumna() &&
            Math.abs(origen.getFila() - destino.getFila()) != Math.abs(origen.getColumna() - destino.getColumna())) {
            return false;
        }

        // Valida que no hay piezas en el camino
        if (utilerias.estanEnMismaLineaHorizontal(origen, destino)) {
            return !utilerias.hayPiezasEnCaminoDeLineaHorizontal(origen, destino, tablero);
        }
        if (utilerias.estanEnMismaLineaVertical(origen, destino)) {
            return !utilerias.hayPiezasEnCaminoDeLineaVertical(origen, destino, tablero);
        }
        if (utilerias.estanEnMismaDiagonal(origen, destino)) {
            return !utilerias.hayPiezasEnCaminoDiagonal(origen, destino, tablero);
        }
        if (utilerias.estanEnMismaDiagonalInvertida(origen, destino)) {
            return !utilerias.hayPiezasEnCaminoDiagonalInvertida(origen, destino, tablero);
        }

        return true;
    }

    @Override
    public ImageIcon obtenerImagen(int ancho, int alto) { //le da las dimensiones a la imagen (la ajusta a los label)
        //ajustar la imagen a las dimensiones del label
        return new ImageIcon(new ImageIcon(directorioDeImagenDama).getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    }
}
