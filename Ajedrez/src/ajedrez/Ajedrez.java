package ajedrez;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ajedrez {

    private static int ANCHO_CELDA = 50;
    private static int ALTO_CELDA = 50;
    private static int NUM_FILAS = 8;
    private static int NUM_COLUMNAS = 8;

    private JFrame frame;
    private MouseListenerInternal mouseListener;
    private Pieza[][] tablero;
    private JLabel[][] tableroDeEtiquetas;
    private Border borde;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Ajedrez window = new Ajedrez();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public Ajedrez() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        mouseListener = new MouseListenerInternal();
        frame = new JFrame();
        tableroDeEtiquetas = creaTableroDeEtiquetas();
        tablero = creaTablero();
        borde = BorderFactory.createLineBorder(Color.GREEN, 3);

        // Pon el rey en la última fila en la columna 4
        ponerPieza(NUM_COLUMNAS / 2 - 1, NUM_FILAS - 1, new Rey());

        frame.setBackground(new Color(240, 240, 240));
        frame.setBounds(100,
                        100,
                        NUM_COLUMNAS * ANCHO_CELDA,
                        NUM_FILAS * ALTO_CELDA);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
    }

    private Pieza[][] creaTablero() {
        Pieza[][] tablero = new Pieza[NUM_COLUMNAS][NUM_FILAS];
        return tablero;
    }

    private void limpiarCelda(int columna, int fila) {
        tablero[columna][fila] = null;
        tableroDeEtiquetas[columna][fila].setIcon(null);
    }

    private void ponerPieza(int columna, int fila, Pieza pieza) {
        tablero[columna][fila] = pieza;
        tableroDeEtiquetas[columna][fila].setIcon(pieza.obtenerImagen(ANCHO_CELDA, ALTO_CELDA));
    }

    private JLabel[][] creaTableroDeEtiquetas() {
        JLabel[][] tableroDeLabels = new JLabel[NUM_FILAS][NUM_COLUMNAS];

        for (int fila = 0; fila < NUM_FILAS; fila++) {
            boolean colorCelda;

            if (fila % 2 == 0) {
                colorCelda = true; // color negro
            } else {
                colorCelda = false; // color blanco
            }

            for (int col = 0; col < NUM_COLUMNAS; col++) {
                tableroDeLabels[col][fila] = creaCelda(col * ANCHO_CELDA, fila * ALTO_CELDA, colorCelda);
                colorCelda = !colorCelda;
            }
        }

        return tableroDeLabels;
    }

    private JLabel creaCelda(int coordenadaX, int coordenadaY, boolean esColorNegro) {
        JLabel label = new JLabel("");
        label.setOpaque(true);
        label.setBounds(coordenadaX, coordenadaY, ANCHO_CELDA, ALTO_CELDA);
        if (esColorNegro == true) {
            label.setBackground(Color.BLACK);
        } else {
            label.setBackground(Color.WHITE);
        }
        label.addMouseListener(mouseListener);

        frame.getContentPane().add(label);
        return label;
    }

    private PosicionTablero tranformaCoordenadas(double x, double y) {
        int posicionTableroX = (int)x / ANCHO_CELDA;
        int posicionTableroY = (int)y / ALTO_CELDA;
        return new PosicionTablero(posicionTableroX, posicionTableroY);
    }

    private void muevePieza(Pieza piezaEnJuego, PosicionTablero origen, PosicionTablero destino) {
        limpiarCelda(origen.getColumna(), origen.getFila());
        ponerPieza(destino.getColumna(), destino.getFila(), piezaEnJuego);
    }

    class MouseListenerInternal implements MouseListener {
        private PosicionTablero posicionPiezaEnJuego = null;
        private boolean hayPiezaEnJuego = false;
        private Pieza piezaEnJuego = null;

        public void mouseClicked(MouseEvent event) {
            if (hayPiezaEnJuego) {
                double posicionDestinoX = event.getComponent().getX();
                double posicionDestinoY = event.getComponent().getY();
                PosicionTablero posicionDestino = tranformaCoordenadas(posicionDestinoX, posicionDestinoY);

                if (piezaEnJuego.validaMovimiento(posicionPiezaEnJuego, posicionDestino)) {
                    System.out.println("Movimiento válido, moviendo pieza...");
                    muevePieza(piezaEnJuego, posicionPiezaEnJuego, posicionDestino);
                } else {
                    System.out.println("Movimiento inválido, elige otro movimiento");
                }

                tableroDeEtiquetas[posicionPiezaEnJuego.getColumna()][posicionPiezaEnJuego.getFila()].setBorder(null);
                hayPiezaEnJuego = false;
                piezaEnJuego = null;
            } else { // No hay ninguna pieza en juego actualmente, entonces la pieza a la que se le da click ahora está en juego
                double x = event.getComponent().getX();
                double y = event.getComponent().getY();
                posicionPiezaEnJuego = tranformaCoordenadas(x, y);
                System.out.println("Nueva pieza en juego en columna = " + posicionPiezaEnJuego.getColumna() + " fila = " + posicionPiezaEnJuego.getFila());
                piezaEnJuego = tablero[posicionPiezaEnJuego.getColumna()][posicionPiezaEnJuego.getFila()];

                if(piezaEnJuego == null) {
                    return;
                }

                tableroDeEtiquetas[posicionPiezaEnJuego.getColumna()][posicionPiezaEnJuego.getFila()].setBorder(borde);
                hayPiezaEnJuego = true;
            }
        }

        // Cuando el mouse se presionó y se mantuvo presionado
        public void mousePressed(MouseEvent event) {
        }

        // Cuando el mouse dejó de presionarse
        public void mouseReleased(MouseEvent event) {
        }

        // Cuando el mouse está sobre la etiqueta
        public void mouseEntered(MouseEvent event) {
        }

        // Cuando el mouse deja de estar sobre la etiqueta
        public void mouseExited(MouseEvent event) {
        }
    }

}
