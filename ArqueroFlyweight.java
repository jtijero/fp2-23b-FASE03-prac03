public class ArqueroFlyweight implements SoldadoFlyweight {
    private int nivelVida;
    private int flechas;

    public ArqueroFlyweight(int nivelVida, int flechas) {
        this.nivelVida = nivelVida;
        this.flechas = flechas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Arquero, Nivel de Vida: " + nivelVida + ", Flechas Restantes: " + flechas);
    }
}
