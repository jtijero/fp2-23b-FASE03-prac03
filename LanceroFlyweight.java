public class LanceroFlyweight implements SoldadoFlyweight {
    private int nivelVida;
    private int longLanza;

    public LanceroFlyweight(int nivelVida, int longLanza) {
        this.nivelVida = nivelVida;
        this.longLanza = longLanza;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Lancero, Nivel de Vida: " + nivelVida + ", Longitud de Lanza: " + longLanza);
    }
}