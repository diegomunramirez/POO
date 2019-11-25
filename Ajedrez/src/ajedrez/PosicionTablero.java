package ajedrez;

public class PosicionTablero {
    private int fila;
    private int columna;

    public PosicionTablero(int x, int y) {
        this.fila = y;
        this.columna = x;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
