import javax.swing.*;
import java.awt.*;

public class TableroGUI {
    private JFrame frame;
    private JPanel[][] casillas; 
    private char[] letrasColumna = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}; 

    // Constructor de la clase
    public TableroGUI() {
        frame = new JFrame("Tablero"); 
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(11, 11));

        casillas = new JPanel[11][11];
        inicializarCasillas();
        frame.setVisible(true);
    }
    // Inicializa las celdas del tablero y agrega etiquetas
    private void inicializarCasillas() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillas[i][j] = new JPanel();
                casillas[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));

                // Agregar etiquetas para las letras de las columnas en el borde superior
                if (i == 0 && j > 0) {
                    JLabel letraLabel = new JLabel(Character.toString(letrasColumna[j - 1]), SwingConstants.CENTER);
                    casillas[i][j].add(letraLabel);
                }

                // Agregar etiquetas para los números en el borde izquierdo vertical
                if (j == 0 && i > 0) {
                    JLabel numeroLabel = new JLabel(Integer.toString(i), SwingConstants.CENTER);
                    casillas[i][j].add(numeroLabel);
                }

                frame.add(casillas[i][j]); // Agregar la celda al contenido de la ventana
            }
        }
    }

    //actualizar el texto en una celda específica del tablero
    public void setCasillaTexto(int fila, int columna, String texto) {
        casillas[fila][columna].removeAll(); 
        JLabel textoLabel = new JLabel(texto, SwingConstants.CENTER); 
        casillas[fila][columna].add(textoLabel);
        casillas[fila][columna].revalidate();
        casillas[fila][columna].repaint();
    }
    //actualizar visualmente el tablero con la información de los soldados
    public void actualizarTablero(Soldado[][] tablero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] != null) {
                    String codigoSoldado = tablero[i][j].getCodigo();
                    setCasillaTexto(i + 1, j + 1, codigoSoldado);
                } else {
                    setCasillaTexto(i + 1, j + 1, "");
                }
            }
        }
    }
}
