// Clase Flyweight concreta
public class SoldadoConcretoFlyweight implements SoldadoFlyweight {
    private String nombre;
    private int nivelVida;

    public SoldadoConcretoFlyweight(String nombre, int nivelVida) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Soldado: " + nombre + ", Nivel de Vida: " + nivelVida);
    }
}
