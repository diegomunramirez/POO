package ajedrez;

import javax.swing.ImageIcon;

//esta clase se "aclopa" a todas la piezas
public interface Pieza {
    boolean validaMovimiento(PosicionTablero posicionOrigen, PosicionTablero posicionDestino, Pieza[][] tablero); //llama a la funcion en clase Rey para validar los movimientos
    ImageIcon obtenerImagen(int ancho, int alto); //llama la funcion en clase rey para darle la imagen al label
}
