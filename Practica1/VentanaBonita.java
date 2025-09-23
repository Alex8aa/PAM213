import javax.swing.*;
import java.awt.*;

public class VentanaBonita extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D lapiz = (Graphics2D) g;

        // Fondo azul claro
        setBackground(new Color(135, 206, 235));

        // Dibujar varias figuras
        dibujarFigura(lapiz, 120, 300, 50);
        dibujarFigura(lapiz, 280, 350, 60);
        dibujarFigura(lapiz, 450, 280, 45);
        dibujarFigura(lapiz, 370, 420, 55);

        // Texto sorpresa
        lapiz.setColor(Color.RED);
        lapiz.setFont(new Font("Serif", Font.BOLD, 36));
        lapiz.drawString("Te amo <3", 200, 100);
    }

    private void dibujarFigura(Graphics2D lapiz, int x, int y, int tamaño) {
        // Parte central vertical
        lapiz.setColor(new Color(34, 139, 34));
        lapiz.fillRect(x - 5, y, 10, 120);

        // Lados
        lapiz.setColor(new Color(50, 205, 50));
        lapiz.fillOval(x - 30, y + 50, 40, 20);
        lapiz.fillOval(x - 10, y + 80, 40, 20);

        // Formas alrededor
        lapiz.setColor(Color.YELLOW);
        int piezas = 12;
        int radio = tamaño;
        for (int i = 0; i < piezas; i++) {
            double angulo = 2 * Math.PI * i / piezas;
            int px = (int) (x + Math.cos(angulo) * radio);
            int py = (int) (y + Math.sin(angulo) * radio);
            lapiz.fillOval(px - tamaño / 2, py - tamaño / 2, tamaño, tamaño);
        }

        // Parte central
        lapiz.setColor(Color.ORANGE);
        lapiz.fillOval(x - tamaño / 2, y - tamaño / 2, tamaño, tamaño);

        // Contorno
        lapiz.setColor(new Color(139, 69, 19));
        lapiz.drawOval(x - tamaño / 2, y - tamaño / 2, tamaño, tamaño);
    }

    public static void main(String[] args) {
        JFrame marco = new JFrame("Sorpresa Bonita");
        VentanaBonita panel = new VentanaBonita();

        marco.add(panel);
        marco.setSize(600, 600);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
}
