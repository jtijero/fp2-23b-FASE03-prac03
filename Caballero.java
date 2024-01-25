//estado del caballero
enum Arma {
    LANZA, ESPADA
}
enum EstadoCaballero {
    MONTADO, DESMONTADO
}
public class Caballero extends Soldado {
    private Arma arma = Arma.LANZA;
    private EstadoCaballero estado = EstadoCaballero.MONTADO;
    private SoldadoFlyweight flyweight;

    public Caballero(int f, int c, int s, int e, int nv) {
        super(f, c, s, e, "Caballero", nv, 13, 7);
        flyweight = new CaballeroFlyweight(nv, arma);
    }

    public void cambiarArma() {
        arma = (arma == Arma.LANZA) ? Arma.ESPADA : Arma.LANZA;
        flyweight = new CaballeroFlyweight(nivelVida, arma);
    }

    public void desmontar() {
        if (estado == EstadoCaballero.MONTADO) {
            super.defender();
            estado = EstadoCaballero.DESMONTADO;
            cambiarArma();
        } else {
            System.out.println("Caballero ya desmontado");
        }
    }

    public void montar() {
        if (estado == EstadoCaballero.DESMONTADO) {
            super.defender();
            estado = EstadoCaballero.MONTADO;
            cambiarArma();
            embestir();
        } else {
            System.out.println("Caballero ya montado");
        }
    }

    public void embestir() {
        int ataques = (estado == EstadoCaballero.DESMONTADO) ? 2 : 3;

        for (int i = 0; i < ataques; i++) {
            super.atacar();
        }
    }
}

