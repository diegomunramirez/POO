package ajedrez;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ajedrez {

    private static int ANCHO_CELDA = 50;// definimos constante/variable de las dimensiones de las celdas
    private static int ALTO_CELDA = 50; //definimos constante/variable de las dimensiones de las celdas
    private static int NUM_FILAS = 8; //definimos constante/variable de las filas
    private static int NUM_COLUMNAS = 8; //definimos constante/variable de las columnas
   
    
    private JFrame frame; //se crea la ventana
    private MouseListenerInternal mouseListener; 
    private Pieza[][] tablero; //se crea arreglo que va a contener
    private JLabel[][] tableroDeEtiquetas; //se crea tablero (arreglo) de etiquetas para poder dibujar tablero 
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
        frame = new JFrame("Ajedrez");
        tableroDeEtiquetas = creaTableroDeEtiquetas();//llamamos funcion para crear el tablero
        tablero = creaTablero();//llamamos la funcion para crear tablero
        borde = BorderFactory.createLineBorder(Color.GREEN,3);
        inicializaPiezasEnElTablero();
        
        frame.setBackground(new Color(240, 240, 240));//le damos color al frame
        frame.setBounds(300,
                        150,
                        NUM_COLUMNAS * ANCHO_CELDA + 50, //le damos tamanio a la ventana depende al numero de columnas (esto por si se desearia agregar mas en un furuto(ingresadas por teclado) la ventana tome las dimensiones adecuadas)
                        NUM_FILAS * ALTO_CELDA + 80 );//le damos tamanio a la ventana depende al numero de filas (esto por si se desearia agregar mas en un furuto(ingresadas por teclado) la ventana tome las dimensiones adecuadas)

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //esto hace que la ejecuccion se detenga cuando se cierra la ventana
        frame.getContentPane().setLayout(null); //nos permite colocar las etiquetas y botones de manera libre en la pantalla
    }

    private void inicializaPiezasEnElTablero(){
    	
    	// Pon el rey en la �ltima fila en la columna 4
        ponerPieza(NUM_COLUMNAS / 2 , NUM_FILAS - 1, new Rey()); //ponemos al rey su casilla inicial como un objeto de su clase
        ponerPieza(NUM_COLUMNAS / 2 - 1, NUM_FILAS - 1, new Dama());
        
        //crea alfiles
        ponerPieza(NUM_COLUMNAS / 2 - 1 - 1, NUM_FILAS - 1, new Alfil());
        ponerPieza(NUM_COLUMNAS / 2 + 1, NUM_FILAS - 1, new Alfil());
        
        //crea caballos
        ponerPieza(NUM_COLUMNAS / 2 - 3, NUM_FILAS - 1, new Caballo());
        ponerPieza(NUM_COLUMNAS / 2 + 2, NUM_FILAS - 1, new Caballo());
        
        //crea torres
        ponerPieza(NUM_COLUMNAS / 2 - 4, NUM_FILAS - 1, new Torre());
        ponerPieza(NUM_COLUMNAS / 2 + 3, NUM_FILAS - 1, new Torre());
        
        //crea peones
        
        
    }
    
    private Pieza[][] creaTablero() {
        Pieza[][] tablero = new Pieza[NUM_COLUMNAS][NUM_FILAS];//se crea el tablero de la clase pieza
        return tablero;
    }

    private void limpiarCelda(int columna, int fila) {
        tablero[columna][fila] = null; //se limpia la celda, es decir se quita la pieza en caso de cumplir las reglas
        tableroDeEtiquetas[columna][fila].setIcon(null); //se limpia la celda, es decir se quita la pieza en caso de cumplir las reglas
    }

    private void ponerPieza(int columna, int fila, Pieza pieza) {
        tablero[columna][fila] = pieza;
        tableroDeEtiquetas[columna][fila].setIcon(pieza.obtenerImagen(ANCHO_CELDA, ALTO_CELDA)); //llama la funcion en clase de rey para colocar la imagen
    }

    
    //crea el arreglo con etiqutas y decidira si seran de color blanco o negro 
    private JLabel[][] creaTableroDeEtiquetas() {
        JLabel[][] tableroDeLabels = new JLabel[NUM_FILAS][NUM_COLUMNAS]; //crea un arreglo de etiquetas para llenarlo

        for (int fila = 0; fila < NUM_FILAS; fila++) {
            boolean colorCelda;

            if (fila % 2 == 0) {
                colorCelda = true; // color negro
            } else {
                colorCelda = false; // color blanco
            }

            for (int col = 0; col < NUM_COLUMNAS; col++) {
                tableroDeLabels[col][fila] = creaCelda(col * ANCHO_CELDA, fila * ALTO_CELDA, colorCelda); //envia los parametros a la funcion de crear celda para darle sus caracteristicas
                colorCelda = !colorCelda; //se da un valor contrario al que tiene, es decir si es true, se convierte en false
            }
        }

        return tableroDeLabels; //devuelve el tablero con las etiquetas
    }
      //crea las celdas y las colorea de blanco o negro
    private JLabel creaCelda(int coordenadaX, int coordenadaY, boolean esColorNegro) {
        JLabel label = new JLabel("");
        label.setOpaque(true);
        label.setBounds(coordenadaX, coordenadaY, ANCHO_CELDA, ALTO_CELDA);
        if (esColorNegro == true) {
            label.setBackground(Color.BLACK); //colorea la celda depende a el tablero
        } else {
            label.setBackground(Color.WHITE);//colorea la celda depende a el tablero
        }
        label.addMouseListener(mouseListener); //se aniade a la etiqueta funcion/clase para escuchar los evento del mouse

        frame.getContentPane().add(label);
        return label; //regresa la label con las caracteriscas depende al tablero
    }

    private PosicionTablero tranformaCoordenadas(double x, double y) { //transforma las coordenadas de la posicion en pixeles de las etiquetas a coordenadas de tablero/arreglo (es decir x = 1,y = 2,por ejemplo)
        int posicionTableroX = (int)x / ANCHO_CELDA; //se hace la transformacion ejemplo: x =150 (esto en pixeles)se divide entre la dimension  de la celda (150/50 = 3) es decir la coordenada x = 3 en el tablero 
        int posicionTableroY = (int)y / ALTO_CELDA;//se hace la transformacion ejemplo: y =100 (esto en pixeles)se divide entre la dimension  de la celda (100/50 = 3) es decir la coordenada y = 2 en el tablero, por lo que el ejemplo las coordenadas serian x=3,y =2 en el tablero
        return new PosicionTablero(posicionTableroX, posicionTableroY); //regresa las coordenadas de tablero/arreglo (ejemplo 2,3)
    }

    private void muevePieza(Pieza piezaEnJuego, PosicionTablero origen, PosicionTablero destino) {
        limpiarCelda(origen.getColumna(), origen.getFila());
        ponerPieza(destino.getColumna(), destino.getFila(), piezaEnJuego);
    }

    class MouseListenerInternal implements MouseListener { //esto detecta los eventos del mouse, en este caso seria sobre las etiquetas
        private PosicionTablero posicionPiezaEnJuego = null;
        private boolean hayPiezaEnJuego = false;
        private Pieza piezaEnJuego = null;

        public void mouseClicked(MouseEvent event) { //este es un evento al momento de dar click 
            if (hayPiezaEnJuego) {
                double posicionDestinoX = event.getComponent().getX();//se obtiene la posicion de destino en x de la etiqueta
                double posicionDestinoY = event.getComponent().getY();//se obtiene la posicion de destino en y de la etiqueta
                PosicionTablero posicionDestino = tranformaCoordenadas(posicionDestinoX, posicionDestinoY);//se convierten a coordenadas de tablero/arreglo

                if (piezaEnJuego.validaMovimiento(posicionPiezaEnJuego, posicionDestino, tablero)) {//manda los parametros para ver si cumple las reglas del juego
                    System.out.println("Movimiento v�lido, moviendo pieza...");
                    muevePieza(piezaEnJuego, posicionPiezaEnJuego, posicionDestino); //llama a la funcion para limpiar la celda/casilla y por consiguiente se coloca en la nueva posicion
                } else {
                    System.out.println("Movimiento inv�lido, elige otro movimiento");//esto cuando se quiere trasladar a una casilla que y no cumple las reglas
                }
                tableroDeEtiquetas[posicionPiezaEnJuego.getColumna()][posicionPiezaEnJuego.getFila()].setBorder(null);//quita el borde a la "pieza seleccionada"
                hayPiezaEnJuego = false;
                piezaEnJuego = null;
            } else { // No hay ninguna pieza en juego actualmente, entonces la pieza a la que se le da click ahora est� en juego
                double x = event.getComponent().getX(); //toma coordenadas en x de la casilla seleccionada
                double y = event.getComponent().getY();//toma coordenadas en y de la casilla seleccionada
                posicionPiezaEnJuego = tranformaCoordenadas(x, y); //llama a funcion para transformar en coordenadas de tablero
                
                
                System.out.println("Nueva pieza en juego en columna = " + posicionPiezaEnJuego.getColumna() + " fila = " + posicionPiezaEnJuego.getFila());
                piezaEnJuego = tablero[posicionPiezaEnJuego.getColumna()][posicionPiezaEnJuego.getFila()];

                if(piezaEnJuego == null) {
                    return;
                }
                                 
                tableroDeEtiquetas[posicionPiezaEnJuego.getColumna()][posicionPiezaEnJuego.getFila()].setBorder(borde);//coloca un borde verde simulando pieza seleccionada
                hayPiezaEnJuego = true;
            }
        }

        // Cuando el mouse se presion� y se mantuvo presionado
        public void mousePressed(MouseEvent event) {
        }

        // Cuando el mouse dej� de presionarse
        public void mouseReleased(MouseEvent event) {
        }

        // Cuando el mouse est� sobre la etiqueta
        public void mouseEntered(MouseEvent event) {
        }

        // Cuando el mouse deja de estar sobre la etiqueta
        public void mouseExited(MouseEvent event) {
        }
    }

}
