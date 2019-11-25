package ajedrez;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Rey implements Pieza {
    public static String directorioDeImagen = "src/ajedrez/rey_imagen.png"; //se pone la direccion de la imagen 

    @Override
    public boolean validaMovimiento(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        return Math.abs(origen.getColumna() - destino.getColumna()) <= 1 &&
               Math.abs(origen.getFila() - destino.getFila()) <= 1; //valida las reglas del juego del rey, dice si se puede mover
    }

    @Override
    public ImageIcon obtenerImagen(int ancho, int alto) { //le da las dimensiones a la imagen (la ajusta a los label)
        //ajustar la imagen a las dimensiones del label
        return new ImageIcon(new ImageIcon(directorioDeImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    }
}
