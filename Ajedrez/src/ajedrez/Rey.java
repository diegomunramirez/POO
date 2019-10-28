package ajedrez;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Rey implements Pieza {
    public static String directorioDeImagen = "src/ajedrez/rey_imagen.png";

    @Override
    public boolean validaMovimiento(PosicionTablero origen, PosicionTablero destino) {
        return Math.abs(origen.getColumna() - destino.getColumna()) <= 1 &&
               Math.abs(origen.getFila() - destino.getFila()) <= 1;
    }

    @Override
    public ImageIcon obtenerImagen(int ancho, int alto) {
        //ajustar la imagen a las dimensiones del boton
        return new ImageIcon(new ImageIcon(directorioDeImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    }
}
