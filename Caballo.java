package ajedrez;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Caballo implements Pieza {

    public static String directorioDeImagenCaballo = "src/ajedrez/caballo.png"; //se pone la direccion de la imagen 

    @Override
    public boolean validaMovimiento(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        return (origen.getColumna() - destino.getColumna()) * (origen.getColumna() - destino.getColumna()) + 
        		(origen.getFila() - destino.getFila()) * (origen.getFila() - destino.getFila()) == 5;
    }

    @Override
    public ImageIcon obtenerImagen(int ancho, int alto) { //le da las dimensiones a la imagen (la ajusta a los label)
        //ajustar la imagen a las dimensiones del label
        return new ImageIcon(new ImageIcon(directorioDeImagenCaballo).getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    }
	
	
}
