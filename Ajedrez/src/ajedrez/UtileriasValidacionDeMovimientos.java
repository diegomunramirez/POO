package ajedrez;

public class UtileriasValidacionDeMovimientos {
    public boolean estanEnMismaLineaHorizontal(PosicionTablero origen, PosicionTablero destino) {
        return origen.getFila() == destino.getFila();
    }

    public boolean estanEnMismaLineaVertical(PosicionTablero origen, PosicionTablero destino) {
        return origen.getColumna() == destino.getColumna();
    }

    // La suma de las coordenadas debe ser igual
    public boolean estanEnMismaDiagonal(PosicionTablero origen, PosicionTablero destino) {
        return origen.getFila() + origen.getColumna() == destino.getFila() + destino.getColumna();
    }

    // La diferencia entre las coordenadas debe ser igual
    public boolean estanEnMismaDiagonalInvertida(PosicionTablero origen, PosicionTablero destino) {
        return Math.abs(origen.getFila() - origen.getColumna()) == Math.abs(destino.getFila() - destino.getColumna());
    }

    public boolean hayPiezasEnCaminoDeLineaHorizontal(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        int posicionInicial = Math.min(origen.getColumna(), destino.getColumna());
        int posicionFinal = Math.max(origen.getColumna(), destino.getColumna());
        int fila = origen.getFila();

        for (int columna = posicionInicial; columna <= posicionFinal; columna++) {
            if (columna != origen.getColumna() && tablero[columna][fila] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean hayPiezasEnCaminoDeLineaVertical(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        int posicionInicial = Math.min(origen.getFila(), destino.getFila());
        int posicionFinal = Math.max(origen.getFila(), destino.getFila());
        int columna = origen.getColumna();

        for (int fila = posicionInicial; fila <= posicionFinal; fila++) {
            if (fila != origen.getFila() && tablero[columna][fila] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean hayPiezasEnCaminoDiagonal(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        PosicionTablero posicionInicial;
        PosicionTablero posicionFinal;

        if (origen.getFila() < destino.getFila()) {
            posicionInicial = origen;
            posicionFinal = destino;
        } else {
            posicionInicial = destino;
            posicionFinal = origen;
        }

        int columna = posicionInicial.getColumna();

        for (int fila = posicionInicial.getFila(); fila <= posicionFinal.getFila(); fila++, columna--) {
            if (fila != origen.getFila() && tablero[columna][fila] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean hayPiezasEnCaminoDiagonalInvertida(PosicionTablero origen, PosicionTablero destino, Pieza[][] tablero) {
        PosicionTablero posicionInicial;
        PosicionTablero posicionFinal;

        if (origen.getFila() < destino.getFila()) {
            posicionInicial = origen;
            posicionFinal = destino;
        } else {
            posicionInicial = destino;
            posicionFinal = origen;
        }

        int columna = posicionInicial.getColumna();

        for (int fila = posicionInicial.getFila(); fila <= posicionFinal.getFila(); fila++, columna++) {
            if (fila != origen.getFila() && tablero[columna][fila] != null) {
                return true;
            }
        }
        return false;
    }
}
