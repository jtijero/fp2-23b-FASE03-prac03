import java.util.*;

public class Espadachin extends Soldado {
    public SoldadoFlyweight flyweight;

    public Espadachin(int f, int c, int s, int e, int nv) {
        super(f, c, s, e, "Espadachin", nv, 10, 8);
        Random rdm = new Random();
        int longEspada = rdm.nextInt(5) + 1;
        flyweight = new EspadachinFlyweight(nv, longEspada);
    }

    public void muroEscudo() {
        super.defender();
        nivelDefensa += 2;
    }
}



