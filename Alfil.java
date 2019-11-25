package ajedrez;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Alfil implements Pieza {
	 public static String directorioDeImagenAlfil = "src/ajedrez/alfil.png"; //se pone la direccion de la imagen 

	    @Override
	    public boolean validaMovimiento(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
	        return Math.abs(origen.getColumna() - destino.getColumna()) ==
	               Math.abs(origen.getFila() - destino.getFila()); //valida las reglas del juego del rey, dice si se puede mover
	    }

	    @Override
	    public ImageIcon obtenerImagen(int ancho, int alto) { //le da las dimensiones a la imagen (la ajusta a los label)
	        //ajustar la imagen a las dimensiones del label
	        return new ImageIcon(new ImageIcon(directorioDeImagenAlfil).getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
	    }
}
