import java.util.*;

public class Ejercito {
    private String reino;
    private ArrayList<Soldado> ejercito = new ArrayList<Soldado>();
    private String nombre;

    public Ejercito(String r) {
        reino = r;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Soldado> getEjercito() {
        return ejercito;
    }

    public void addSoldado(Soldado x) {
        ejercito.add(x);
    }

    public boolean existeSoldadoEnPosicion(int fila, int columna) {
        for (Soldado soldado : ejercito) {
            if (soldado.getFila() == fila && soldado.getColumna() == columna) {
                return true;
            }
        }
        return false;
    }

}

