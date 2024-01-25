public class Arquero extends Soldado implements Proyectiles {
    private int flechas;
    public SoldadoFlyweight flyweight;

    public Arquero(int f, int c, int s, int e, int nv) {
        super(f, c, s, e, "Arquero", nv, 7, 3);
        flyweight = new ArqueroFlyweight(nv, CANTIDAD_PROY);
    }

    @Override
    public void lanzarProyectil() {
        if (flechas > 0) {
            flechas--;
            super.atacar();
        } else {
            System.out.println("Sin Flechas.");
        }
    }
}

