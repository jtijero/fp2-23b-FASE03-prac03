public class EspadachinFlyweight implements SoldadoFlyweight {
    private int nivelVida;
    private int longEspada;

    public EspadachinFlyweight(int nivelVida, int longEspada) {
        this.nivelVida = nivelVida;
        this.longEspada = longEspada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Espadachín, Nivel de Vida: " + nivelVida + ", Longitud de Espada: " + longEspada);
    }
}