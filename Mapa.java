import java.util.*;


public class Mapa {
    private Soldado[][] tablero = new Soldado[10][10];
    private Random rdm = new Random();
    TableroGUI tableroGUI = new TableroGUI();

    public Mapa(Ejercito reino1, Ejercito reino2) {
        generarEjercitos(reino1, 1);
        generarEjercitos(reino2, 2);
        generarTableroSoldados(reino1, reino2);
    }


    private void generarEjercitos(Ejercito r, int ejercito) {
        String reino = obtenerNombreReino();
        r.setReino(reino);
    
        int cant = rdm.nextInt(10);
        for (int i = 0; i <= cant; i++) {
            int op = rdm.nextInt(4);
            int vida = obtenerNivelVida(op, reino);
            boolean x = false;
            int fila;
            int columna;
    
            do {
                fila = rdm.nextInt(10);
                columna = rdm.nextInt(10);
    
                x = r.existeSoldadoEnPosicion(fila, columna) || x;
    
            } while (x);
    
            Soldado soldado = null;
            switch (op) {
                case 0:
                    soldado = new Espadachin(fila, columna, i, ejercito, vida);
                    break;
                case 1:
                    soldado = new Caballero(fila, columna, i, ejercito, vida);
                    break;
                case 2:
                    soldado = new Arquero(fila, columna, i, ejercito, vida);
                    break;
                case 3:
                    soldado = new Lancero(fila, columna, i, ejercito, vida);
            }
    
            if (soldado != null) {
                r.addSoldado(soldado);
            }
        }
    }
    

    private int obtenerNivelVida(int op, String reino) {
        switch (op) {
            case 1:
                return rdm.nextInt(8, 11);
            case 2:
                return rdm.nextInt(10, 13);
            case 3:
                return rdm.nextInt(3, 6);
            case 4:
                return rdm.nextInt(5, 9);
            default:
                return 0;
        }
    }

    private String obtenerNombreReino() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1; 
    
        switch (numeroAleatorio) {
            case 1:
                return "Inglaterra";
            case 2:
                return "Francia";
            case 3:
                return "Castilla";
            case 4:
                return "Moros";
            case 5:
                return "Imperio Romano";
            default:
                return "";
        }
    }

    public void generarTableroSoldados(Ejercito ejercito1, Ejercito ejercito2) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = obtenerSoldadoEnPosicion(ejercito1, ejercito2, i, j);
            }
        }
        tableroGUI.actualizarTablero(tablero);
    }

    private Soldado obtenerSoldadoEnPosicion(Ejercito ejercito1, Ejercito ejercito2, int i, int j) {
        for (Soldado e : ejercito1.getEjercito()) {
            if (e.getFila() == i && e.getColumna() == j)
                return e;
        }
        for (Soldado f : ejercito2.getEjercito()) {
            if (f.getFila() == i && f.getColumna() == j)
                return f;
        }
        return null;
    }

    public void actualizarTableroGUI() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] != null) {
                    String codigoSoldado = tablero[i][j].getCodigo();
                    tableroGUI.setCasillaTexto(i + 1, j + 1, codigoSoldado);
                } else {
                    // Si no hay soldado, se puede establecer algún texto por defecto o dejar en blanco
                    tableroGUI.setCasillaTexto(i + 1, j + 1, "");
                }
            }
        }
    }
    
}
