import javax.swing.SwingUtilities;

public class Videojuego {
    public static void main(String[] args) {
        Runtime runTime = Runtime.getRuntime();
        long freeMemoryBefore = runTime.freeMemory();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartScreenExample();
            }
        });
        long freeMemoryAfter = runTime.freeMemory();
        long usedMemory = freeMemoryBefore - freeMemoryAfter;
        System.out.println("Memoria utilizada por el programa: " + usedMemory + " bytes");
    }
}
