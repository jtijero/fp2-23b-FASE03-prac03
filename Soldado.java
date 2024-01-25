public class Soldado {
    private int fila;
    private int columna;
    private SoldadoFlyweight soldadoFlyweight;

    public Soldado(int fila, int columna, SoldadoFlyweight soldadoFlyweight) {
        this.fila = fila;
        this.columna = columna;
        this.soldadoFlyweight = soldadoFlyweight;
    }

    public void mostrarInformacionSoldado() {
        soldadoFlyweight.mostrarInformacion();
    }
    private String nombre;
    private String codigo;
    private String posicion;
    protected int nivelAtaque;
    protected int nivelDefensa;
    protected int nivelVida;
    protected int vidaActual;
    private int velocidad = 0;
    String actitud;
    String estado;
    int ejercito;
    boolean vive = true;

    public Soldado(int fila, int columna, int soldadoNumero, int ejercito, String nombre, int nivelVida, int nivelAtaque, int nivelDefensa) {
        this.ejercito = ejercito;
    
        char[] letrasColumna = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char letraColumna = letrasColumna[columna];
    
        posicion = letraColumna + Integer.toString(fila + 1);
    
        if (fila >= 0 && fila < 10 && columna >= 0 && columna < 10) {
            this.fila = fila;
            this.columna = columna;
        } else {
            System.out.println("Valores de fila y columna fuera de rango.");
        }
    
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelVida = nivelVida;
        this.vidaActual = nivelVida;

        this.nombre = nombre;
    
        this.codigo = ejercito + "" + nombre.charAt(0) + vidaActual;
    }
    public void atacar() {
        actitud = "ofensiva";
        avanzar();
    }

    public void defender() {
        actitud = "defiende";
        estado = "";
    }

    public void avanzar() {
        velocidad++;
        estado = "avanzando";
    }

    public void retroceder() {
        if (velocidad > 0)
            defender();
        else
            velocidad--;
    }

    public void serAtacado() {
        vidaActual--;
        if (vidaActual == 0)
            morir();
    }

    public void huir() {
        velocidad += 2;
        actitud = "fuga";
    }

    public void morir() {
        vive = false;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEjercito() {
        return ejercito;
    }
}

