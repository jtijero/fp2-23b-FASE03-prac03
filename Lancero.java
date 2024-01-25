import java.util.Random;
public class Lancero extends Soldado{
    int longLanza;
    public SoldadoFlyweight flyweight;

    public Lancero(int f, int c, int s, int e, int nv) {
        super(f, c, s, e, "Lancero", nv, 5, 10);
        Random rdm = new Random();
        int longLanza = rdm.nextInt(5) + 1;
        flyweight = new LanceroFlyweight(nv, longLanza);
    }
    public void schiltrom() {
        nivelDefensa++;
    }
}