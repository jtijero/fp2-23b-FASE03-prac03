import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreenExample extends JFrame {

    public StartScreenExample() {
        Ejercito e1 = new Ejercito(null);
        Ejercito e2 = new Ejercito(null);
        Mapa tablero = new Mapa(e1, e2);
        setTitle("Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        JPanel startScreen = new JPanel();
        startScreen.setLayout(new BorderLayout());

        ImageIcon imageIcon = new ImageIcon("videojuego.png");
        JLabel imageLabel = new JLabel(imageIcon);
        startScreen.add(imageLabel, BorderLayout.CENTER);

        JButton jugarButton = new JButton("Jugar");
        jugarButton.setBackground(new Color(139, 0, 0));
        jugarButton.setForeground(Color.WHITE);
        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Cierra la ventana actual
                tablero.actualizarTableroGUI();
            }
        });

        startScreen.add(jugarButton, BorderLayout.SOUTH);
        add(startScreen);
        setVisible(true);
    }
}
