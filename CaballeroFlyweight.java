public class CaballeroFlyweight implements SoldadoFlyweight {
    private int nivelVida;
    private Arma arma;
    

    public CaballeroFlyweight(int nivelVida, Arma arma) {
        this.nivelVida = nivelVida;
        this.arma = arma;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Caballero, Nivel de Vida: " + nivelVida + ", Arma: " + arma);
    }
}